/*
 * 
 */
package dgg.ucav.dao.modelos;

/**
 *
 * @author dgarcia25
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dgg.ucav.dao.cajaherramientas.GestionBaseDeDatos;
import dgg.ucav.dao.javabeans.Obra;

public class ModeloObraDAO extends ModeloDAO {

    // Variables 
    Connection conexion = null;
    ResultSet resultado = null;
    private static List<Obra> listaObras;
    
    private static List<Obra> listaNovedades;

    // devolver la lista de obras 
    public List<Obra> getListaObras() {
        // Variables 
        PreparedStatement consulta = null;
        Obra obra = null;
        String consultaString = null;
        listaObras = new ArrayList<Obra>();

        try {
            // Apertura de una conexión 
            conexion = super.getConnection();

            // consulta de lista de obras 
            consultaString = "SELECT * FROM tb_obra WHERE 1 ORDER BY id_tb_obra";

            consulta = conexion.prepareStatement(consultaString);

            // Ejecución de la consulta 
            resultado = consulta.executeQuery();

            // Se almacena el resultado en una lista 
            if (resultado != null) {
                while (resultado.next()) {
                    // Se efectúa el mapping de los atributos con los campos de la tabla SQL 
                    obra = mapperObra(resultado);

                                   // Se añade el objeto a la lista de obrass
                    listaObras.add((Obra) obra);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en la consulta de la clase ModeloObraDAO función getListaObras");
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
                System.out.println("Error en el cierre de la conexion con la base de datos en la clase ModeloClienteDAO función getListaClientes");
            }
        }

        // Devolver la lista de obras 
        return listaObras;
    }
    
    // devolver la lista de obras 
    public List<Obra> getListaNovedades() {
        // Variables 
        PreparedStatement consulta = null;
        Obra obra = null;
        String consultaString = null;
        listaNovedades = new ArrayList<Obra>();

        try {
            // Apertura de una conexión 
            conexion = super.getConnection();

            // consulta de lista de obras 
            consultaString = "SELECT * FROM tb_obra WHERE 1 ORDER BY fechainsercion DESC LIMIT 10";

            consulta = conexion.prepareStatement(consultaString);

            // Ejecución de la consulta 
            resultado = consulta.executeQuery();

            // Se almacena el resultado en una lista 
            if (resultado != null) {
                while (resultado.next()) {
                    // Se efectúa el mapping de los atributos con los campos de la tabla SQL 
                    obra = mapperObra(resultado);

                                   // Se añade el objeto a la lista de obrass
                    listaNovedades.add((Obra) obra);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en la consulta de la clase ModeloObraDAO función getListaNovedades");
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
                System.out.println("Error en el cierre de la conexion con la base de datos en la clase ModeloClienteDAO función getListaNovedades");
            }
        }

        // Devolver la lista de obras 
        return listaNovedades;
    }

    // buscar una obra en la base 
    public Obra getObra(int idObra) {
        // Variables 
        PreparedStatement consulta = null;
        Obra obra = null;
        String consultaString = null;

        try {
            // Apertura de una conexión 
            conexion = super.getConnection();

            // Creación de la consulta 
            consultaString = "SELECT * FROM tb_obra WHERE id_tb_obra=?";

            // Se prepara la consulta
            consulta = conexion.prepareStatement(consultaString);
            consulta.setInt(1, idObra);

            // Ejecución de la consulta 
            resultado = consulta.executeQuery();

            // Se almacena el resultado en el objeto obra 
            if (resultado != null) {
                if (resultado.next()) {
                    // Se realiza el mapping de los atributos con los campos de la tabla SQL 
                    obra = mapperObra(resultado);
                }
            }
        } catch (Exception e) {
            obra = null;
            System.out.println("Error en la consulta en la clase ModeloObraDAO función getObra");
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
                System.out.println("Error en el cierre de la conexión con la base de datos en la clase ModeloObraDAO función getObra");
            }
        }

        // Devolver objeto obra 
        return obra;
    }

    
    

    // Realizar el mapping relacional hacia objeto 
    public Obra mapperObra(ResultSet resultado) {
        // Variables 
        Obra obra = new Obra();

        try {
            if (resultado.getString("id_tb_obra") == null) {
                obra.setId_tb_obra("");
            } else {
                obra.setId_tb_obra(resultado.getString("id_tb_obra"));
            }
                                    
            if (resultado.getString("titulo") == null) {
                obra.setTitulo("");
            } else {
                obra.setTitulo(resultado.getString("titulo"));
            }
            
            if (resultado.getString("subtitulo") == null) {
                obra.setSubtitulo("");
            } else {
                obra.setSubtitulo(resultado.getString("subtitulo"));
            }
            
            if (resultado.getString("idioma") == null) {
                obra.setIdioma("");
            } else {
                obra.setIdioma(resultado.getString("idioma"));
            }
            
            if (resultado.getString("nivel_mre") == null) {
                obra.setNivel_mre("");
            } else {
                obra.setNivel_mre(resultado.getString("nivel_mre"));
            }
            
            if (resultado.getString("ruta_portada") == null) {
                obra.setRuta_portada("");
            } else {
                obra.setRuta_portada(resultado.getString("ruta_portada"));
            }
            
            if (resultado.getString("isbn") == null) {
                obra.setIsbn("");
            } else {
                obra.setIsbn(resultado.getString("isbn"));
            }
            
            
            if (resultado.getString("fechainsercion") == null) {
                obra.setFecha_insercion("");
            } else {
                obra.setFecha_insercion(resultado.getString("fechainsercion"));
            }
            
        } catch (Exception e) {
            //Si se produce un error durante el mapping de atributos 
            obra = null;
            System.out.println("Error en el mapping de atributos de una obra de la clase ModeloObraDAO, función mapperObra");
        }
        // Devolver objeto obra 
        return obra;
    }
}