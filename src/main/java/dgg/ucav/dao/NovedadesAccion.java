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
public class NovedadesAccion extends ActionSupport implements Preparable, ModelDriven {

    private Obra obra;
    private List<Obra> listaNovedades;
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

    public List<Obra> getListaNovedades() {
        ModeloObraDAO ModeloObraDAO = new ModeloObraDAO();

        listaNovedades = (ArrayList<Obra>) ModeloObraDAO.getListaNovedades();
        return listaNovedades;
    }

    public void setListaNovedades(List<Obra> listaNovedades) {
        this.listaNovedades = listaNovedades;
    }

    // devolver la lista de clientes tras la recuperación 
    public String novedades() {
        ModeloObraDAO ModeloObraDAO = new ModeloObraDAO();

        listaNovedades = (ArrayList<Obra>) ModeloObraDAO.getListaNovedades();
        return SUCCESS;
    }
}
