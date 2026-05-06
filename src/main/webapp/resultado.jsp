<%--
  Created by IntelliJ IDEA.
  User: yuseigarcia
  Date: 05/05/26
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Resultado para ${sessionScope.nombreUsuario}</h2>
<p>Peso: ${persona.peso} kg</p>
<p>Altura: ${persona.altura} cm</p>
<p><strong>IMC: ${persona.imc}</strong></p>
<p>Estado: ${persona.nivel}</p>
<a href="index.jsp">Volver</a>
</body>
</html>