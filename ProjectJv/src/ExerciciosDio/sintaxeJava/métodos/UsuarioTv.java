package ExerciciosDio.sintaxeJava.métodos;

public class UsuarioTv {
    
    public static void main(String[] args) throws Exception {
        
         métodos smartTv = new métodos();
          
         System.out.println("TV ligada? " + smartTv.ligada);
         System.out.println("Canal atual: " + smartTv.canal);
         System.out.println("Volume atual: " + smartTv.volume);

         smartTv.ligar();
         System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

         smartTv.aumentarVolume();
         System.out.println("Volume atual: " + smartTv.volume);
        
         smartTv.dimonuirVolume();
         System.out.println("Volume atual: " + smartTv.volume);
        
         smartTv.proximoCanal();
         System.out.println("Canal atual: " + smartTv.canal);

         smartTv.canalAnterior();
         System.out.println("Canal atual: " + smartTv.canal);

         smartTv.escolherCanal();
         System.out.println("Canal atual: " + smartTv.canal);
    }

}
