<!-- 
9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and generate
the report as follows for the table Emp (Emp_NO, Emp_Name, Basicsalary) using HTML and JSP to 
get the field and display the results respectively.
-->

<%@ page import="java.sql.*" %> <%-- Import SQL classes --%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>InsertEmployee</title> <%-- Page title following class name format --%>
</head>
<body>

<h2>Insert New Employee</h2>

<!-- HTML form to collect employee data -->
<form method="post">
    Emp No: <input type="text" name="empno"><br>
    Emp Name: <input type="text" name="empname"><br>
    Basic Salary: <input type="text" name="basicsalary"><br>
    <input type="submit" name="action" value="Insert">
</form>

<%
    // Get the form action from the request
    String action = request.getParameter("action");

    // Declare JDBC objects
    Connection conn = null;
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;
    int totalSalary = 0;

    try {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the 'Employee' database
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");

        // If the form was submitted
        if ("Insert".equals(action)) {
            String empno = request.getParameter("empno");
            String empname = request.getParameter("empname");
            String basicsalary = request.getParameter("basicsalary");

            // Check if all fields are filled
            if (empno != null && empname != null && basicsalary != null &&
                !empno.isEmpty() && !empname.isEmpty() && !basicsalary.isEmpty()) {

                // Prepare and execute insert query
                String insertQuery = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
                pst = conn.prepareStatement(insertQuery);
                pst.setInt(1, Integer.parseInt(empno));
                pst.setString(2, empname);
                pst.setInt(3, Integer.parseInt(basicsalary));

                int rows = pst.executeUpdate();

                if (rows > 0) {
                    out.println("<p style='color:green;'>Record inserted successfully!</p>");
                } else {
                    out.println("<p style='color:red;'>Failed to insert record.</p>");
                }
            } else {
                out.println("<p style='color:red;'>Please fill in all fields.</p>");
            }
        }

        // Display Employee Salary Report
        out.println("<h2>Employee Salary Report</h2>");
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM Emp");

        // Loop through and display employee records
        while (rs.next()) {
            int id = rs.getInt("Emp_NO");
            String name = rs.getString("Emp_Name");
            int salary = rs.getInt("Basicsalary");
            totalSalary += salary;
%>
            <hr>
            Emp_No: <%= id %><br>
            Emp_Name: <%= name %><br>
            Basic Salary: <%= salary %><br>
<%
        }
        // Display total salary
        out.println("<hr><b>Grand Salary Total: " + totalSalary + "</b><hr>");

    } catch (Exception e) {
        // Handle any exceptions
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        // Close JDBC resources
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (st != null) st.close();
        if (conn != null) conn.close();
    }
%>

</body>
</html>
