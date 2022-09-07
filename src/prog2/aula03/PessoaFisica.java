package prog2.aula03;

public class PessoaFisica extends Pessoa
{
	String rg;
	String cpf;
	
	//------------------------------------------------------------------
	//CONSTRUTORES
	//------------------------------------------------------------------
	public PessoaFisica()
	{
		// ...
	}
	
	public PessoaFisica(String rg, String cpf)
	{
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String rg, String cpf)
	{
		super(nome);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String rg, String cpf, Conta conta)
	{
		super(nome, conta);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	//------------------------------------------------------------------
	//GETTERS AND SETTERS
	//------------------------------------------------------------------
	public String getRg() 
	{
		return rg;
	}
	
	public void setRg(String rg) 
	{
		this.rg = rg;
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	//------------------------------------------------------------------
	//DEMAIS MÉTODOS
	//------------------------------------------------------------------
	@Override
	public void mostraClasse()
	{
		System.out.println("Esta é a classe Pessoa Física");
	}
}
