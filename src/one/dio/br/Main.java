package one.dio.br;

public class Main {
	
	public static void main(String[] args) {
		Cliente Jos� = new Cliente ();
		Jos�.setNome ("Jos�");
		
		Conta cc = new ContaCorrente(Jos�);
		Conta poupanca = new ContaPoupanca(Jos�);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
