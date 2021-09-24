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
        Alumno listaAlumno[] = new Alumno[10];
        Docente listaDocente[] = new Docente[10];
        Curso listaCurso[] = new Curso[10];
        Matricula listaMatricula[] = new Matricula[10];

        listaAlumno[0] = new Alumno("NomAlumno01", "apellidos01", "dni01", 'M', "02/03/1990", "U11111111", "U11111111@utp.edu.pe");
        listaAlumno[1] = new Alumno("NomAlumno02", "apellidos02", "dni02", 'F', "03/03/1990", "U11111112");
        listaAlumno[2] = new Alumno("NomAlumno03", "apellidos03", "dni03", 'M', "04/03/1990", "U11111113");
        listaAlumno[3] = new Alumno("NomAlumno04", "apellidos04", "dni04", 'M', "04/03/1990", "U11111114");
        //crea array por defecto de Docentes
        listaDocente[0] = new Docente("NomDocente01", "apellidos04", "dni04", 'M', "05/03/1990", "S11111111");
        listaDocente[1] = new Docente("NomDocente02", "apellidos04", "dni04", 'M', "05/03/1990", "S11111112");
        listaDocente[2] = new Docente("NomDocente03", "apellidos04", "dni04", 'M', "05/03/1990", "S11111113");
        
        //crea array por defecto de Cursos
        listaCurso[0] = new Curso("c01", "Curso01", 2);
        listaCurso[1] = new Curso("c02", "Curso02", 2);
        listaCurso[2] = new Curso("c03", "Curso03", 3);
        listaCurso[3] = new Curso("c04", "Curso04", 4);
        listaCurso[4] = new Curso("c05", "Curso05", 2);
        listaCurso[5] = new Curso("c06", "Curso06", 2);

        ////crea array por defecto de Matricula
        listaMatricula[0] = new Matricula("U11111111", "c01", "S11111111", "M1");
        listaMatricula[1] = new Matricula("U11111111", "c02", "S11111111", "M1");
        listaMatricula[2] = new Matricula("U11111111", "c03", "S11111111", "BM");
        listaMatricula[3] = new Matricula("U11111111", "c04", "S11111111", "M2");
        listaMatricula[4] = new Matricula("U11111111", "c05", "S11111111", "M2");
        
        listaMatricula[5] = new Matricula("U11111112", "c01", "S11111111", "M1");
        listaMatricula[6] = new Matricula("U11111112", "c02", "S11111111", "M1");
        listaMatricula[7] = new Matricula("U11111112", "c03", "S11111112", "BM");
        listaMatricula[8] = new Matricula("U11111112", "c05", "S11111111", "M2");
        listaMatricula[9] = new Matricula("U11111112", "c06", "S11111113", "M2");
        

        //Ingresa a MisCursos y se listan los cursos Matriculados Por Modulo
        //Ingresa Al Curso Matriculado e Ingresa las notas y se calcula el promedio final según formula
        Scanner sn = new Scanner(System.in);
       // sn.useDelimiter("\n");
        boolean salir = false;
        //variable para guardar la opcion que elije el usuario
        int opcion;
        while(!salir){
            System.out.println("============================================");
            System.out.println("========Menu Principal======================");
            System.out.println("============================================");
            System.out.println("1. Listar Alumnos");
            System.out.println("2. Mis Cursos");
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
                        for(int i=0; i<listaAlumno.length;i++){
                            
                            System.out.println(listaAlumno[i]);
                            
                        }
                      
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
