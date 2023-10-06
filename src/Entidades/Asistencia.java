package Entidades;

public class Asistencia {
    private Estudiante estudiante;
    private boolean presente;

    public Asistencia() {
    }

    public Asistencia(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.presente = false;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
    

}