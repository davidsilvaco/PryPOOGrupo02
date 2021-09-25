package utpmas.utp.edu.pe;

public class TestData {
    public RegistroPersona regriper;
    public MisCursos regMisCursos;
    public void creadata(){
        //Crea array por defecnto de alumnos
        Alumno listaAlumno[] = new Alumno[4];
        Docente listaDocente[] = new Docente[3];
        Curso listaCurso[] = new Curso[6];
        Matricula listaMatricula[] = new Matricula[10];

        RegistroPersona regriper = new RegistroPersona();
        MisCursos regMisCursos = new MisCursos();

        listaAlumno[0] = new Alumno("NomAlumno01", "apellidos01", "dni01", 'M', "02/03/1990", "U11111111", "U11111111@utp.edu.pe");
        listaAlumno[1] = new Alumno("NomAlumno02", "apellidos02", "dni02", 'F', "03/03/1990", "U11111112");
        listaAlumno[2] = new Alumno("NomAlumno03", "apellidos03", "dni03", 'M', "04/03/1990", "U11111113");
        listaAlumno[3] = new Alumno("NomAlumno04", "apellidos04", "dni04", 'M', "04/03/1990", "U11111114");
        for(int i=0;i<listaAlumno.length;i++){
            regriper.agregar(listaAlumno[i]);
        }
        //crea array por defecto de Docentes
        listaDocente[0] = new Docente("NomDocente01", "apellidos04", "dni04", 'M', "05/03/1990", "S11111111");
        listaDocente[1] = new Docente("NomDocente02", "apellidos04", "dni04", 'M', "05/03/1990", "S11111112");
        listaDocente[2] = new Docente("NomDocente03", "apellidos04", "dni04", 'M', "05/03/1990", "S11111113");
        for(int i=0;i<listaDocente.length;i++){
            regriper.agregar(listaDocente[i]);
        }
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
        for(int i=0;i<listaMatricula.length;i++){
            regMisCursos.agregar(listaMatricula[i]);
        }

        this.regMisCursos = regMisCursos;
        this.regriper = regriper;

    }
    
}
