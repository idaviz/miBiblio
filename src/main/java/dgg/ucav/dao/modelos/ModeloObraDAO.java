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
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModeloObraDAO extends ModeloDAO {

    // Variables 
    Connection conexion = null;
    ResultSet resultado = null;
    private static List<Obra> listaObras;
    private static List<Obra> listaResultados;
    private static List<Obra> listaNovedades;

    // devolver la lista de obras 
    public List<Obra> getListaObras() {
        // Variables 
        PreparedStatement consulta = null;
        Obra obra = null;
        String consultaString = null;
        listaObras = new ArrayList<>();

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
            consultaString = "SELECT * FROM tb_obra WHERE 1 ORDER BY fecha_insercion DESC LIMIT 10";

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

    // devolver la lista de obras 
    public List<Obra> getListaResultados(String clave) {
        // Variables 
        PreparedStatement consulta = null;
        Obra obra = null;
        String consultaString = null;
        listaResultados = new ArrayList<Obra>();

        try {
            // Apertura de una conexión 
            conexion = super.getConnection();

            // consulta de lista de obras 
            consultaString = "SELECT * FROM tb_obra WHERE titulo LIKE '%" + clave + "%'";

            consulta = conexion.prepareStatement(consultaString);

            // Ejecución de la consulta 
            resultado = consulta.executeQuery();

            // Se almacena el resultado en una lista 
            if (resultado != null) {
                while (resultado.next()) {
                    // Se efectúa el mapping de los atributos con los campos de la tabla SQL 
                    obra = mapperObra(resultado);

                    // Se añade el objeto a la lista de obrass
                    listaResultados.add((Obra) obra);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en la consulta de la clase ModeloObraDAO función getListaResultados");
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
                System.out.println("Error en el cierre de la conexion con la base de datos en la clase ModeloClienteDAO función getListaResultados");
            }
        }

        // Devolver la lista de obras 
        return listaResultados;
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

    // agregar un obra a la base
    public int agregarObra(Obra obra) {
        // Variables
        PreparedStatement consulta = null;
        String consultaString = null;
        int codigoError = 0;
        try {
            // Apertura de una conexión
            conexion = super.getConnection();
            // Creación de la consulta
            consultaString = "INSERT INTO tb_obra (isbn, titulo, subtitulo, idioma, nivel_mre, ruta_portada) VALUES (?,?,?,?,?,?)";
     
            // Preparación de la consulta
            consulta=conexion.prepareStatement(consultaString);
            consulta.setString(1, obra.getIsbn());
            consulta.setString(2, obra.getTitulo());
            consulta.setString(3, obra.getSubtitulo());
            consulta.setString(4, obra.getIdioma());
            consulta.setString(5, obra.getNivel_mre());
            consulta.setString(6, obra.getRuta_portada());
            //System.out.println(consulta);
            // Se vacía la obra por seguridad
            obra = null;
            // Ejecución de la consulta
            codigoError = consulta.executeUpdate();
            //consulta.executeUpdate();
            
        } catch (Exception e) {
            codigoError = 0;
            System.out.println("Error en el INSERT de la clase ModeloObraDAO función agregarObra");
            System.out.println(consulta);
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
                System.out.println("Error en el cierre de la conexión con la base de datos en la clase ModeloObraDAO función agregarObra");
            }
        }
        // Devolver el código de error
        return codigoError;
    }

    // eliminar un cliente en la base
    public int eliminarObra(int id_tb_obra) {
        // Variables
        PreparedStatement consulta = null;
        String consultaString = null;
        int codigoError = 0;
        try {
            // Apertura de una conexión
            conexion = super.getConnection();
            // Eliminar el obra
            consultaString = "DELETE FROM tb_obra WHERE id_tb_obra=?";
            consulta = conexion.prepareStatement(consultaString);
            consulta.setInt(1, id_tb_obra);

            // Ejecución de la consulta
            codigoError = consulta.executeUpdate();
            System.out.println(consultaString);
            System.out.println(consulta);
        } catch (Exception e) {
            codigoError = 0;
            System.out.println("Error en la consulta de la clase ModeloObraDAO función eliminarObra");
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
                System.out.println("Error en el cierre de la conexión con la base de datos en la clase ModeloObraDAO función eliminarObra");
            }
        }

        // Devolver el código de error
        return codigoError;
    }

    // modificar una obra en la base
    public int modificarObra(Obra obra) {
        // Variables
        PreparedStatement consulta = null;
        String consultaString = null;
        int codigoError = 0;
        try {
            // Apertura de una conexión
            conexion = super.getConnection();
            // Creación de la consulta
            consultaString = "UPDATE tb_obra SET isbn=?, titulo=?, subtitulo=?, idioma=?, nivel_mre=?, ruta_portada=? WHERE id_tb_obra=?";
            consulta = conexion.prepareStatement(consultaString);
            consulta.setString(1, obra.getIsbn());
            consulta.setString(2, obra.getTitulo());
            consulta.setString(3, obra.getSubtitulo());
            consulta.setString(4, obra.getIdioma());
            consulta.setString(5, obra.getNivel_mre());
            consulta.setString(6, obra.getRuta_portada());
            consulta.setInt(7, obra.getId_tb_obra());
            
            // Se vacía el cliente por seguridad
            obra = null;
            // Ejecución de la consulta
            codigoError = consulta.executeUpdate();
        } catch (Exception e) {
            System.out.println(consulta);
            System.out.println("Error en la consulta de la clase ModeloObraDAO función modificarObra");
              }
              finally
              {
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
                System.out.println("Error en el cierre de la conexión con la base de datos en la clase ModeloObraDAO función modificarObra");
                     }
              }
              // Devolver el código de error
              return codigoError;
    }

    // Realizar el mapping relacional hacia objeto 
    public Obra mapperObra(ResultSet resultado) {
        // Variables 
        Obra obra = new Obra();

        try {
            if (resultado.getString("id_tb_obra")== null) {
                obra.setId_tb_obra(0);
            } else {
                obra.setId_tb_obra(resultado.getInt("id_tb_obra"));
            }

            if (resultado.getString("isbn") == null) {
                obra.setIsbn("");
            } else {
                obra.setIsbn(resultado.getString("isbn"));
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

            if (resultado.getString("fecha_insercion") == null) {
                obra.setFecha_insercion(null);
            } else {
                String fechaOriginal = resultado.getString("fecha_insercion");
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = format.parse(fechaOriginal);
                obra.setFecha_insercion(date);
            }

        } catch (SQLException e) {
            //Si se produce un error durante el mapping de atributos 
            obra = null;
            System.out.println("Error en el mapping de atributos de una obra de la clase ModeloObraDAO, función mapperObra");
        } catch (ParseException ex) {
            System.out.println("Error en el mapping del atributo fecha_insercion de una obra de la clase ModeloObraDAO, función mapperObra");
        }
        // Devolver objeto obra 
        return obra;
    }
}
