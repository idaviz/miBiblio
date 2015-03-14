/*
 * 
 */
package dgg.ucav.acciones;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
/**
 *
 * @author dgarcia25
 */
public class AutenticarAccion extends ActionSupport implements SessionAware {

    private String usuario;
    private String contrasena;
    private final String usuarioPredeterminado = "dgarcia";
    private final String contrasenaPredeterminada = "dgarcia";
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
        // verificar si el identificador y la contraseña son correctos
        if (usuario != null && contrasena != null) {
            if (usuario.equals(usuarioPredeterminado)
                    && contrasena.equals(contrasenaPredeterminada)) {
                // autenticación correcta,guardar el valor en la sesión
                System.out.println("usuario y contraseña correctos!");
                this.sessionMap.put("autenticacion", true);
                return SUCCESS;
            }
        }
        return INPUT;
    }

    public String desconectar() {
        // vaciar la sesión del usuario
        this.sessionMap.clear();
        return SUCCESS;
    }
}
