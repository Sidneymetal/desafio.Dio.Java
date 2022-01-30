
public class Main {
	
	public static void main(String[] args) {
		Cliente sidney = new Cliente();
		sidney.setNome("Sidney");
		
		Conta CC= new ContaCorrent();
		Conta CP = new ContaPoupanca();
		
		CC.depositar(100);
		CC.transferir(100, CP);
		
		CC.imprimirExtrato();
		CP.imprimirExtrato();
		
		
	}

}
