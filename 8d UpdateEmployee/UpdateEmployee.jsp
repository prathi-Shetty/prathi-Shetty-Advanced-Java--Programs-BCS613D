<!-- 
    8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
    the table Emp of the database Employee using HTML and JSP to get the fields and display the
    results respectively 
-->

<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>

<h2>Update Employee Details</h2>
<form method="post">
    Emp No: <input type="text" name="empno" required><br><br>
    New Name: <input type="text" name="empname" required><br><br>
    New Basic Salary: <input type="text" name="basicsalary" required><br><br>
    <input type="submit" value="Update">
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

        String sql = "UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, empname);
        ps.setInt(2, basicsalary);
        ps.setInt(3, empno);

        int updated = ps.executeUpdate();
        if (updated > 0) {
            out.println("<h3 style='color:green;'>Record updated successfully!</h3>");
        } else {
            out.println("<h3 style='color:red;'>No record found with Emp_No " + empno + ".</h3>");
        }
    }

    // Report section: Display all employee records
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
    out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
} finally {
    if (rs != null) rs.close();
    if (ps != null) ps.close();
    if (st != null) st.close();
    if (conn != null) conn.close();
}
%>

</body>
</html>
