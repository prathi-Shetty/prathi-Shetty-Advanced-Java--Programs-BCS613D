<!-- 
    8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
    into the table Emp of the database Employee by getting the fields through keyboard and
    Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary )
    using HTML and JSP to get the fields and display the results respectively
-->

<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Insert Employee</title>
</head>
<body>

<h2>Enter Employee Details</h2>
<form method="post">
    Emp No: <input type="text" name="empno" required><br>
    Name: <input type="text" name="empname" required><br>
    Basic Salary: <input type="text" name="basicsalary" required><br>
    <input type="submit" value="Insert">
</form>

<%
    String empnoStr = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalaryStr = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");

        if (empnoStr != null && empname != null && basicsalaryStr != null) {
            int empno = Integer.parseInt(empnoStr);
            int basicsalary = Integer.parseInt(basicsalaryStr);

            String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, empno);
            ps.setString(2, empname);
            ps.setInt(3, basicsalary);
            ps.executeUpdate();

            out.println("<p style='color:green;'>Record inserted successfully!</p>");
        }

        // Report - Display all employees
        out.println("<h3>Employee Records</h3>");
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM Emp");

        out.println("<table border='1'>");
        out.println("<tr><th>Emp No</th><th>Name</th><th>Basic Salary</th></tr>");

        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("Emp_NO") + "</td>");
            out.println("<td>" + rs.getString("Emp_Name") + "</td>");
            out.println("<td>" + rs.getInt("Basicsalary") + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (st != null) st.close();
        if (conn != null) conn.close();
    }
%>

</body>
</html>
