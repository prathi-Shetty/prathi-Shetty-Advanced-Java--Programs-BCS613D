<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- 
    Assignment 9d:
    Develop a JDBC project using MySQL to delete the records in the table `Emp` 
    of the database `Employee` by getting the name starting with ‘S’ through keyboard, 
    and generate the report as follows using HTML and JSP to get the field and display the results respectively.
-->

<!DOCTYPE html>
<html>
<head>
    <title>Delete Employees with Name Starting with 'S'</title>
</head>
<body>

<h2>Delete Employees Whose Names Start with 'S'</h2>

<!-- Form to trigger the deletion process -->
<form method="post">
    <input type="submit" name="delete" value="Delete Employees with Name 'S%'">
</form>

<%
    // Declare JDBC-related objects
    Connection conn = null;
    PreparedStatement deleteStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;
    int deletedCount = 0;

    try {
        // Step 1: Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish connection with the database
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        // Step 3: If the delete button is clicked
        if (request.getParameter("delete") != null) {

            // Step 4: Prepare and execute delete query for names starting with 'S'
            String deleteQuery = "DELETE FROM Emp WHERE Emp_Name LIKE 'S%'";
            deleteStmt = conn.prepareStatement(deleteQuery);
            deletedCount = deleteStmt.executeUpdate(); // Returns number of records deleted

            // Step 5: Show deletion status
            if (deletedCount > 0) {
                out.println("<p style='color:green;'><b>" + deletedCount + "</b> employee(s) deleted successfully.</p>");
            } else {
                out.println("<p style='color:orange;'>No employees found with names starting with 'S'.</p>");
            }
        }

        // Step 6: Generate updated report of employees
        out.println("<h2>Updated Employee Report</h2><hr>");
        selectStmt = conn.createStatement();
        rs = selectStmt.executeQuery("SELECT * FROM Emp");

        int totalSalary = 0; // Variable to calculate grand salary

        // Step 7: Display employee records
        while (rs.next()) {
            int empno = rs.getInt("Emp_NO");
            String name = rs.getString("Emp_Name");
            int salary = rs.getInt("Basicsalary");

            out.println("Emp_No: " + empno + "<br>");
            out.println("Emp_Name: " + name + "<br>");
            out.println("Basic Salary: " + salary + "<br><hr>");

            totalSalary += salary; // Add to grand total
        }

        // Step 8: Display grand total salary
        out.println("<h3>Grand Total Salary: " + totalSalary + "</h3>");

    } catch (Exception e) {
        // Step 9: Display any exception that occurs
        out.println("<p style='color:red;'>❌ Error: " + e.getMessage() + "</p>");
    } finally {
        // Step 10: Clean up and close all JDBC objects
        try {
            if (rs != null) rs.close();
            if (selectStmt != null) selectStmt.close();
            if (deleteStmt != null) deleteStmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            out.println("<p style='color:red;'>❌ Closing Error: " + e.getMessage() + "</p>");
        }
    }
%>

</body>
</html>
