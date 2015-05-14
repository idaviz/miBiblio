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
                <s:actionerror theme="bootstrap"/>
                <div>
                    <h4><s:text name="edit.description" /></h4>
                    <br>
                    <s:form acceptcharset="UTF-8" name="doc" class="form-vertical" theme="bootstrap" cssClass="form-vertical well" method="post" action="Modificar_Obra" >
                        <s:hidden name="id_tb_obra" id="id_tb_obra"/>
                        <s:textfield name="isbn" id="isbn" label="%{getText('form.isbn')}" class="form-control" placeholder="%{getText('form.isbn')}" tooltip="%{getText('form.isbn')}"/>
                        <s:textfield name="titulo" id="titulo" label="%{getText('form.title')}" class="form-control" placeholder="%{getText('form.title')}"/>
                        <s:textfield name="subtitulo" id="subtitulo" label="%{getText('form.subtitle')}" class="form-control" placeholder="%{getText('form.subtitle')}"/>
                        <s:select
                            label="%{getText('form.language')}"
                            list="{'English', 'German', 'Spanish'}"
                            name="idioma"
                            id="idioma" 
                            class="form-control"
                            emptyOption="true"
                            headerKey="None"
                            headerValue="None"
                            placeholder="%{getText('form.language')}"/>
                        <s:radio
                            label="%{getText('form.level')}"
                            id="nivel_mre"
                            labelposition="inline"
                            list="{'A1', 'A2', 'B1', 'B2', 'C1', 'C2','?'}"
                            name="nivel_mre"/>
                        <s:textfield name="ruta_portada" id="ruta_portada" label="%{getText('form.path')}" class="form-control" placeholder="%{getText('form.path')}"/>
                        <s:submit value="%{getText('form.save')}" class="btn btn-primary" cssClass="btn btn-primary" type="button" />
                    </s:form>
                    <br>
                    <s:url action="manage" var="manageInputLink" />
                    <ul style="list-style: none;">
                        <li class="pull-right"><a href="${manageInputLink}"><s:text name="freelink.backtomanage" /> <span class="glyphicon glyphicon-repeat" aria-hidden="true"></span></a></li>
                    </ul>
                    <br>
                    <hr>
                </div>  
                <br>
                <br>
                <%@ include file="/WEB-INF/jsp/inc/footer.jsp" %>
            </div>
        </div>
    </body>
</html>