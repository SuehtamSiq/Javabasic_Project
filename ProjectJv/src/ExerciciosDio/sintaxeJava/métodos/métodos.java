package ExerciciosDio.sintaxeJava.métodos;

import java.util.Scanner;
 
public class métodos {

    // Sistema_SmartTv

    boolean ligada = false;
    int canal = 1;
    int volume = 30;
    Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner
    

    public void ligar(){
        ligada=true;
    } 

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void dimonuirVolume(){
        volume--;
    }

    public void proximoCanal(){
        canal++;
    }

    public void canalAnterior(){
        canal--;
    }

    public void escolherCanal(){
       System.out.print("Qual canal desejado? ");
       canal = scanner.nextInt();

    }




}
