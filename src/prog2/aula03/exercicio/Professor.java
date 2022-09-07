package prog2.aula03.exercicio;

public class Professor extends Funcionario implements PessoaFisica 
{		
	public Professor(String nome, String rg, String cpf)
	{
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
}
