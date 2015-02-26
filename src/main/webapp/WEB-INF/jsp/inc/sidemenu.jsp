<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
    <p> <strong>Últimas Novedades...</strong></p>
    <div class="list-group">
        
        <s:iterator value="listaNovedades" status="linea">
        <div class="media">
            <a href="#" class="list-group-item"> <s:property value="titulo"/></a>
            <s:property value="ruta_portada"/>
        <br>
    </s:iterator>
    </div>

    

</div><!--/.sidebar-offcanvas-->
