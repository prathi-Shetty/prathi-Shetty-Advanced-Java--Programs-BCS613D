/*<!--9a. Read all the existing records from the table coffee which is from the database test and delete an existing coffee product from the table with its id and 
display the rest of the records using HTML and JSP to get the field and display the results respectively -->*/
<%@ page import="java.sql.*" %> <%-- Importing necessary SQL classes --%>

<html>
<head>
    <title>Coffee Inventory Management</title> <%-- Page title --%>
</head>
<body>

<h2>Delete Coffee Product by ID</h2> <%-- Heading displayed on the page --%>

<%-- Form to accept the ID of the coffee product to be deleted --%>
<form method="post">
    Enter Coffee ID to Delete: <input type="text" name="id" required><br><br>
    <input type="submit" name="action" value="Delete">
</form>

<%
String action = request.getParameter("action"); // Get the button action
String id = request.getParameter("id");         // Get the ID entered by user

// Declare JDBC components
Connection conn = null;
PreparedStatement pst = null;
Statement st = null;
ResultSet rs = null;

try {
    // Load JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Establish connection to 'test' database
    conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

    // Check if form was submitted with action "Delete"
    if ("Delete".equals(action)) {
        // Prepare delete SQL query
        String deleteSQL = "DELETE FROM coffee WHERE id = ?";
        pst = conn.prepareStatement(deleteSQL);
        pst.setInt(1, Integer.parseInt(id)); // Set the ID value in the query
        int rows = pst.executeUpdate(); // Execute delete

        // Display result message
        if (rows > 0)
            out.println("<p style='color:green;'>Coffee product with ID " + id + " deleted successfully!</p>");
        else
            out.println("<p style='color:red;'>No coffee product found with ID " + id + ".</p>");
    }

    // Display remaining coffee records
    out.println("<h3>Available Coffee Products</h3>");
    st = conn.createStatement(); // Create a Statement object
    rs = st.executeQuery("SELECT * FROM coffee"); // Execute query to retrieve records

    // Generate an HTML table with results
    out.println("<table border='1' cellpadding='5' cellspacing='0'>");
    out.println("<tr><th>ID</th><th>Name</th><th>Price</th></tr>");
    while (rs.next()) {
        out.println("<tr>");
        out.println("<td>" + rs.getInt("id") + "</td>");
        out.println("<td>" + rs.getString("coffee_name") + "</td>");
        out.println("<td>" + rs.getDouble("priced") + "</td>");
        out.println("</tr>");
    }
    out.println("</table>");

} catch (Exception e) {
    // Print error message if any exception occurs
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
} finally {
    // Close resources to prevent memory leaks
    if (rs != null) rs.close();
    if (pst != null) pst.close();
    if (st != null) st.close();
    if (conn != null) conn.close();
}
%>

</body>
</html>
