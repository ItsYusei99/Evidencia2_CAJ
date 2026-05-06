package com.itsyusei99.evidencia2.controller;

import com.itsyusei99.evidencia2.model.Persona;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/CalcularIMC")
public class CalcularIMCServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Sesión (Saludo personalizado)
        HttpSession session = request.getSession();
        session.setAttribute("nombreUsuario", "itsyusei99");

        // 2. Modelo
        Persona persona = new Persona();
        persona.setPeso(Double.parseDouble(request.getParameter("peso")));
        persona.setAltura(Double.parseDouble(request.getParameter("altura")));

        // 3. Cookies (Guardar último IMC)
        String resultadoImc = String.format("%.2f", persona.getImc());
        Cookie ck = new Cookie("historialIMC", resultadoImc);
        ck.setMaxAge(60 * 60 * 24); // 24 horas
        response.addCookie(ck);

        request.setAttribute("persona", persona);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}