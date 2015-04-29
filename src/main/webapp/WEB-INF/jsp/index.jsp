<!-- Librerías -->
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
        <!-- Barra de navegación -->
        <%@ include file="/WEB-INF/jsp/inc/navbar.jsp" %>


        <div class="container">
            <!-- Soporte para internacionalización -->
            <s:url id="indexEN" namespace="/" action="locale" >
                <s:param name="request_locale" >en</s:param>
            </s:url>
            <s:url id="indexES" namespace="/" action="locale" >
                <s:param name="request_locale" >es</s:param>
            </s:url>

            <s:a href="%{indexEN}" >English</s:a>
            <s:a href="%{indexES}" >Español</s:a>

                <!-- Fin soporte para internacionalización -->

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
                            <p>Bien venido a miBiblio. el primer portal diseñado para que puedas gestionar tus propios recursos bibliográficos sin necesidad de instalar ninguna aplicación. Tan sólo necesitarás crear una carpeta en tu PC donde guardar los documentos. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Catálogo</h2>
                            <p>En la sección Catálogo tendrás acceso a todo el fondo bibliográfico y documental de miBiblio. Podrás acceder a él fácilmente ya que está clasificado por orden alfabético y cada entrada está acompañada por una breve reseña que te ayudará. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Búsquedas</h2>
                            <p>Si necesitas acceder a un documento en concreto o quieres realizar búsquedas de documentos que contengan en común alguna palabra clave, a través de esta sección, rellenando el formulario de búsqueda tendrás todos los resultados. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Novedades</h2>
                            <p>Aquí puedes consultar todas las obras y los documentos  que se han ido incorporando en la base de datos de forma fácil. Una simple lista, ordenada por la fecha de inserción te ayudará a localizar fácilmente las novedades del portal. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Ayuda</h2>
                            <p>El portal miBiblio está diseñado para poder utilizarlo sin haber recibido ninguna formación previa. Sin embargo, es posible que tengas alguna duda básica al iniciarte en la plataforma. En esta sección podrás consultar preguntas y respuestas. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div><!--/.col-xs-6.col-lg-4-->
                        <div class="col-xs-6 col-lg-4">
                            <h2>Acerca de</h2>
                            <p>Si estás interesado en conocer qué y quién hay detrás de este proyecto sólo necesitas acceder a esta sección y obtendrás automáticamente respuesta a la mayoría de preguntas que te estés realizando al respecto. Entra y descubre lo que buscas. </p>
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