package com.example.javaeehelloworld;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
//@WebServlet(name = "loginServlet", value = "/Login")

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Use a RequestDispatcher to include content from login.html
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.html");
        if (dispatcher != null) {
            dispatcher.include(request, response);
        } else {
            // Fallback to writing the message directly if login.html is not found
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("</body></html>");
        }
    }


    // Add a doPost method to handle the login form submission
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Assume we just print out the username for this example
        String username = request.getParameter("username");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Welcome, " + username + "!</h1>");
        out.println("</body></html>");

        // After login is handled, redirect to the registration page
        response.sendRedirect("new_assistant.html");
    }

    public void destroy() {
    }
}



