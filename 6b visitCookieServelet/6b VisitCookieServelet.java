/* 
6b. Build a servlet program to create a cookie to get your name through a text box and press the submit button (through HTML) to display the message by greeting: "Welcome back, your name!",  "You have visited 
this page n times" (n = number of your visit),  and demonstrate the expiry of the cookie also. */

package com.cookieservlet;

// Step 1: Required imports
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Step 2: Create servlet class and use WebServlet annotation
@WebServlet("/VisitCookieServlet")
public class VisitCookieServlet extends HttpServlet {
    // Count variable to simulate visit count (note: this is per servlet instance, not per user)
    int count = 0;

    // Step 3: Handle GET requests
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Step 4: Get the username from request if submitted
        String userName = request.getParameter("userName");
        if (userName != null && !userName.isEmpty()) {
            // Step 5: Create a cookie for username
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60); // Cookie expires in 60 seconds (1 minute)
            userCookie.setPath("/");

            // Step 6: Add the cookie to the response
            response.addCookie(userCookie);
        }

        // Step 7: Retrieve existing cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                    break;
                }
            }
        }

        // Step 8: Generate HTML response
        out.println("<html>");
        out.println("<head><title>Cookie Example</title></head>");
        out.println("<body>");

        if (existingUser != null) {
            count += 1;
            out.println("<font color=blue><h2>Welcome back, " + existingUser + "!</h2></font>");
            out.println("<font color=magenta><h2>You have visited this page " + count + " times!</h2></font>");
            out.println("<form action='VisitCookieServlet' method='post'>");
            out.println("<input type='submit' value='Logout (Delete Cookie)'>");
            out.println("</form>");
        } else {
            // Display form to enter the name
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form action='VisitCookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    // Step 9: Handle POST requests to delete the cookie (logout)
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Delete the cookie by setting its max age to 0
        Cookie cookie = new Cookie("user", "");
        cookie.setMaxAge(0); // Remove immediately
        cookie.setPath("/");
        response.addCookie(cookie);

        // Redirect back to the servlet (will now show Guest form)
        response.sendRedirect("VisitCookieServlet");
    }
}
