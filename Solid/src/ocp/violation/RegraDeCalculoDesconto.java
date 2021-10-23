package ocp.violation;

import srp.Pedido;

public interface RegraDeCalculoDesconto {
	double calcula(Pedido pedido);
}
