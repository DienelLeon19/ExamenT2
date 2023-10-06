    package Entidades;

public class Aula {
    
    private String horario;
    private String turno;
    private String curso;
    private Estudiante[] estudiantes;
    private Asistencia[] asistencias;

    public Aula()
    {   
        this.estudiantes = new Estudiante[10];
        this.asistencias = new Asistencia[10];
    }

    
    public Aula(String horario, String curso,String turno) 
    {
        this.horario = horario;
        this.curso = curso;
        this.turno =turno;
        this.estudiantes = new Estudiante[10];
        this.asistencias = new Asistencia[10]; 
    }

    public String getHorario() {
        return horario;
    }
    public String getCurso() {
        return curso;
    }
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    public Asistencia[] getAsistencias() {
        return asistencias;
    }
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void setAsistencias(Asistencia[] asistencias) {
        this.asistencias = asistencias;
    }
     public String Texto() 
    {   return "Curso: " +this.curso + " │ Turno: " +
        this.turno + " │ Codigo: " + this.horario;}
     
    public Aula AgregarAula(String curso,String horario,String Turno)
    {
        Aula Nuevo = new Aula();
        Nuevo.setCurso(curso);
        Nuevo.setHorario(horario);
        Nuevo.setTurno(Turno);
        return Nuevo;
    }


     public void agregarEstudiante(Estudiante estudiante) 
    {   
        for (int i = 0; i < 30; i++)
        {   
            if (this.estudiantes[i] == null)
            {
                this.estudiantes[i] = estudiante;
                break;
            }
        }
    }
     
      public void eliminarEstudiante(int indice) {
        if (indice < 0 || indice >= 30 ) 
        {   return;}//si esta fuera del indice
        if (estudiantes[indice] == null)
        {   return;}//si esta vacio
        estudiantes[indice] = null;
    }
     
     
     
     
     
     
     
     
}
