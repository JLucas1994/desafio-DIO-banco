package one.dio.br;

public class Main {
	
	public static void main(String[] args) {
		Cliente José = new Cliente ();
		José.setNome ("José");
		
		Conta cc = new ContaCorrente(José);
		Conta poupanca = new ContaPoupanca(José);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
