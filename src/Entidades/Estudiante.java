    package Entidades;

public class Estudiante 
{
    private String nombre;
    private String apellido;

    public Estudiante(){}
   
    public Estudiante(String nombre, String apellido)
    {   this.nombre = nombre;
        this.apellido = apellido;}    

    public void setNombre(String nombre) 
    {   this.nombre = nombre;}

    public void setApellido(String apellido)
    {   this.apellido = apellido;}

    public String getNombre()
    {   return nombre;}

    public String getApellido()
    {   return apellido;}
    
    
    public String Texto()
    {return "Nombre: "+this.nombre +" Apellido: "+this.apellido ;}
      
}
