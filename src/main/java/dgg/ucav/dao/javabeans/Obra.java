/*
 * 
 */
package dgg.ucav.dao.javabeans;

import java.util.Date;

/**
 *
 * @author dgarcia25
 */
public class Obra {

    private int id_tb_obra;
    private String isbn;
    private String titulo;
    private String subtitulo;
    private String idioma;
    private String nivel_mre;
    private String ruta_portada;
    private Date fecha_insercion;
    private String imagen;

    public Obra() {
    }

    public Obra(String titulo, String subtitulo, String isbn, String idioma, String nivel_mre, String ruta_portada) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.isbn = isbn;
        this.idioma = idioma;
        this.nivel_mre = nivel_mre;
        this.ruta_portada = ruta_portada;
    }

    public Obra(int id_tb_obra, String isbn, String titulo, String subtitulo, String idioma, String nivel_mre, String ruta_portada, Date fecha_insercion, String imagen) {
        this.id_tb_obra = id_tb_obra;
        this.isbn = isbn;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.idioma = idioma;
        this.nivel_mre = nivel_mre;
        this.ruta_portada = ruta_portada;
        this.fecha_insercion = fecha_insercion;
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId_tb_obra() {
        return id_tb_obra;
    }

    public void setId_tb_obra(int id_tb_obra) {
        this.id_tb_obra = id_tb_obra;
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

    public String getRuta_portada() {
        return ruta_portada;
    }

    public void setRuta_portada(String ruta_portada) {
        this.ruta_portada = ruta_portada;
    }

    public Date getFecha_insercion() {
        
        return fecha_insercion;
    }

    public void setFecha_insercion(Date fecha_insercion) {
        this.fecha_insercion = fecha_insercion;
    }   
}
