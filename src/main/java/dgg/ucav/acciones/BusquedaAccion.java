/*
 * Created by me and myself.
 */
package dgg.ucav.acciones;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dgg.ucav.dao.javabeans.Obra;
import dgg.ucav.dao.modelos.ModeloObraDAO;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author David
 */
public class BusquedaAccion extends ActionSupport implements Preparable, ModelDriven {
   private Obra obra;
    private List<Obra> listaObras;
    private List<Obra> listaResultados;
    private int idObraActual;
    private String palabraBusqueda;

    public String getPalabraBusqueda() {
        return palabraBusqueda;
    }

    public void setPalabraBusqueda(String palabraBusqueda) {
        this.palabraBusqueda = palabraBusqueda;
    }
    
    /**
     *
     * @throws Exception
     */
    @Override
    public void prepare() throws Exception {
        ModeloObraDAO modeloObraDAO = new ModeloObraDAO();
        // en creación, crear un nuevo objeto vacío 
        if (idObraActual == 0) {
            obra = new Obra();
        } // en modificación, devolver la información del objeto 
        else {

            obra = modeloObraDAO.getObra(idObraActual);
        }
    }

    @Override
    public Object getModel() {
        return obra;
    }

    public int getIdObraActual() {
        return idObraActual;
    }

    public void setIdObraActual(int idObraActual) {
        this.idObraActual = idObraActual;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public List<Obra> getListaObras() {
        ModeloObraDAO ModeloObraDAO = new ModeloObraDAO();

        listaObras = (ArrayList<Obra>) ModeloObraDAO.getListaObras();
        return listaObras;
    }

    public void setListaObras(List<Obra> listaObras) {
        this.listaObras = listaObras;
    }

    // devolver la lista de clientes tras la recuperación 
    public String listadoResultado() {
        ModeloObraDAO ModeloObraDAO = new ModeloObraDAO();

        listaResultados = (ArrayList<Obra>) ModeloObraDAO.getListaResultados(this.palabraBusqueda);
        return SUCCESS;
    }

    public List<Obra> getListaResultados() {
        return listaResultados;
    }

    public void setListaResultados(List<Obra> listaResultados) {
        this.listaResultados = listaResultados;
    }
}
