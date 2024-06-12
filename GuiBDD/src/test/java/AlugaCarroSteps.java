import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.AlugaCarro;

import static org.junit.Assert.*;

public class AlugaCarroSteps {

    private AlugaCarro alugaCarro = new AlugaCarro();
    private boolean fazReserva = false;
    private boolean pedidoAdiantado = false;

    @Given("O cliente faz o pedido de reserva.")
    public boolean clienteFazPedidoDeReserva() {
        fazReserva = true;
        return fazReserva;
    }

    @And("O pedido é feito até uma semana antes da data de retirada do carro.")
    public boolean condicaoPedidoAdiantado() {
        pedidoAdiantado = true;
        return pedidoAdiantado;
    }

    @Then("O cliente recebe 10% de desconto, e a reserva é feita.")
    public void ajusteReservaDesconto(){
        boolean ajusteReserva = condicaoPedidoAdiantado();
        boolean fazReserva = clienteFazPedidoDeReserva();
        double valorFinal = alugaCarro.calculaValorFinal(fazReserva, ajusteReserva);
        assertEquals(900, valorFinal, 0.0);
    }

    @And("O pedido é feito a menos de uma semana da data.")
    public boolean condicaoPedidoAtrasado() {
        pedidoAdiantado = false;
        return pedidoAdiantado;
    }

    @Then("O cliente deverá pagar uma taxa de 10%, e a reserva é feita.")
    public void ajusteReservaTaxa() {
        boolean condicaoPedido = condicaoPedidoAtrasado();
        boolean fazReserva = clienteFazPedidoDeReserva();
        double valorFinal = alugaCarro.calculaValorFinal(fazReserva, condicaoPedido);
        assertEquals(1100, valorFinal, 0.0);
    }

}

