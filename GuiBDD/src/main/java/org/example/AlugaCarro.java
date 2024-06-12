package org.example;

/**
 * @author Guilherme Reis
 * @version 1.0
 * @since 1.0
 */
public class AlugaCarro {

    private double valorInicial = 1000;

    private double desconto = 0.9;

    private double taxa = 1.1;

    /**
     *
     * @param fazReserva Confirma se o usuario fez reserva
     * @param pedidoAdiantado Confirma se o pedido foi feito adiantadamente
     * @return Valor final da reserva do carro de luxo
     */
    public double calculaValorFinal(boolean fazReserva, boolean pedidoAdiantado) {
        double valorFinal = 0;
        if (fazReserva) {
            if (pedidoAdiantado) {
                valorFinal = valorInicial * desconto;
            } else {
                valorFinal = valorInicial * taxa;
            }
        }


        return valorFinal;
    }
}