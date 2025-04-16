package POO.lanchonete.atendimento.cozinha;

import POO.lanchonete.atendimento.Atendente;

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

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    private void selecionarIngredientesVitaminas() {
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanches() {
        System.out.println("FRITANDO CARNE E OVO PARA O HAMBURGUER");
    }

    private void pedirTrocaGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}
