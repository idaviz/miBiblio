/*
 * 
 */
package dgg.ucav.interceptores;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

/**
 *
 * @author dgarcia25
 */
@SuppressWarnings("serial")
public class AutenticacionInterceptor extends AbstractInterceptor {

    // método ejecutado antes de la acción
    @Override
    public void init() {
        System.out.println("Antes del método de acción");
    }

    // método del interceptor
    /**
     *
     * @param invocation
     * @return
     * @throws Exception
     */
    @Override
    public String intercept(ActionInvocation invocation) throws
            Exception {
        System.out.println("En el método del interceptor");

        // recuperar los objetos de la sesión
        Map<String, Object> session = invocation.getInvocationContext().getSession();

        if (session.get("autenticacion") == null) {
            // el usuario no se autentica regresar a la página de autenticación
            return "autenticacion";
        } else {
            // verificar la autenticación
            boolean autenticacion = (Boolean) (session.get("autenticacion"));
            if (autenticacion) {
                // el usuario se han autenticado, continuar la acción
                return invocation.invoke();
            } else {
                // el usuario no se ha autenticado regresar a la página de autenticación
                return "autenticacion";
            }
        }
    }

    // método ejecutado después de la acción
    /**
     *
     */
    @Override
    public void destroy() {
        System.out.println("Despues del método de acción");
    }

}
