<%-- 
    Document   : navbar
    Created on : 09-feb-2015, 13:22:13
    Author     : dgarcia25
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-fixed-top navbar-inverse">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Menú oculto</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            <a class="navbar-brand" href="./index.jsp"><span class="glyphicon glyphicon-book" aria-hidden="true"></span>&nbsp;&nbsp;miBiblio</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="#">Gestionar</a></li>
            <li><a href="./busqueda.htm">Buscar</a></li>
            <li><a href="#about">Sobre nosotros</a></li>
            <li><a href="#contact">Contacto</a></li>
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </nav><!-- /.navbar -->