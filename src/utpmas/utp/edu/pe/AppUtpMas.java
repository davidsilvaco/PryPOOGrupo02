/* David Gil Silva Collantes U19312681
 * Cargar Cursos
 * Cargar Alumnos
 * Cargar Docentes
 * Cargar matricula. Cursos Docente, Alumno
 * Cargar Notas, Calcula Nota
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
        String codigoalumno,codigocurso;

        while(!salir){
            System.out.println("============================================");
            System.out.println("========Menu Principal======================");
            System.out.println("============================================");
            System.out.println("1. Listar Personas");            
            System.out.println("2. Mis Cursos");            
            System.out.println("99. Salir");
            System.out.println("============================================");
            System.out.println("============================================");
            try{
                System.out.println("Estimado usuario, ingrese una opción:");
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
                        codigoalumno = sn.next();
                        
                        if (regMisCursos.listaCursosAlumno(codigoalumno)){
                            System.out.println("Ingrese Codigo de Curso:");
                            codigocurso = sn.next();
                                //Si Existe Mostrará Los Cursos Matriculados 
                                //1 Ingresar Notas Curso
                                    //Pide Codigo de Curso y Si no existe muestra error
                                    //Si Existe Pide Notas PC01, PC02,EXV
                                                                
                            if(regMisCursos.listaCursosAlumno(codigoalumno, codigocurso)){
                                String[] evaluaciones;
                                double notas[]= new double[4];
                                double notafinal=0;
                                boolean salir2=false;

                                evaluaciones = regcursos.obtieneEvaluacion(codigocurso);

                                for(int i =0; i<evaluaciones.length;i++ ){
                                    salir2=false;
                                    while(!salir2){
                                        try{
                                            System.out.print("Ingrese Nota Para "+evaluaciones[i]+" :");
                                            notas[i]=sn.nextDouble();
                                            if(notas[i]>=NOTA_MINIMA && notas[i]<=NOTA_MAXIMA){
                                                salir2=true;
                                            }else{
                                                System.out.println("La nota debe estar entre "+NOTA_MINIMA + " y " + NOTA_MAXIMA);
                                            }
                                            
                                        }catch(InputMismatchException e){
                                            System.out.println("Debes insertar un numero");
                                            sn.next();
                                        }
                                        
                                    }
                                }
                                
                                //Calcula la Nota Final                            
                                notafinal = Math.round(Curso.calculaNotaCurso(notas));

                                System.out.println("La Nota Final del Curso Es: "+notafinal);
                                if (notafinal>=NOTA_APROBADO){
                                    System.out.println("El Alumno Esta Aprobado :-)\n");
                                }else {
                                    System.out.println("El Alumno Esta Desaprobado :-(\n");
                                }
                            }
                        }else{
                            //Si Alumno No Existe Mostrara un mensaje de Error Alumno No Existe
                            System.out.println("El Alumno No Esta Registrado");
                        }                       
                        
                            //99 Retornar Menu Anterior
                       
                        break;
                      
                    case 99://salir
                        salir = true;
                        break;       
                    default:
                        System.out.println("Opcion no existe! Ingresar solo numeros del 1 al 2 o 99 Para salir.");
                }
                
                 }catch(InputMismatchException e){
                System.out.println("Debes insertar un numero");
                sn.next();
            }
        }
    }

    
    
}
