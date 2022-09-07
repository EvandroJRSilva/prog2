package prog2.aula03;

import java.util.ArrayList;

public class Curso 
{
	String id;
	String nome;
	double mensalidade;
	int qtdPeriodo;
	ArrayList<Disciplina> disciplinas;
	
	//------------------------------------------------------------------
	//CONSTRUTORES
	//------------------------------------------------------------------	
	public Curso()
	{
		//FAZER NADA
	}
	
	public Curso(String id)
	{
		this.id = id;
	}
	
	public Curso(String id, String nome)
	{
		this.id = id;
		this.nome = nome;
	}
	
	public Curso(String id, String nome, double mensalidade)
	{
		this.id = id;
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
	
	public Curso(String id, String nome, double mensalidade, int qtdPeriodo)
	{
		this.id = id;
		this.nome = nome;
		this.mensalidade = mensalidade;
		this.qtdPeriodo = qtdPeriodo;
	}
	
	//------------------------------------------------------------------
	//GETTERS AND SETTERS
	//------------------------------------------------------------------
	public String getId() 
	{
		return id;
	}
	
	public void setId(String id) 
	{
		this.id = id;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public double getMensalidade() 
	{
		return mensalidade;
	}
	
	public void setMensalidade(double mensalidade) 
	{
		this.mensalidade = mensalidade;
	}
	
	public int getQtdPeriodo() 
	{
		return qtdPeriodo;
	}
	
	public void setQtdPeriodo(int qtdPeriodo) 
	{
		this.qtdPeriodo = qtdPeriodo;
	}
	
	public ArrayList<Disciplina> getDisciplinas() 
	{
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) 
	{
		this.disciplinas = disciplinas;
	}
	
	//------------------------------------------------------------------
	//DEMAIS MÉTODOS
	//------------------------------------------------------------------
	public void addDisciplina(Disciplina d)
	{
		disciplinas.add(d);
	}
	
	public void rmvDisciplina(Disciplina d)
	{
		disciplinas.remove(d);
	}
}
