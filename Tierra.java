

public class Tierra extends Cuadrado{
   private boolean cesped;
   private boolean estado;
   public Tierra(){
    super();
    id     = 'T';
    cesped = false;
    estado = true;
   }
   public boolean getEstado(){
        return estado;
    }   
}
   

