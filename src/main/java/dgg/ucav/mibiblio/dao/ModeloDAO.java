/*
 * 
 */
package dgg.ucav.mibiblio.dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.sql.DataSource;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author dgarcia25
 */
public class ModeloDAO implements DAO{
    DataSource dataSource=null;
    @Override
    public Connection getConnection(){
        ServletContext servletContext= ServletActionContext.getServletContext();
        if(this.dataSource==null){
            dataSource=(DataSource)servletContext.getAttribute("dataSource");
        }
        Connection connection = null;
        if(dataSource!=null){
            try{
                connection=dataSource.getConnection();
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
        return connection;
    }
    
    public void setConnection(DataSource dataSource){
        this.dataSource=dataSource;
    }
    
}
