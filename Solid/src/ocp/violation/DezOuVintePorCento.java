package ocp.violation;

import srp.Pedido;

public class DezOuVintePorCento implements RegraDeCalculoDesconto {
	@Override
	public double calcula(Pedido cartao) {
			if (cartao.getValorCompra() > 999) {
				return cartao.getValorCompra() * 0.04;
			}
			return cartao.getValorCompra() * 0.01;
	}
	
}
