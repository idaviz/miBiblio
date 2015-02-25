/*
 * 
 */
package dgg.ucav.mibiblio.dao;

/**
 *
 * @author dgarcia25
 */
public class Obra {
    private int id;
    private String isbn;
    private String titulo;
    private String subtitulo;
    private int id_autor;
    private int id_editorial;
    private String idioma;
    private String nivel_mre;
    private String portada;
    private String fechainsercion;
    private String ruta_portada;

    public Obra() {
    }

    public Obra(String titulo, String subtitulo) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

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

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public int getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(int id_editorial) {
        this.id_editorial = id_editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNivel_mre() {
        return nivel_mre;
    }

    public void setNivel_mre(String nivel_mre) {
        this.nivel_mre = nivel_mre;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getFechainsercion() {
        return fechainsercion;
    }

    public void setFechainsercion(String fechainsercion) {
        this.fechainsercion = fechainsercion;
    }

    public String getRuta_portada() {
        return ruta_portada;
    }

    public void setRuta_portada(String ruta_portada) {
        this.ruta_portada = ruta_portada;
    }
    
}
