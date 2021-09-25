/* David Gil Silva Collantes U19312681
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utpmas.utp.edu.pe;

/**
 *
 * @author DAVID
 */
public class Docente extends Persona implements Constantes{
    //Variables
    private String codigoadocente;
    private String correodocente;
    //Constantes
    //Constructores
    public Docente(String nombres, String apellidos, String dni, char genero, String fechanacimiento,
            String codigoadocente, String correodocente) {
        super(nombres, apellidos, dni, genero, fechanacimiento);
        this.codigoadocente = codigoadocente;
        this.correodocente = correodocente;
    }
    public Docente(String nombres, String apellidos, String dni, char genero, String fechanacimiento,
    String codigoadocente) {
    super(nombres, apellidos, dni, genero, fechanacimiento);
    this.codigoadocente = codigoadocente;
    this.correodocente = codigoadocente + DOMINIO_CORREO;
    }

    public String getCodigoadocente() {
        return codigoadocente;
    }
    public void setCodigoadocente(String codigoadocente) {
        this.codigoadocente = codigoadocente;
    }
    public String getCorreodocente() {
        return correodocente;
    }
    public void setCorreodocente(String correodocente) {
        this.correodocente = correodocente;
    }    
    
    @Override
    public String mostrar() {
        return "Docente [codigoadocente=" + codigoadocente + "apellidos=" + this.getApellidos()
        + ", nombres=" + this.getNombres() + ", dni=" + this.getDni()  + ", genero=" 
        + this.getGenero() + ", fechanacimiento=" + this.getFechanacimiento() +", correodocente=" + correodocente + "]";
    }
}
