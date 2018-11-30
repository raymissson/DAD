<%-- 
    Document   : index
    Created on : 30/11/2018, 16:00:38
    Author     : Raymison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="POST" action="http://localhost:8080/Dad-2018-jaxrs-service/rest/cidade/inserir/" enctype="application/x-www-form-urlencoded">
            
		<label name="id">Id</label>
                    <input type="text" name="id">
                <label name="cidade">Cidade</label>
                    <input type="text" name="cidade">
                <label name="estado">Estado</label>
                    <input type="text" name="estado">
                <button type="submit" >Enviar</button>
            
        </form>
    </body>
</html>
