package prog2.exercicios.exercicio01;

public class Professor extends Funcionario implements PessoaFisica 
{		
	public Professor(String nome, String rg, String cpf)
	{
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
}
