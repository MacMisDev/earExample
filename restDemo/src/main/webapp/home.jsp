<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Calculator!</title>
    </head>
    <body>
        <form method="post" name="form" action="${pageContext.request.contextPath}/">
            <table>
                <tr>
                    <td>Liczba 1: </td>
                    <td><input type="text" name="number1" /></td>
                </tr>
                <tr>
                    <td>Liczba 2: </td>
                    <td><input type="text" name="number2" /></td>
                </tr>
                <tr>
                    <td><input type="radio" value="+" name="operation" checked />+</td>
                    <td><input type="radio" value="-" name="operation" />-</td>
                </tr>
                <tr>
                    <td><input type="radio" value="/" name="operation" />/</td>
                    <td><input type="radio" value="*" name="operation" />*</td>
                </tr>
            </table>
            <input type="submit" name="count" value="Oblicz" />

        </form>
        <div>
            <p>Wynik: ${result}</p>
            <p>${error}</p>
        </div>
    </body>
</html>
