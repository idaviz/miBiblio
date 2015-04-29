<!-- Librer�as -->
<%@ include file="/WEB-INF/jsp/inc/include.jsp" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="struts2, twitter, bootstrap, plugin, mibiblio" />
        <meta name="description" content="miBiblio document repository" />
        <title><s:text name="index.title" /></title>

        <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
        <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <sb:head includeScripts="true" includeScriptsValidation="true"/>
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
            <s:url id="indexEN" namespace="/" action="locale" >
                <s:param name="request_locale" >en</s:param>
            </s:url>
            <s:url id="indexES" namespace="/" action="locale" >
                <s:param name="request_locale" >es</s:param>
            </s:url>

            <s:a href="%{indexEN}" >English</s:a>
            <s:a href="%{indexES}" >Espa�ol</s:a>

                <!-- Fin soporte para internacionalizaci�n -->

                <div class="row row-offcanvas row-offcanvas-right">

                    <div class="col-xs-12 col-sm-9">
                        <p class="pull-right visible-xs">
                            <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
                        </p>
                        <div class="jumbotron">
                            <h1><span class="glyphicon glyphicon-book" aria-hidden="true"></span> miBiblio</h1>
                            <p><s:text name="jumbotron.introtext" /></p>
                    </div>
                    <br>
                    <br>
                     <div class="row">
                        <div class="col-xs-6 col-lg-4">
                            <h2>miBiblio</h2>
                            <p>Bien venido a miBiblio. el primer portal dise�ado para que puedas gestionar tus propios recursos bibliogr�ficos sin necesidad de instalar ninguna aplicaci�n. Tan s�lo necesitar�s crear una carpeta en tu PC donde guardar los documentos. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Cat�logo</h2>
                            <p>En la secci�n Cat�logo tendr�s acceso a todo el fondo bibliogr�fico y documental de miBiblio. Podr�s acceder a �l f�cilmente ya que est� clasificado por orden alfab�tico y cada entrada est� acompa�ada por una breve rese�a que te ayudar�. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>B�squedas</h2>
                            <p>Si necesitas acceder a un documento en concreto o quieres realizar b�squedas de documentos que contengan en com�n alguna palabra clave, a trav�s de esta secci�n, rellenando el formulario de b�squeda tendr�s todos los resultados. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Novedades</h2>
                            <p>Aqu� puedes consultar todas las obras y los documentos  que se han ido incorporando en la base de datos de forma f�cil. Una simple lista, ordenada por la fecha de inserci�n te ayudar� a localizar f�cilmente las novedades del portal. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Ayuda</h2>
                            <p>El portal miBiblio est� dise�ado para poder utilizarlo sin haber recibido ninguna formaci�n previa. Sin embargo, es posible que tengas alguna duda b�sica al iniciarte en la plataforma. En esta secci�n podr�s consultar preguntas y respuestas. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Acerca de</h2>
                            <p>Si est�s interesado en conocer qu� y qui�n hay detr�s de este proyecto s�lo necesitas acceder a esta secci�n y obtendr�s autom�ticamente respuesta a la mayor�a de preguntas que te est�s realizando al respecto. Entra y descubre lo que buscas. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                    </div><!--/row-->
                </div><!--/.col-xs-12.col-sm-9-->
                <%@ include file="/WEB-INF/jsp/inc/sidebar.jsp" %>

            </div><!--/row-->

            <%@ include file="/WEB-INF/jsp/inc/footer.jsp" %>

        </div><!--/.container-->

    </body>
</html>