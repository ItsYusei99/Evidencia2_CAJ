# Evidencia 2 — App web Java (Servlets/JSP)

Evidencia académica: aplicación web Java empaquetada como `war` que implementa una **calculadora de IMC** con validación de entrada.

## Tecnologías

- Java + **Jakarta Servlets / JSP**
- Maven (incluye wrapper `mvnw`)
- JUnit 5

## Qué implementa

- `model/Persona.java` — modelo de datos (peso, altura).
- `controller/CalcularIMCServlet.java` — cálculo del IMC y despacho a la vista.
- `filter/ValidacionFilter.java` — validación de parámetros antes del servlet.
- `index.jsp` / `resultado.jsp` — formulario y vista de resultado.

## Compilar

```bash
./mvnw package   # en Windows: mvnw.cmd package
```

El `war` generado se despliega en un contenedor compatible con Jakarta (ej. Tomcat 10+).

## Notas

Proyecto con fines académicos (Universidad Tecmilenio).
