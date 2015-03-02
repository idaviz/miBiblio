<!-- Librerías -->
<%@ include file="/WEB-INF/jsp/inc/include.jsp" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="struts2, twitter, bootstrap, plugin, showcase" />
        <meta name="description" content="A Showcase for the Struts2 Bootstrap Plugin" />
        <title><s:text name="inventory.title" /></title>

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
        <!-- Barra de navegación -->
        <%@ include file="/WEB-INF/jsp/inc/navbar.jsp" %>

        <div class="container">

            <!-- Soporte para internacionalización -->
            <s:url id="inventoryEN" namespace="/" action="locale" >
                <s:param name="request_locale" >en</s:param>
            </s:url>
            <s:url id="inventoryES" namespace="/" action="locale" >
                <s:param name="request_locale" >es</s:param>
            </s:url>
            <!-- Fin soporte para internacionalización -->            

            <div class="col-xs-12 col-sm-9">
                <p class="pull-right visible-xs">
                    <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
                </p>
                <div class="jumbotron">
                    <h1><span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> <s:text name="inventory.title" /></h1>
                    <p></p>
                </div>
                <br>

                <br>
                <!-- Tabla de resultados -->

                <s:iterator value="listaObras" status="linea">
                    <div class="media">
                        <div class="media-left media-top">
                            <a href="#">
                                <img class="media-object" src="./resources/<s:property value="ruta_portada"/>" alt="imagen">
                            </a>
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading"><s:property value="titulo"/></h4>
                            <p><s:property value="subtitulo"/><br> [<s:property value="id_tb_obra"/>][<s:property value="isbn"/>]<br><s:property value="idioma"/> <s:property value="nivel_mre"/>. </p>
                                <s:url action="detail" var="detailInputLink">
                                    <s:param name="id_tb_obra" value="id_tb_obra"/>
                                    <s:param name="titulo" value="titulo"/>
                                    <s:param name="subtitulo" value="subtitulo"/>
                                    <s:param name="ruta_portada" value="ruta_portada"/>
                                    <s:param name="isbn" value="isbn"/>
                                    <s:param name="idioma" value="idioma"/>
                                    <s:param name="nivel_mre" value="nivel_mre"/>
                                    
                                </s:url>
                            <a href="${detailInputLink}">ver detalle</a>
                        </div>
                    </div>
                    <br>
                </s:iterator>
                <%@ include file="/WEB-INF/jsp/inc/footer.jsp" %>
            </div>

            <%@ include file="/WEB-INF/jsp/inc/sidebar.jsp" %>

        </div>

    </body>
</html>