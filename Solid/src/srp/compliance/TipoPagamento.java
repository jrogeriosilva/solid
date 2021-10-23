package srp.compliance;

public enum TipoPagamento {
	BOLETO(new DezOuVintePorCento()), CARTAO_CREDITO(new CincoOuDezPorCento());

	private RegraDeCalculoDesconto regra;

	TipoPagamento(RegraDeCalculoDesconto regra) {
		this.regra = regra;
	}

	public RegraDeCalculoDesconto getRegra() {
		return regra;
	}
}
