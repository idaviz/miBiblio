/*
 * 
 */
package dgg.ucav.dao;

/**
 *
 * @author dgarcia25
 */
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dgg.ucav.dao.javabeans.Obra;
import dgg.ucav.dao.modelos.ModeloObraDAO;

@SuppressWarnings("serial")
public class ObraAccion extends ActionSupport implements Preparable, ModelDriven {

    private Obra obra;
    private List<Obra> listaObras;
    private int idObraActual;

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

    public int getIdClienteActual() {
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
    public String listado() {
        ModeloObraDAO ModeloObraDAO = new ModeloObraDAO();

        listaObras = (ArrayList<Obra>) ModeloObraDAO.getListaObras();
        return SUCCESS;
    }
}
