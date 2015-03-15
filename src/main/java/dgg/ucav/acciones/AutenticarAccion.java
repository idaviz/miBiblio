/*
 * 
 */
package dgg.ucav.acciones;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dgg.ucav.dao.javabeans.Usuario;
import dgg.ucav.dao.modelos.ModeloUsuarioDAO;

@SuppressWarnings("serial")
/**
 *
 * @author dgarcia25
 */
public class AutenticarAccion extends ActionSupport implements SessionAware {

    private String usuario;
    private String contrasena;
    private Map<String, Object> sessionMap;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     *
     * @param map
     */
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }

    // descriptores de acceso
    public String conectar() {
        ModeloUsuarioDAO objetoUsuario = new ModeloUsuarioDAO();
        Usuario userFound = new Usuario();
        // buscamos el usuario en la base de datos a partir del usuario introducido
        userFound = objetoUsuario.getUsuario(this.usuario);
        // verificar si se ha introducido un identificador y una contraseña
        if ((usuario != null && contrasena != null)&&(userFound!=null)) {
            //verificar si el usuari recuperado de la base de datos coincide con el usuario introducido
            if (usuario.equals(userFound.getUsuario()) && contrasena.equals(userFound.getContrasena())) {
                // autenticación correcta,guardar el valor en la sesión
                System.out.println("usuario y contraseña correctos!");
                this.sessionMap.put("autenticacion", true);
                 this.sessionMap.put("user", usuario);
                return SUCCESS;
            }
        }
        return INPUT;
    }

    /**
     * descriptores de acceso ... el que funciona con dgarcia/dgarcia public
     * String xconectar(){ // verificar si el identificador y la contraseña son
     * correctos if (usuario != null && contrasena != null) { if
     * (usuario.equals(usuarioPredeterminado) &&
     * contrasena.equals(contrasenaPredeterminada)) { // autenticación
     * correcta,guardar el valor en la sesión System.out.println("usuario y
     * contraseña correctos!"); this.sessionMap.put("autenticacion", true);
     * return SUCCESS; } } return INPUT; }
    *
     */
    public String desconectar() {
        // vaciar la sesión del usuario
        this.sessionMap.clear();
        return SUCCESS;
    }
}
