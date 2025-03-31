package ExerciciosDio.sintaxeJava.operadores;

public class operadores {

    public static void main(String[] args) throws Exception {

        /*  OPERADOR       COMPARAÇÃO
         *     ==            Igual
         *     !=          Diferente
         *     <             Menor
         *     >             Maior
         *     <=          Menor Igual
         *     >=          Maior Igual
         */  


         /*
          * Operadores ternários são variações que podemos usar do if else,
          * usando os operadores ?: podemos realizar essas validações condicionais
          * em apenas uma linha de código.
          */
        
          int a,b;
          a = 9;
          b = 7;

          String resuult = a==b ?"Verdadeiro" : "Falso";

          System.out.println(resuult);

         /*
          * Operadores lógicos podem ser usados para comparação de valores
          * variáveis dentro de um bloco condicional, como o && (E), e o || (OU).
          */

        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");

        }

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");

        }



    }

}
