/*
 * Clase donde se registra al alumno, curso y modulo1
 
 */
package utpmas.utp.edu.pe;

/**
 *
 * @author DAVID
 */
public class Matricula implements Operaciones {
    //variables
    private String codigoalumno;
    private String codigocurso;
    private String codigodocente;
    private String codigomodulo;
    //constructor
    public Matricula(String codigoalumno, String codigocurso, String codigodocente, String codigomodulo) {
        this.codigoalumno = codigoalumno;
        this.codigocurso = codigocurso;
        this.codigodocente = codigodocente;
        this.codigomodulo = codigomodulo;
    }

    //setter and getters
    public String getCodigoalumno() {
        return codigoalumno;
    }
    public void setCodigoalumno(String codigoalumno) {
        this.codigoalumno = codigoalumno;
    }
    public String getCodigocurso() {
        return codigocurso;
    }
    public void setCodigocurso(String codigocurso) {
        this.codigocurso = codigocurso;
    }
    public String getCodigodocente() {
        return codigodocente;
    }
    public void setCodigodocente(String codigodocente) {
        this.codigodocente = codigodocente;
    }
    public String getCodigomodulo() {
        return codigomodulo;
    }
    public void setCodigomodulo(String codigomodulo) {
        this.codigomodulo = codigomodulo;
    }

    @Override
    public String mostrar() {
        return "Matricula [codigoalumno=" + codigoalumno + ", codigocurso=" + codigocurso + ", codigodocente="
                + codigodocente + ", codigomodulo=" + codigomodulo + "]";
    }
    
    
    
    
}
