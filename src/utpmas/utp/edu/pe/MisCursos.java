/* David Gil Silva Collantes U19312681

*/
package utpmas.utp.edu.pe;

import java.util.ArrayList;

public class MisCursos {
    ArrayList<Matricula> matriculados;
    
    public MisCursos(){
        matriculados = new ArrayList<Matricula>();

    }
    /*//metodo valida si existe contacto
    public boolean existeContacto(Contacto c){
        for(int i=0; i<contactos.length; i++){
            //controlar nulos e indicar si el contacto es el mismo
            if(contactos[i]!=null && c.equals(contactos[i])){
                return true;
            }
        }
        return false;
    }*/

    //valida si alumno ya esta matriculado en el mismo curso
  
    public boolean validar(String codigoalumno, String codigocurso){
        boolean validar = false;

        for(Matricula tmpPMatricula : matriculados){
            if(tmpPMatricula.getCodigoalumno()==codigoalumno && tmpPMatricula.getCodigocurso()==codigocurso){
                validar=true;
                break;
            }
        }
        return validar;
    }

    //agrega nueva persona si no existe
    public void agregar(Matricula nuevo){
        if(this.validar(nuevo.getCodigoalumno(), nuevo.getCodigocurso())==false){
            matriculados.add(nuevo);

        }else{
            System.out.println(" Curso Ya Matriculado Registo");
        }

    }
    //listar las matriculados
    public void listar(){
        System.out.println("Listando Cursos:");
        for(Matricula tmpMatricula : matriculados){
            System.out.println(tmpMatricula.mostrar());
        }    
    }

    public boolean listaCursosAlumno(String codigoalumno){
        int cont=0;
        boolean tienereg=false;
        for(Matricula tmpMatricula : matriculados){
            
            if(tmpMatricula.getCodigoalumno().equalsIgnoreCase(codigoalumno)){
                System.out.println("Modulo: "+tmpMatricula.getCodigomodulo()+" Curso: "+tmpMatricula.getCodigocurso());
                cont++;
            }          
        }
        
        if(cont==0){
          System.out.println(" No Registra Cursos Matriculados ");          
            } 
        else{
          tienereg=true;
        }
            
        return tienereg;

    }
    public boolean listaCursosAlumno(String codigoalumno, String codigocurso){
        int cont=0;
        boolean tienereg=false;
        for(Matricula tmpMatricula : matriculados){
            
            if(tmpMatricula.getCodigoalumno().equalsIgnoreCase(codigoalumno) &&tmpMatricula.getCodigocurso().equalsIgnoreCase(codigocurso)){
                System.out.println("Modulo: "+tmpMatricula.getCodigomodulo()+" Curso: "+tmpMatricula.getCodigocurso());
                cont++;
            }          
        }
        
        if(cont==0){
          System.out.println(" No Matriculado en el Curso: " +codigocurso+"\n");          
            } 
        else{
          tienereg=true;
        }
            
        return tienereg;

    }
    public void listaNotasCurso(){

    }

    public void ingresaNotaCurso(){
        
    }

}
