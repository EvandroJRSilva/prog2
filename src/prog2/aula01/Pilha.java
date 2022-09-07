package prog2.aula01;


import java.util.ArrayList;
import java.util.EmptyStackException;

import prog2.aula03.DadosDaClasse;
import prog2.aula03.Exemplo;

@DadosDaClasse(
	autor = "Fulano",
	data = "18/08/22",
	dataUltimaModificacao = "01/09/22",
	isAdministrador = true,
	pesoAutor = 83.9,
	versao = 3
		)
@Exemplo(isExemplo = true)
public class Pilha<T> 
{

	public static void main(String[] args) 
	{
		Pilha<Integer> pilhaInt = new Pilha<Integer>(3);
		Pilha<String> pilhaString = new Pilha<String>();
		
		pilhaInt.empilhar(5);
		pilhaInt.empilhar(12);
		pilhaInt.empilhar(22);
		
		pilhaString.empilhar("olar");
		pilhaString.empilhar("olar de novo");
		
		System.out.println("\n");
		
		int elemento = pilhaInt.desempilhar();
		System.out.println(elemento);
		
		String selemento = pilhaString.desempilhar();
		System.out.println(selemento);
	}
	
	private final ArrayList<T> pilhados; //arraylist para armazenar na pilha
	
	//Construtor -> só funciona com o construtor seguinte
	public Pilha()
	{
		this(10); //tamanho padrão da pilha
	}
	
	public Pilha(int quantidade)
	{
		/*Se quantidade for menor ou igual a zero, esse construtor garante que 
		 * a pilha terá o tamanho padrão de 10*/
		int qtdInicial = quantidade > 0 ? quantidade : 10;
		if(quantidade <= 0)
			System.out.println("Ta de zoação comigo?");
		pilhados = new ArrayList<T>(qtdInicial);
	}
	
	// MÉTODOS
	// Empilhation
	public void empilhar(T valor)
	{
		pilhados.add(valor);
		for(T elemento : pilhados)
			System.out.println(elemento);
		
		System.out.println();
	}
	
	//Desempilhation
	public T desempilhar()
	{
		if(pilhados.isEmpty()) //se a pilha estiver vazia, lança ex-seção (eu sei que é exceção)
		{
			System.out.println("Ta de brication uite me? Pra desempilhar tem que ter alguma coisa mané!");
			throw new EmptyStackException();
		}
		
		return pilhados.remove(pilhados.size()-1);
	}
}
