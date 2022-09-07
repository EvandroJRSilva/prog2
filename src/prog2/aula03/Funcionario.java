package prog2.aula03;

public class Funcionario extends PessoaFisica
{
	private String cartao;

	//------------------------------------------------------------------
	//CONSTRUTORES
	//------------------------------------------------------------------
	public Funcionario()
	{
		
	}
	
	public Funcionario(String cartao)
	{
		this.cartao = cartao;
	}
	
	public Funcionario(String nome, String rg, String cpf, String cartao)
	{
		super(nome, rg, cpf);
		this.cartao = cartao;
	}
	
	public Funcionario(String nome, String rg, String cpf, String cartao, Conta conta)
	{
		super(nome, rg, cpf, conta);
		this.cartao = cartao;
	}
	
	//------------------------------------------------------------------
	//GETTERS AND SETTERS
	//------------------------------------------------------------------
	public String getCartao() 
	{
		return cartao;
	}
	
	public void setCartao(String cartao) 
	{
		this.cartao = cartao;
	}	
}
