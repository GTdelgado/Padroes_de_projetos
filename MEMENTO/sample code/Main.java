
public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta("Fulano", "234.1546.15");
		CareTakerConta careTakerConta = new CareTakerConta();

		conta.depositar(240.00);
		careTakerConta.add(conta.salvarEstado());

		conta.depositar(150.00);
		careTakerConta.add(conta.salvarEstado());

		conta.sacar(100.00);
		careTakerConta.add(conta.salvarEstado());

		conta.sacar(200.00);

		System.out.println("Atual : " + conta.getSaldo() + " Historio " + conta.getHistoricoOperacoes().toString());
		System.out.println("Operacao 1: " + careTakerConta.getState(0).getSaldo() + " Historio "
				+ careTakerConta.getState(0).getHistorico().toString());
		System.out.println("Operacao 2: " + careTakerConta.getState(1).getSaldo() + " Historio "
				+ careTakerConta.getState(1).getHistorico().toString());
		System.out.println("Operacao 3: " + careTakerConta.getState(2).getSaldo() + " Historio "
				+ careTakerConta.getState(2).getHistorico().toString());

		conta.retroceder(careTakerConta.getState(0));
		System.out.println("Atual : " + conta.getSaldo() + " Historio " + conta.getHistoricoOperacoes().toString());

	}

}
