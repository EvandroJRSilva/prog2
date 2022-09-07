package prog2.aula03;


public class Conta 
{
	private String numero;
	private double saldo;
	String titular;
	
	//------------------------------------------------------------------
	//CONSTRUTORES
	//------------------------------------------------------------------
	public Conta()
	{
		//FAZER NADA
	}
	
	public Conta(String numero)
	{
		this.numero = numero;
	}
	
	public Conta(String numero, double saldo)
	{
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta(String numero, double saldo, String titular)
	{
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	//------------------------------------------------------------------
	//GETTERS AND SETTERS
	//------------------------------------------------------------------
	public String getNumero() 
	{
		return numero;
	}
	
	public void setNumero(String numero) 
	{
		this.numero = numero;
	}
	
	public double getSaldo() 
	{
		return saldo;
	}
	
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	
	public String getTitular() 
	{
		return titular;
	}
	
	public void setTitular(String titular) 
	{
		this.titular = titular;
	}
	
	//------------------------------------------------------------------
	//DEMAIS MÉTODOS
	//------------------------------------------------------------------
	public void sacar(double valor)
	{
		this.saldo -= valor;
		System.out.println(valor + " reais foram retirados da sua conta");
	}
	
	public void depositar(double valor)
	{
		this.saldo += valor;
		System.out.println(valor + " reais foram depositados em sua conta");
	}
	
	public void transferir(Conta destino, double valor)
	{
		this.saldo -= valor;
		destino.depositar(valor);
		System.out.println(valor + " reais foram transferidos da conta " + this.getNumero() + " para a conta " + destino.getNumero());
	}
}