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
    private String usuarioPredeterminado;
    private String contrasenaPredeterminada;
    private Map<String, Object> sessionMap;

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
