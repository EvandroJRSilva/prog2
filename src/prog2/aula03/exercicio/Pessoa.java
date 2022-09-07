package prog2.aula03.exercicio;

public abstract class Pessoa 
{
	protected String nome;
	protected ContaCorrente contaCorrente;
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public ContaCorrente getContaCorrente() 
	{
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) 
	{
		this.contaCorrente = contaCorrente;
	}
}
