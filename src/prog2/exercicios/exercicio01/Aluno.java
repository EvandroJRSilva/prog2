package prog2.exercicios.exercicio01;

public class Aluno extends Pessoa implements PessoaFisica 
{
	private String cpf, rg, matricula;
	
	public Aluno(String nome, String rg, String cpf)
	{
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	@Override
	public String getCPF() 
	{
		return cpf;
	}

	@Override
	public void setCPF(String cpf) 
	{
		this.cpf = cpf;
	}

	@Override
	public String getRG() 
	{
		return rg;
	}

	@Override
	public void setRG(String rg) 
	{
		this.rg = rg;
	}
	
	public String getMatricula()
	{
		return matricula;
	}
	
	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

}
