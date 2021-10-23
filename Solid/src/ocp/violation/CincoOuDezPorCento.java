package ocp.violation;

import srp.Pedido;

public class CincoOuDezPorCento implements RegraDeCalculoDesconto {
	@Override
	public double calcula(Pedido cartao) {
			if (cartao.getValorCompra() > 999) {
				return cartao.getValorCompra() * 0.02;
			}
			return cartao.getValorCompra() * 0.01;
	}
}
