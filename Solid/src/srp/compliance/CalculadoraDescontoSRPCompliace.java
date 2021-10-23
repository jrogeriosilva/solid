package srp.compliance;

import srp.Pedido;

public class CalculadoraDescontoSRPCompliace {
	public double calculaDesconto(Pedido pedido) {
		if(pedido.getTipoPagamento().equals(TipoPagamento.BOLETO)) {
			return new DezOuVintePorCento().calcula(pedido);
		}
		if(pedido.getTipoPagamento().equals(TipoPagamento.CARTAO_CREDITO)) {
			return new CincoOuDezPorCento().calcula(pedido);
		}
		
		
		throw new RuntimeException("cartao invalido");	
	}

	
	/**
	 * Perceba cada classe tem sua responsabilidade Definida Porém Ainda está Violando o OCP (Open Clossed Principle)
	 */

}
