<%-- 
    Document   : welcome
    Created on : 22-feb-2015, 12:48:13
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>miBiblio | Bienvenido</title>
    </head>
    <body>
        <h1>Bienvenido!</h1>
        <h2><s:property value="messageStore.message" /></h2>
    </body>
</html>
