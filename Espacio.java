public class Espacio{
   private char[][] cosa;
   private Cuadrado [][] c;
   private Planta planta;
   private Cuadrado cua;
   private Tiempo tiempo;
   private int dim;
   public Espacio(int n){
       cosa   = new char [n][n];
       c      = new Cuadrado [n][n];
       tiempo = new Tiempo();
       dim    = n;
   }
   public void ponerPlanta(){
    
   }
   private void poner(int x, int y){
       cosa[x][y] = cua.getId();
       c[x][y]    = cua;
   }
   public void nextDay(){
       tiempo.nextDia();
   }
  
    private boolean checkEspacio(int x, int y){
        boolean disponible;
        disponible = true;
        if(cosa[x][y] != 0 ) {
           disponible = false;
           }
        return disponible;
    }
    public void ponerTierra(int posX , int posY){
        boolean r;
        r = checkEspacio(posX, posY);
        if(r == true){
           cua = new Tierra();
           poner(posX, posY);
           }
        }
    public void ponerPiedra(int posX, int posY){
        boolean r;
        r = checkEspacio(posX, posY);
        if (r == true){
         cua = new Piedra();
         poner(posX, posY);
        }
    }
    public void ponerMadera(int posX, int posY){
        boolean r;
        r = checkEspacio(posX, posY);
        if (r == true){
            cua = new Madera();
            poner(posX, posY);
        }
    }
    public String mostrar(){
        String reporte;
        int i;
        int j;
        i = 0;
        j = 0;
        reporte = "";
        while(i< dim && j < dim){
              if(i < dim ){
                 reporte += cosa[i][j] + "\t";  
                 i++;

                 if(i == dim){
                       reporte += "\n";
                       j++;
                       i = 0;
                 }
              }
        
        }return reporte;
   }  
    
}
