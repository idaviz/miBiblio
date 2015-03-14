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
                <s:url action="inventory" var="inventoryInputLink" />
                <li><a href="${inventoryInputLink}"><s:text name="menu.catalog" /></a></li>
                <s:url action="search" var="searchInputLink" />
                <li><a href="${searchInputLink}"><s:text name="menu.search" /></a></li>
                <s:url action="manage" var="manageInputLink" />
                <li><a href="${manageInputLink}"><s:text name="menu.manage" /></a></li>
                <li><a href="#contact"><s:text name="menu.aboutus" /></a></li>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->