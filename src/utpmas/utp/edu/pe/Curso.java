/* David Gil Silva Collantes U19312681
 * Clase don de se registra el nombre del curso y el nombre las notas con su porcentaje 
 */
package utpmas.utp.edu.pe;

/**
 *
 * @author DAVID
 */
public class Curso implements Constantes, Operaciones {
    //variables
    private String codigocurso;
    private String nombrecurso;
    private int creditos;
    private String[] evaluaciones;

    //constructor
    public Curso(String codigocurso, String nombrecurso, int creditos) {
        this.codigocurso = codigocurso;
        this.nombrecurso = nombrecurso;
        this.creditos = creditos;
        this.evaluaciones=EVALUACIONES;
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
    
    public String[] getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(String[] evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
    //Metodos
    public static double calculaNotaCurso(double[] notas){
        double notafinal=0;
        notafinal=notas[0]*PPC01 + notas[1]*PPC02 + notas[2]*PECV + notas[3]*PEXFN;
        return notafinal;
    }
    
    @Override
    public String mostrar() {
        return "Curso{" + "codigocurso=" + codigocurso + ", nombrecurso=" + nombrecurso + ", creditos=" + creditos +  '}';
    }

    
    
    
}
