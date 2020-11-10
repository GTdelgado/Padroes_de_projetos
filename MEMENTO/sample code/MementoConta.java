import java.util.ArrayList;
import java.util.List;

public class MementoConta {
	private Double saldo;
	private List<String> historico = new ArrayList<>();

	public MementoConta(Double saldo, ArrayList<String> historico) {
		this.saldo = saldo;
		this.historico = (List<String>) historico.clone();
	}

	public Double getSaldo() {
		return saldo;
	}

	public ArrayList<String> getHistorico() {
		return (ArrayList<String>) historico;
	}
}
