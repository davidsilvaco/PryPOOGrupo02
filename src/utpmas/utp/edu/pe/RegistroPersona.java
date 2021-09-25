package utpmas.utp.edu.pe;

import java.util.ArrayList;

public class RegistroPersona {
    ArrayList<Persona> personas;

    public RegistroPersona(){
        personas = new ArrayList<Persona>();
    }

    //valida existencia de persona por dni
    public boolean validar(String codigo){
        boolean validar = false;

        for(Persona tmpPersona : personas){
            if(tmpPersona.getDni()==codigo){
                validar=true;
                break;
            }
        }
        return validar;

    }

    //agrega nueva persona si no existe
    public void agregar(Persona nuevo){
        if(this.validar(nuevo.getDni())==false){
            personas.add(nuevo);

        }else{
            System.out.println(" Ya existe Registo");
        }

    }
    //listar las personas
    public void listar(){
        for(Persona tmpPersona : personas){
            System.out.println(tmpPersona.mostrar());
        }    
    }

    public int eliminar(){
        int contador=0;
        for(int i =0; i<personas.size();i++){
            personas.remove(i);
            contador++;
        }
        return contador;
    }


    
}
