/*
 * Cargar Cursos
 * Cargar Alumnos
 * Cargar Docentes
 * Cargar matricula. Cursos Docente, Alumno
 * Cargar Notas por Ciclo
 */
package utpmas.utp.edu.pe;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAVID SIlva
 * 
 */
public class AppUtpMas {
    public static void main(String[] args){

        //Crea array por defecnto de alumnos
        Persona listaPersona[] = new Persona[10];
        listaPersona[0] = new Alumno("Nombre01", "apellidos01", "dni01", 'M', "02/03/1990", "U11111111", "U11111111@utp.edu.pe");
        listaPersona[1] = new Alumno("Nombre02", "apellidos02", "dni02", 'F', "03/03/1990", "U11111112");
        listaPersona[2] = new Alumno("Nombre03", "apellidos03", "dni03", 'M', "04/03/1990", "U11111113");
        //cre array por defecto de Docentes
        listaPersona[3] = new Docente("Nombre04", "apellidos04", "dni04", 'M', "05/03/1990", "S11111113");

               

        //Ingresa a MisCursos y se listan los cursos Matriculados Por Modulo
        //Ingresa Al Curso Matriculado e Ingresa las notas y se calcula el promedio final según formula
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        //variable para guardar la opcion que elije el usuario
        int opcion;
        while(!salir){
            System.out.println("============================================");
            System.out.println("============================================");
            System.out.println("1. Listar Alumnos");
            System.out.println("2. Lista Cursos Por Alumno");
            System.out.println("3. Listar Notas Por Curso");
            System.out.println("4. Salir");
            System.out.println("============================================");
            System.out.println("============================================");
            try{
                System.out.println("Estimad usuario, ingrese una opción:");
                opcion = sn.nextInt();
                
                switch(opcion){
                    case 1: //Añadir contactos
                        //Pedir valores
                      
                        break;
                    case 2://Listar contactos
                       
                        break;
                    case 3://Buscar contacto
                        //Pedir el nombre del contacto a buscar
                     
                        break;                    
                    case 4://salir
                        salir = true;
                        break;       
                    default:
                        System.out.println("Opcion no existe! Ingresar solo numeros del 1 al 4.");
                }
                
                 }catch(InputMismatchException e){
                System.out.println("Debes insertar un numero");
                sn.next();
            }
        }
    }
    
}
