/*6c. Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.*/
package com.factorial;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")

public class PrimeServletChecker extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><head><title>Prime Checker</title></head><body>");
            out.println("<h2>Number Entered: " + number + "</h2>");
            if (isPrime) {
                out.println("<p style='color:blue;'>" + number + " is a Prime Number.</p>");
            } else {
                out.println("<p style='color:red;'>" + number + " is NOT a Prime Number.</p>");
            }
            out.println("<a href='index.html'>Check another number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<p style='color:red;'>Invalid input. Please enter a valid number.</p>");
            out.println("<a href='index.html'>Try again</a>");
            out.println("</body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
