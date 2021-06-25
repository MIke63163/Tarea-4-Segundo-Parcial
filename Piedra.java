
public class Piedra extends Cuadrado{
    private boolean rajado;
    private boolean roto;
    public Piedra(){
       super();
       id = 'P';
       rajado = false;
       roto   = false;
    }
    public boolean rajado(){
        return rajado;
    }
    public boolean roto(){
         return roto;
    }
}
