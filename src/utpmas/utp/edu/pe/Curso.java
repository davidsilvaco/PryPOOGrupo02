/*
 * Clase don de se registra el nombre del curso y el nombre las notas con su porcentaje 
 */
package utpmas.utp.edu.pe;

/**
 *
 * @author DAVID
 */
public class Curso {
    //variables
    private String codigocurso;
    private String nombrecurso;
    private int creditos;

    //constructor
    public Curso(String codigocurso, String nombrecurso, int creditos) {
        this.codigocurso = codigocurso;
        this.nombrecurso = nombrecurso;
        this.creditos = creditos;
    }

    //getters and setters

    public String getCodigocurso() {
        return codigocurso;
    }

    
    public void setCodigocurso(String codigocurso) {
        this.codigocurso = codigocurso;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
}
