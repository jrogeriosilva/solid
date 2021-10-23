package srp.compliance;

import srp.Pedido;

public interface RegraDeCalculoDesconto {
	double calcula(Pedido pedido);
}
