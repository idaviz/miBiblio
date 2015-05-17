<!-- Librer�as -->
<%@ include file="/WEB-INF/jsp/inc/include.jsp" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="struts2, twitter, bootstrap, plugin, showcase" />
        <meta name="description" content="A Showcase for the Struts2 Bootstrap Plugin" />
        <title><s:text name="detail.title" /></title>

        <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
        <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <sb:head includeScripts="false" includeScriptsValidation="false"/>
        <style type="text/css">
            body {
                padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
            }
            .jumbotron {
                margin-bottom: 0px;
                background-image: url(./pics/libros.jpg);
                background-position: 0% 25%;
                background-size: cover;
                background-repeat: no-repeat;
                color: white;
                text-shadow: black 0.9em 0.9em 0.9em;
            }
        </style>
    </head>
    <body>
        <!-- Barra de navegaci�n -->
        <%@ include file="/WEB-INF/jsp/inc/navbar.jsp" %>

        <div class="container">

            <!-- Soporte para internacionalizaci�n -->
            <s:url id="inventoryEN" namespace="/" action="locale" >
                <s:param name="request_locale" >en</s:param>
            </s:url>
            <s:url id="inventoryES" namespace="/" action="locale" >
                <s:param name="request_locale" >es</s:param>
            </s:url>
            <!-- Fin soporte para internacionalizaci�n -->

            <div class="col-xs-12 col-sm-9">
                <p class="pull-right visible-xs">
                    <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
                </p>
                <div class="jumbotron">
                    <h1><span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>&nbsp;&nbsp;<s:text name="menu.aboutus" /></h1>
                    <p></p>
                </div>
                <br>
                <h2><s:text name="menu.aboutus" /></h2>    
                <p>
                    <strong>miBiblio</strong> es fruto de un proyecto para la asignatura Desarrollo de Aplicaciones Web II, de la Universidad Cat�lica de �vila y perteneciente al Grado en Sistemas de la Informaci�n.
                </p>
                <p>
                    La plataforma est� desarrollada �ntegramente con tecnolog�a JEE 7 y el framework de desarrollo Struts2.
                </p>

                <br>

                <%@ include file="/WEB-INF/jsp/inc/footer.jsp" %>
            </div>
        </div>
    </body>
</html>