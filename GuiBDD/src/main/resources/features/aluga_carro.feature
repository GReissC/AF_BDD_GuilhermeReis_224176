Feature: Aluguel de Carro
  O cliente busca alugar um carro de luxo.

  Scenario: O cliente reserva com antecedência, ganhando desconto.
  Given: O cliente faz o pedido de reserva.
  And: O pedido é feito até uma semana antes da data de retirada do carro.
  Then: O cliente recebe 10% de desconto, e a reserva é feita.

  Scenario: O cliente reserva sem antecedência.
  Given: O cliente faz o pedido de reserva.
  And: O pedido é feito a menos de uma semana da data.
  Then: O cliente deverá pagar uma taxa de 10%, e a reserva é feita.