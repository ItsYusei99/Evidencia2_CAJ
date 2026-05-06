<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>Bienvenido, ${sessionScope.nombreUsuario != null ? sessionScope.nombreUsuario : "Invitado"}</h1>
<form action="CalcularIMC" method="POST">
    Peso (kg): <input type="text" name="peso"><br>
    Altura (cm): <input type="text" name="altura"><br>
    <input type="submit" value="Calcular IMC">
</form>
<p style="color:red;">${error}</p>

<hr>
<%
    Cookie[] cookies = request.getCookies();
    String ultimo = "Sin registros";
    if(cookies != null) {
        for(Cookie c : cookies) if(c.getName().equals("historialIMC")) ultimo = c.getValue();
    }
%>
<p>Último cálculo guardado (Cookie): <%= ultimo %></p>
</body>
</html>