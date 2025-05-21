<!-- 
9b. Read all the existing records from the table coffee which is from the database test and 
query coffee name starting with ‘D’ in the table using HTML and JSP to get the field and 
display the results respectively.
-->

<%@ page import="java.sql.*" %> <%-- Import Java SQL package --%>

<html>
<head>
    <title>CoffeeQueryStartingWithD</title> <%-- Changed page title (class name style) --%>
</head>
<body>

<h2>Coffee Products Starting With 'D'</h2> <%-- Page heading --%>

<%
    // Declare JDBC objects
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        // Load MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the 'test' database using root user
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

        // SQL query to get coffee names starting with 'D'
        String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        st = conn.createStatement();
        rs = st.executeQuery(query); // Execute query

        boolean found = false; // Flag to check if any records are found

        // Iterate through result set and display records
        while (rs.next()) {
            found = true;
%>
            <hr>
            ID: <%= rs.getInt("id") %><br>
            Name: <%= rs.getString("coffee_name") %><br>
            Price: <%= rs.getDouble("priced") %><br>
<%
        }

        // If no records found
        if (!found) {
            out.println("<p>No coffee products starting with 'D' found.</p>");
        }

    } catch (Exception e) {
        // Catch and display any errors
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        // Properly close all database resources
        if (rs != null) rs.close();
        if (st != null) st.close();
        if (conn != null) conn.close();
    }
%>

</body>
</html>
