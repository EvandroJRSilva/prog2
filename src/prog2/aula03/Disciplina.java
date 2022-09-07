package prog2.aula03;

import java.time.LocalTime;
import java.util.ArrayList;

public class Disciplina 
{
	String nome, id, sala;
	LocalTime horaInicio, horaFim;
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	//------------------------------------------------------------------
	//CONSTRUTORES
	//------------------------------------------------------------------
	public Disciplina()
	{
		// ...
	}
	
	public Disciplina(String nome, String id)
	{
		this.nome = nome;
		this.id = id;
	}
	
	public Disciplina(String nome, String id, String sala, LocalTime horaInicio, LocalTime horaFim)
	{
		this.nome = nome;
		this.id = id;
		this.sala = sala;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
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

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getSala() 
	{
		return sala;
	}

	public void setSala(String sala) 
	{
		this.sala = sala;
	}

	public LocalTime getHoraInicio() 
	{
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) 
	{
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFim() 
	{
		return horaFim;
	}

	public void setHoraFim(LocalTime horaFim) 
	{
		this.horaFim = horaFim;
	}

	public ArrayList<Aluno> getAlunos() 
	{
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) 
	{
		this.alunos = alunos;
	}
	
	//------------------------------------------------------------------
	//DEMAIS MÉTODOS
	//------------------------------------------------------------------
	public void addAluno(Aluno a)
	{
		alunos.add(a);
	}
	
	public void rmvAluno(Aluno a)
	{
		alunos.remove(a);
	}
}
