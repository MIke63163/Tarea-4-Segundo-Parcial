
public class Cuadrado{
    protected Tiempo tiempoDeVida;
    protected char id;
    
    public Cuadrado(){
    tiempoDeVida = new Tiempo();
    id           = '0';
    }
   public char getId(){
        return id;
    }
    public Tiempo getTvida(){
        return tiempoDeVida;
    }
   public void setTime(Tiempo t){
      tiempoDeVida = t;
    }
    }


