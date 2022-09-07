package prog2.aula03;

public class Pessoa 
{
	String nome;
	Conta conta;

	
	//------------------------------------------------------------------
	//CONSTRUTORES
	//------------------------------------------------------------------
	public Pessoa()
	{
		// ...
	}
	
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	
	public Pessoa(String nome, Conta conta)
	{
		this.nome = nome;
		this.conta = conta;
	}
	
	//------------------------------------------------------------------
	//GETTERS AND SETTERS
	//------------------------------------------------------------------
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	//------------------------------------------------------------------
	//DEMAIS MÉTODOS
	//------------------------------------------------------------------
	public void mostraClasse()
	{
		System.out.println("Esta é a classe Pessoa");
	}
}
