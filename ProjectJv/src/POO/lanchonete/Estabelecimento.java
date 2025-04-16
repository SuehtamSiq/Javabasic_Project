package POO.lanchonete;

import POO.lanchonete.area.cliente.Cliente;
import POO.lanchonete.atendimento.Atendente;
import POO.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        // ações que o estabelecimento precia ter ciência
        cozinheiro.adicionarSucoBalcao();
        cozinheiro.adicionarLancheBalcao();
        cozinheiro.adicionarComboBalcao();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
