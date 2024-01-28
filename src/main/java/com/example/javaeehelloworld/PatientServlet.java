package com.example.javaeehelloworld;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PatientServlet", urlPatterns = {"/CreateAssistant"})
public class PatientServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Authentication logic here...

        // For now, just redirect to the new assistant page
        response.sendRedirect("get_patients.html");

    }
}


