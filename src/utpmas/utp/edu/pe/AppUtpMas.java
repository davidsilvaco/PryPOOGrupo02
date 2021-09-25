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
public class AppUtpMas implements Constantes{
    public static void main(String[] args){
        
        
        RegistroPersona regriper = new RegistroPersona();
        RegistroCurso regcursos = new RegistroCurso();
        MisCursos regMisCursos = new MisCursos();
        
        
        TestData testData = new TestData();

        testData.creadata();
        regMisCursos = testData.regMisCursos;
        regriper = testData.regriper;
        regcursos = testData.regcursos;

        //Ingresa a MisCursos y se listan los cursos Matriculados Por Modulo
        //Ingresa Al Curso Matriculado e Ingresa las notas y se calcula el promedio final según formula
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        //variable para guardar la opcion que elije el usuario
        int opcion;
        String sopcion;

        while(!salir){
            System.out.println("============================================");
            System.out.println("========Menu Principal======================");
            System.out.println("============================================");
            System.out.println("1. Listar Alumnos");            
            System.out.println("2. Mis Cursos");
            System.out.println("3. Notas Por Curso");
            System.out.println("99. Salir");
            System.out.println("============================================");
            System.out.println("============================================");
            try{
                System.out.println("Estimad usuario, ingrese una opción:");
                opcion = sn.nextInt();
                
                switch(opcion){
                    case 1: //Añadir contactos
                        //Pedir valores
                       regriper.listar();
                      
                        break;
                    case 2://Mis Cursos
                        //Lista Matriculados
                        regMisCursos.listar();
                        //Pedrir Codigo de Alumno que es un String
                        System.out.println("Ingrese Codigo de Alumno:");
                        sopcion = sn.next();
                        
                        regMisCursos.listaCursosAlumno(sopcion);
                        System.out.println("Ingrese Codigo de Curso:");
                        sopcion = sn.next();
                        String[] evaluaciones;
                        double notas[]= new double[4];
                        double notafinal=0;
                        
                        evaluaciones = regcursos.obtieneEvaluacion(sopcion);
                        
                        for(int i =0; i<evaluaciones.length;i++ ){
                            System.out.println("Ingrese Nota Para "+evaluaciones[i]+" :");
                            notas[i]=sn.nextDouble();
                        }
                        
                        notafinal = Curso.calculaNotaCurso(notas);

                        System.out.println("La Nota Final del Curso Es: "+notafinal);
                        if (notafinal>=NOTA_APROBADO){
                            System.out.println("El Alumno Esta Aprobado :-)");
                        }else {
                            System.out.println("El Alumno Esta Desaprobado :-(");
                        }
                        
                        //Si Alumno No Existe Mostrara un mensaje de Error Alumno No Existe
                        //Si Existe Mostrará Los Cursos Matriculados y Un Nuevo Menu
                            //1 Ingresar Notas Curso
                                //Pide Codigo de Curso y Si no existe muestra error
                                //Si Existe Pide Notas PC01, PC02,EXV
                                //Calcula la Nota Final
                            //99 Retornar Menu Anterior
                       
                        break;
                    case 3://Buscar contacto
                        //Pedir el nombre del contacto a buscar
                     
                        break;                    
                    case 99://salir
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
