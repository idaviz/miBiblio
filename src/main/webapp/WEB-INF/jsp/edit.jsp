<!-- Librerías -->
<%@ include file="/WEB-INF/jsp/inc/include.jsp" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="struts2, twitter, bootstrap, plugin, showcase" />
        <meta name="description" content="A Showcase for the Struts2 Bootstrap Plugin" />
        <title><s:text name="edit.title" /></title>

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
                    <h1><span class="glyphicon glyphicon-lock" aria-hidden="true"></span> <s:text name="edit.title" /></h1>
                    <p></p>
                </div>
                <br>
                <div>
                    <h4>Modificar obra</h4>
                    <br>
                    <s:form class="form-horizontal" theme="bootstrap" method="post" action="Modificar_Obra">
                        
                        <s:hidden name="id_tb_obra" id="id_tb_obra"/>
                        
                        <div class="form-group has-success">
                            <label for="isbn" class="col-sm-2 control-label"><s:text name="form.isbn" /></label>
                            <div class="col-sm-10">
                                <s:textfield name="isbn" id="isbn" class="form-control" placeholder="ISBN"/>
                            </div>
                        </div>
                        <div class="form-group has-success">
                            <label for="titulo" class="col-sm-2 control-label"><s:text name="form.title" /></label>
                            <div class="col-sm-10">
                                <s:textfield name="titulo" id="titulo" class="form-control" placeholder="Título de la obra"/>
                            </div>
                        </div>

                        <div class="form-group has-success">
                            <label for="subtitulo" class="col-sm-2 control-label"><s:text name="form.subtitle" /></label>
                            <div class="col-sm-10">
                                <s:textfield name="subtitulo" id="subtitulo" class="form-control" placeholder="Subtítulo"/>
                            </div>
                        </div>

                        <div class="form-group has-success">
                            <label for="idioma" class="col-sm-2 control-label"><s:text name="form.language" /></label>
                            <div class="col-sm-10">
                                <s:textfield name="idioma" id="idioma" class="form-control" placeholder="Idioma"/>
                            </div>
                        </div>

                        <div class="form-group has-success">
                            <label for="nivel_mre" class="col-sm-2 control-label"><s:text name="form.level" /></label>
                            <div class="col-sm-10">
                                <s:textfield name="nivel_mre" id="nivel_mre" class="form-control" placeholder="Nivel"/>
                            </div>
                        </div>

                        <div class="form-group has-success">
                            <label for="ruta_portada" class="col-sm-2 control-label"><s:text name="form.path" /></label>
                            <div class="col-sm-10">
                                <s:textfield name="ruta_portada" id="ruta_portada" class="form-control" placeholder="Ruta a la portada"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <s:submit value="Guardar cambios" class="btn btn-primary" type="button"/>
                            </div>
                        </div>

                    </s:form>
                    <hr>
                </div>  
                <br>
                <br>
                <%@ include file="/WEB-INF/jsp/inc/footer.jsp" %>
            </div>
        </div>
    </body>
</html>