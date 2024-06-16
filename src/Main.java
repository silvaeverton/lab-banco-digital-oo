

public class Main {

	public static void main (String[] args ) {

		
	
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente everton = new Cliente();
		everton.setNome("Everton");
		

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		 cc = new ContaCorrente(everton);
		 poupanca = new ContaPoupanca(everton);

		

		
 
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.listarClientes();

	
	}

	
	
}
