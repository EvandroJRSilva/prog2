package prog2.exercicios.exercicio01;

public abstract class Funcionario extends Pessoa implements PessoaFisica 
{
	protected String cpf, rg;
	
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

}
