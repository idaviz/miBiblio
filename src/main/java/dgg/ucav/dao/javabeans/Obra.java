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

    private String id_tb_obra;
    private String titulo;
    private String isbn;
    private String subtitulo;
    private String idioma;
    private String nivel_mre;
    private String ruta_portada;
    private Date fecha_insercion;

    public Obra() {
    }

    public Obra(String id_tb_obra, String tiulo) {
        this.id_tb_obra = id_tb_obra;
        this.titulo = titulo;
    }

    public String getId_tb_obra() {
        return id_tb_obra;
    }

    public void setId_tb_obra(String id_tb_obra) {
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
