package com.itsyusei99.evidencia2.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/CalcularIMC")
public class ValidacionFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String p = request.getParameter("peso");
        String a = request.getParameter("altura");

        try {
            double peso = Double.parseDouble(p);
            double altura = Double.parseDouble(a);

            // Validación de rango (40 - 300)
            if (peso < 40 || peso > 300 || altura < 40 || altura > 300) {
                request.setAttribute("error", "Los valores deben estar entre 40 y 300");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                chain.doFilter(request, response); // Todo bien, continúa al Servlet
            }
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Error: Ingresa solamente números");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}