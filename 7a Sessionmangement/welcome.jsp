<!-- 
    7a. Build a Session Management using JSP program set with one-minute session expiry time 
    to get your name through a text box and press submit to display the message 
    by greeting "Hello your name!". Check the expiry of the session after one minute.
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Management Example</title>
</head>
<body>

<%
    // Step 1: Retrieve the name entered from the request parameter
    String name = request.getParameter("uname");

    // Step 2: Greet the user
    out.print("Welcome! " + name);

    // Step 3: Display session initiation message
    out.print("<br>Session has started ... " + name);

    // Step 4: Store the user's name in the session object
    session.setAttribute("user", name);

    // Step 5: Inform the user that their name has been stored in the session
    out.print("<br>Your name has been stored in the session object");

    // Step 6: Set session expiration time to 60 seconds (1 minute)
    session.setMaxInactiveInterval(60);

    // Step 7: Inform the user about session expiry time
    out.print("<br>One minute is set for the session expiry");

    // Step 8: Provide a link to another JSP page to display session value
    out.print("<br>Kindly press the following link to check it<br>");
%>

<!-- Link to second.jsp to test if session value is retained -->
<a href="second.jsp">Display the value</a>

</body>
</html>
