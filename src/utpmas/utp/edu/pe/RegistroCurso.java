/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utpmas.utp.edu.pe;

import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class RegistroCurso {
    ArrayList<Curso> cursos;

    public RegistroCurso(){
        cursos = new ArrayList<Curso>();
    }

    //valida existencia de persona por dni
    public boolean validar(String codigocurso){
        boolean validar = false;

        for(Curso tmpCurso : cursos){
            if(tmpCurso.getCodigocurso()==codigocurso){
                validar=true;
                break;
            }
        }
        return validar;
    }

    //agrega nuevo curso si no existe
    public void agregar(Curso nuevo){
        if(this.validar(nuevo.getCodigocurso())==false){
            cursos.add(nuevo);

        }else{
            System.out.println(" Ya existe Curso");
        }

    }
    //listar los curso
    public void listar(){
        for(Curso tmpCurso : cursos){
            System.out.println(tmpCurso.mostrar());
        }    
    }
    
    public String[] obtieneEvaluacion(String codigocurso){        
        String[] evaluaciones = null;
        int contador=0;
        
        for(Curso tmpCurso : cursos){
            if (tmpCurso.getCodigocurso().equalsIgnoreCase(codigocurso)){
                evaluaciones=tmpCurso.getEvaluaciones();
                contador++;  
                break;
            }
            
        }
        
        if (contador==0){
            System.out.println("No Existe Evaluaciones CodigoCurso: "+codigocurso);
        }
        return evaluaciones;
    }

    public int eliminar(){
        int contador=0;
        for(int i =0; i<cursos.size();i++){
            cursos.remove(i);
            contador++;
        }
        return contador;
    }

    
}
