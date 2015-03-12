/*
 * Created by me and myself.
 */
package dgg.ucav.dao.modelos;

/**
 *
 * @author David
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dgg.ucav.dao.cajaherramientas.GestionBaseDeDatos;
import dgg.ucav.dao.javabeans.Usuario;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModeloUsuarioDAO extends ModeloDAO {

    Connection conexion = null;
    ResultSet resultado = null;
    
    public Usuario getUsuario(String idUsuario) {
        // Variables 
        PreparedStatement consulta = null;
        Usuario usuario = null;
        String consultaString = null;

        try {
            // Apertura de una conexión 
            conexion = super.getConnection();

            // Creación de la consulta 
            consultaString = "SELECT * FROM tb_usuario WHERE usuario=?";

            // Se prepara la consulta
            consulta = conexion.prepareStatement(consultaString);
            consulta.setString(1, idUsuario);

            // Ejecución de la consulta 
            resultado = consulta.executeQuery();

            // Se almacena el resultado en el objeto usuario 
            if (resultado != null) {
                if (resultado.next()) {
                    // Se realiza el mapping de los atributos con los campos de la tabla SQL 
                    usuario = mapperUsuario(resultado);
                }
            }
        } catch (Exception e) {
            usuario = null;
            System.out.println("Error en la consulta en la clase ModeloUsuarioDAO función getUsuario");
        } finally {
            try {
                // Cierre de la conexión 
                if (resultado != null) {

                    GestionBaseDeDatos.closeResulset(resultado);
                }
                if (consulta != null) {

                    GestionBaseDeDatos.closeRequest(consulta);
                }
                if (conexion != null) {

                    GestionBaseDeDatos.closeConnection(conexion);
                }
            } catch (Exception ex) {
                System.out.println("Error en el cierre de la conexión con la base de datos en la clase ModeloUsuarioDAO función getUsuario");
            }
        }

        // Devolver objeto usuario 
        return usuario;
    }

    // Realizar el mapping relacional hacia objeto 
    public Usuario mapperUsuario(ResultSet resultado) {
        // Variables 
        Usuario usuario = new Usuario();

        try {
            if (resultado.getString("usuario") == null) {
                usuario.setUsuario("");
            } else {
                usuario.setUsuario(resultado.getString("usuario"));
            }

            if (resultado.getString("contraseña") == null) {
                usuario.setContraseña("");
            } else {
                usuario.setContraseña(resultado.getString("contraseña"));
            }

            if (resultado.getString("nombre") == null) {
                usuario.setNombre("");
            } else {
                usuario.setNombre(resultado.getString("nombre"));
            }

            if (resultado.getString("apellidos") == null) {
                usuario.setApellidos("");
            } else {
                usuario.setApellidos(resultado.getString("apellidos"));
            }

            if (resultado.getString("email") == null) {
                usuario.setEmail("");
            } else {
                usuario.setEmail(resultado.getString("email"));
            }

        }catch(SQLException e){
            //Si se produce un error durante el mapping de atributos 
            usuario = null;
            System.out.println("Error en el mapping de atributos de un Usuario de la clase ModeloUsuarioDAO, función mapperUsuario");
        }
        // Devolver objeto usuario 
        return usuario;
    }
}
