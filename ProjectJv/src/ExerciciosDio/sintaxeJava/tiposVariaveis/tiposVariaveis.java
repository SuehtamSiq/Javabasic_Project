package ExerciciosDio.sintaxeJava.tiposVariaveis;

public class tiposVariaveis {

    public static void main(String[] args) throws Exception {
        
        /*  
        * Tipos de variáveis presentes na linguagem.
        */

        byte age = 1;
        short year = 2025;
        int numberHome = 260;
        long id = 65474837;
        float price = 0;
        double salary = 2500.80;
        boolean yes = true;
        char sex = 'M';
        String name = "Matheus";

        
        System.out.println(age);
        System.out.println(year);
        System.out.println(numberHome);
        System.out.println(id);
        System.out.println(price);
        System.out.println(salary);
        System.out.println(yes);
        System.out.println(sex);
        System.out.println(name);
        

        /*
         * Ao usar a palavra reservada final, você determina uma constante,
         * ou seja, declara que esta variavel não podera receber outro valor;
         * 
         * Além de que todas as varaiveis final deven conter
         * o nome em CAIXA ALTA.
         */
        
        final double VALOR_DE_PI = 3.14;

        System.out.println("O valor de PI é " + VALOR_DE_PI);

    }
    
}
