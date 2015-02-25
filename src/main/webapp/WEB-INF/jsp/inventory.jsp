<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html lang="en">
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
                        <li><a href="#"><s:text name="menu.catalog" /></a></li>
                        <li><a href="#"><s:text name="menu.search" /></a></li>
                        <li><a href="#about"><s:text name="menu.manage" /></a></li>
                        <li><a href="#contact"><s:text name="menu.aboutus" /></a></li>
                    </ul>
                </div><!-- /.nav-collapse -->
            </div><!-- /.container -->

            <!-- Tabla de resultados -->
            <s:iterator value="contactList" var="contact">
            </s:iterator>
            <table>
                <tbody>
                    <tr>
                        <th>title</th>
                        <th>isbn</th>
                    </tr>
                    <tr>
                        <td><s:property value="title"></s:property></td>
                        <td><s:property value="isbn"></s:property></td>
                    </tr>  
                </tbody>
            </table>



            </nav><!-- /.navbar -->

            <div class="container">
                <div class="col-xs-12 col-sm-9">
                    <p class="pull-right visible-xs">
                        <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
                    </p>
                    <div class="jumbotron">
                        <h1><span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> <s:text name="inventory.title" /></h1>
                    <p></p>
                </div>
                <br>
                <div class="media">
                    <div class="media-left media-top">
                        <a href="#">
                            <img class="media-object" src="./pics/defaultbook.svg" alt="imagen">
                        </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">Advanced English in Use</h4>
                        <p>Joan Collings. Cambridge University Press 2012.</p>
                    </div>
                </div>
                <br>
                <div class="media">
                    <div class="media-left media-top">
                        <a href="#">
                            <img class="media-object" src="./pics/defaultbook.svg" alt="imagen">
                        </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">First Certificate in English. Tests.</h4>
                        <p>John Steward. Oxford University 2007.</p>
                    </div>
                </div>
                <br>
                <div class="media">
                    <div class="media-left media-top">
                        <a href="#">
                            <img class="media-object" src="./pics/defaultbook.svg" alt="imagen">
                        </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">Certificate in Advanced English.</h4>
                        <p>John Steward. Oxford University 2007.</p>
                    </div>
                </div>
                <br>
                <footer>
                    <hr>
                    <p>David García García, Palma de Mallorca 2015</p>
                    <p class="pull-right"><a href="#">Back to top</a></p>
                </footer>
            </div><!--/.container-->

        </div>

    </body>
</html>