<!-- 
    8a. Q1. Read all the existing records from the table `coffee` which is from the database `test` 
    and insert a new coffee product into it. 
    [Create a table coffee with fields (id, coffee_name, priced)] 
    using HTML and JSP to get the fields and display the results respectively.
-->

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Insert Coffee</title></head>
<body>

<h2>Add New Coffee Product</h2>

<!-- Form to insert a new coffee product -->
<form method="post">
    Coffee ID: <input type="text" name="id"><br>
    Coffee Name: <input type="text" name="coffee_name"><br>
    Priced: <input type="text" name="priced"><br>
    <input type="submit" name="action" value="Insert">
</form>

<%
    // Retrieve form parameters
    String action = request.getParameter("action");
    String id = request.getParameter("id");
    String coffeeName = request.getParameter("coffee_name");
    String priced = request.getParameter("priced");

    // Declare DB resources
    Connection conn = null;
    PreparedStatement pst =
