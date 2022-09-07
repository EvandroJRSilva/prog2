package prog2.aula03;

public class Aluno extends PessoaFisica 
{
	String matricula;
	
	//------------------------------------------------------------------
	//CONSTRUTORES
	//------------------------------------------------------------------
	public Aluno()
	{
		// ...
	}
	
	public Aluno(String nome, String cpf, String rg, String matricula)
	{
		super(nome, cpf, rg);
		this.matricula = matricula;
	}

	//------------------------------------------------------------------
	//GETTERS AND SETTERS
	//------------------------------------------------------------------	
	public String getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(String matricula) 
	{
		this.matricula = matricula;
	}
}
