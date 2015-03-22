<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
    <p> <strong><s:text name="sidebar.title" /></strong></p>
    <div class="list-group">
        <s:iterator value="listaNovedades" status="linea">
            <a href="#" class="list-group-item">
                <s:property value="titulo"/><br>
                <small><i>
                       "<s:text name="sidebar.added" />
                        <s:date name="fecha_insercion" var="formato_dia_es" format="dd/MM/yyyy"/>
                        <s:property value="formato_dia_es"/>
                        <s:text name="sidebar.at" /> 
                       <s:date name="fecha_insercion" var="formato_hora_es" format="HH:mm"/>
                        <s:property value="formato_hora_es"/>"
                    </i></small>
            </a>         
        </s:iterator>
    </div>
</div><!--/.sidebar-offcanvas-->