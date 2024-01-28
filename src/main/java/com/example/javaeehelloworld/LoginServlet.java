package com.example.javaeehelloworld;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Authentication logic here...

        // For now, just redirect to the new assistant page
        response.sendRedirect("new_assistant.html");
    }
}
