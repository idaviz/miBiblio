/*
 * 
 */
package dgg.ucav.dao.javabeans;

/**
 *
 * @author dgarcia25
 */
public class Obra {
    private int id_tb_obra;
    private String titulo;

    public Obra() {
    }

    public Obra(int id_tb_obra, String tiulo) {
        this.id_tb_obra = id_tb_obra;
        this.titulo = titulo;
    }

    public int getId_tb_obra() {
        return id_tb_obra;
    }

    public void setId_tb_obra(int id_tb_obra) {
        this.id_tb_obra = id_tb_obra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
