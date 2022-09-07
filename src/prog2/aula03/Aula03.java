package prog2.aula03;

public class Aula03 {

	public static void main(String[] args) 
	{
		// 1 --------------------------------
		Conta conta1 = new Conta();
		
		System.out.println("Valores padrões da conta:\n"
				+ "Número: " + conta1.getNumero() + "\n"
				+ "Saldo: " + conta1.getSaldo() + "\n"
				+ "Titular: " + conta1.titular);
		
//		conta1.numero = "112233-4";
//		conta1.saldo = 12.01;
		conta1.titular = "Fulano";
		
		conta1.setNumero("112233-4");
		conta1.setSaldo(2.01);
		
		System.out.println("\n\nValores adicionados à conta:\n"
				+ "Número: " + conta1.getNumero() + "\n"
				+ "Saldo: " + conta1.getSaldo() + "\n"
				+ "Titular: " + conta1.titular);
		
		// 2 --------------------------------
//		Conta conta2 =  new Conta("112233-4", 9.99, "Cicrano");
		
		// 3 --------------------------------
//		Pessoa pessoa = new Pessoa();
//		pessoa.mostraClasse();
//		
//		PessoaFisica pessoaFisica = new PessoaFisica();
//		pessoaFisica.mostraClasse();
//		
//		PessoaJuridica pessoaJuridica = new PessoaJuridica();
//		pessoaJuridica.mostraClasse();
	}

}
