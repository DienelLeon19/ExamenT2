    
package Entidades;


public class ExamenT2 
{
    public static void main(String[] args) 
    {
      
        Aula aula = new Aula();
        SistemaAsistencia Ref = new SistemaAsistencia();
        Ref.setLocationRelativeTo(Ref);
        Ref.setVisible(true); 

        Ref.agregaraula(aula.AgregarAula("Trigonometría",
                "7:30am | 10:00 am", "Mañana"));
        Ref.agregaraula(aula.AgregarAula("Geometría",
                "1:30pm | 4:00 pm", "Tarde"));
        Ref.agregaraula(aula.AgregarAula("Trigonometría",
                "6:30pm | 9:00 pm", "Noche"));
        
        
    }
 
}
