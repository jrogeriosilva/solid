package ocp;

import srp.violation.TipoPagamento;

public class Pedido {
	private TipoPagamento tipoPagamento;
	private double valorCompra;

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valoCompra) {
		this.valorCompra = valoCompra;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoCartao(TipoPagamento tipoCartao) {
		this.tipoPagamento = tipoCartao;
	}

}
