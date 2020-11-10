import java.util.ArrayList;
import java.util.List;

public class Conta {
	private String nome;
	private String documento;

	private Double saldo;
	private List<String> historicoOperacoes = new ArrayList<>();

	public Conta(String nome, String documento) {
		this.nome = nome;
		this.documento = documento;
		this.saldo = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public String getDocumento() {
		return documento;
	}

	public Double getSaldo() {
		return saldo;
	}

	public List<String> getHistoricoOperacoes() {
		return (ArrayList<String>) historicoOperacoes;
	}

	public void sacar(Double valor) {
		if ((this.saldo - valor) >= 0) {
			this.saldo -= valor;
			this.historicoOperacoes.add("Saque de R$ " + valor + " Saldo = " + this.saldo);
		} else {
			System.out.println("Saque cancelado, valor indisponivel");
		}
	}

	public void depositar(Double valor) {
		this.saldo += valor;
		this.historicoOperacoes.add("Deposito de R$ " + valor + " Saldo = " + this.saldo);
	}

	public MementoConta salvarEstado() {
		return new MementoConta(this.saldo, (ArrayList<String>) this.historicoOperacoes);
	}

	public void retroceder(MementoConta memento) {
		this.saldo = memento.getSaldo();
		this.historicoOperacoes = (List<String>) memento.getHistorico().clone();
	}
}
