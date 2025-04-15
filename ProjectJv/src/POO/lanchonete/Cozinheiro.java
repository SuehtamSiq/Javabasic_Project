package POO.lanchonete;

public class Cozinheiro {


    public void adicionarLancheBalcao() {
        System.out.println("DICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }

    public void adicionarSucoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    
    public void adicionarComboBalcao() {
        adicionarLancheBalcao();
        adicionarSucoBalcao();
    }

    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    public void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    public void selecionarIngredientesVitaminas() {
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }

    public void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    public void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanches() {
        System.out.println("FRITANDO CARNE E OVO PARA O HAMBURGUER");
    }

    public void pedriTrocaGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirTrocaGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}
