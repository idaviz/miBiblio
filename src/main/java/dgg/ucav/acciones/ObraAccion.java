/*
 * 
 */
package dgg.ucav.acciones;

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

/**
 * @author David
 */
@SuppressWarnings("serial")
public class ObraAccion extends ActionSupport implements Preparable, ModelDriven {

    private Obra obra;
    private List<Obra> listaObras;
    private int id_tb_obra;
    private String isbn;
    private String titulo;
    private String subtitulo;
    private String nivel_mre;
    private String ruta_portada;
    private String idioma;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getNivel_mre() {
        return nivel_mre;
    }

    public void setNivel_mre(String nivel_mre) {
        this.nivel_mre = nivel_mre;
    }

    public String getRuta_portada() {
        return ruta_portada;
    }

    public void setRuta_portada(String ruta_portada) {
        this.ruta_portada = ruta_portada;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void prepare() throws Exception {
        ModeloObraDAO modeloObraDAO = new ModeloObraDAO();
        // en creación, crear un nuevo objeto vacío 
        if (id_tb_obra == 0) {
            obra = new Obra();
        } // en modificación, devolver la información del objeto 
        else {
            obra = modeloObraDAO.getObra(id_tb_obra);
        }
    }

    /**
     *
     * @return Objeto Obra
     */
    @Override
    public Object getModel() {
        return obra;
    }

    public int getId_tb_obra() {
        return id_tb_obra;
    }

    public void setId_tb_obra(int id_tb_obra) {
        this.id_tb_obra = id_tb_obra;
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

    // Añadir, borrar y editar Obras
    // agregar el obra al modelo
    public String agregar() {

        if (this.obra.getIsbn().equals("") || this.obra.getIsbn().length() < 1 || this.obra.getIsbn().length() > 50) {
            addFieldError("isbn", "ISBN debe contener entre 1 y 50 caracteres");
            return "input";
        } else if (this.obra.getTitulo().equals("") || this.obra.getTitulo().length() < 1 || this.obra.getTitulo().length() > 50) {
            addFieldError("title", "El Título debe contener entre 1 y 50 caracteres.");
            return "input";
        } else if (this.obra.getSubtitulo().equals("") || this.obra.getSubtitulo().length() < 1 || this.obra.getSubtitulo().length() > 100) {
            addFieldError("subtitle", "El Subítulo debe contener entre 1 y 100 caracteres.");
            return "input";
        } else {
            ModeloObraDAO ModeloObraDAO = new ModeloObraDAO();
            ModeloObraDAO.agregarObra(obra);
            addActionMessage(this.obra.getTitulo() + ": " + getText("actionmessage.insert"));
            return SUCCESS;
        }
    }

    // mostrar el formulario en edición
    public String editar() {
        return SUCCESS;
    }

    // modificar una obra
    public String modificar() {
        if (this.obra.getIsbn().equals("") || this.obra.getIsbn().length() < 1 || this.obra.getIsbn().length() > 50) {
            addFieldError("isbn", "ISBN debe contener entre 1 y 50 caracteres");
            return "input";
        } else if (this.obra.getTitulo().equals("") || this.obra.getTitulo().length() < 1 || this.obra.getTitulo().length() > 50) {
            addFieldError("title", "El Título debe contener entre 1 y 50 caracteres.");
            return "input";
        } else if (this.obra.getSubtitulo().equals("") || this.obra.getSubtitulo().length() < 1 || this.obra.getSubtitulo().length() > 100) {
            addFieldError("subtitle", "El Subítulo debe contener entre 1 y 100 caracteres.");
            return "input";
        } else {
            ModeloObraDAO ModeloObraDAO = new ModeloObraDAO();
            ModeloObraDAO.modificarObra(obra);
            addActionMessage(this.obra.getTitulo() + ": " + getText("actionmessage.update"));
            return SUCCESS;
        }
    }

    // eliminar una obra a partir del parámetro recibido llamado idObra
    public String eliminar() {
        ModeloObraDAO ModeloObraDAO = new ModeloObraDAO();
        ModeloObraDAO.eliminarObra(this.id_tb_obra);
        addActionMessage(this.obra.getTitulo() + ": " + getText("actionmessage.delete"));
        return SUCCESS;
    }

}
