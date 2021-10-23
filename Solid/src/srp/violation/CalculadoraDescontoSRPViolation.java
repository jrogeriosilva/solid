package srp.violation;

import srp.Pedido;

public class CalculadoraDescontoSRPViolation {
	public double calculaFrete(Pedido pedido) {
		if (pedido.getTipoPagamento().equals(TipoPagamento.BOLETO)) {
			return dezOuVintePorCento(pedido);
		}
		if (pedido.getTipoPagamento().equals(TipoPagamento.CARTAO_CREDITO)) {
			return cincoOuDezPorCento(pedido);
		}
		throw new RuntimeException("cartao invalido");
	}

	private double cincoOuDezPorCento(Pedido pedido) {
		if (pedido.getValorCompra() > 999) {
			return pedido.getValorCompra() * 0.10;
		}
		return pedido.getValorCompra() * 0.05;
	}

	private double dezOuVintePorCento(Pedido cartao) {
		if (cartao.getValorCompra() > 999) {
			return cartao.getValorCompra() * 0.20;
		}
		return cartao.getValorCompra() * 0.10;
	}
	
	
	
	/**
	 * Observe que cada uma das regras está sendo Inplementada por
	 *	um método privado:
	 * - doisOuQuatroPorcento() e o
	 * - doisOuQuatroPorcento()
	 * Porém, o SRP (Single Responsability Principle) é Bem claro: 
	 * Uma classe deve ter um, e somente um, motivo para mudar
	 */
	
	/**
	 * Apesar de viola também o OCP, essa classe viola o SRP porque tem multiplas responsabilidades.
	 * Decidir qual estrategia de calculo com base no  tipo do cartao e calcular.
	 */
}
