package prog2.aula03.exercicio;

public class ContaCorrente implements Agencia, Conta 
{
	private String titular, codigoCC, codigoAgencia, nomeBanco;
	private double saldo;
	
	
	public ContaCorrente(String titular, String codigoCC, String nomeBanco, String codigoAgencia)
	{
		this.titular = titular;
		this.codigoCC = codigoCC;
		this.nomeBanco = nomeBanco;
		this.codigoAgencia = codigoAgencia;
	}
	
	
	public String getTitular()
	{
		return this.titular;
	}
	
	public void setTitular(String nome)
	{
		this.titular = nome;
	}
	
	@Override
	public void depositar(double valor) 
	{
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) throws Exception 
	{
		if(this.saldo >=0)
			this.saldo -= valor;
		else
			throw new Exception("Valor de saldo insuficiente!");
	}

	@Override
	public double getSaldo() 
	{
		return this.saldo;
	}

	@Override
	public String getCodigo() 
	{
		return this.codigoCC;
	}

	@Override
	public void setCodigo(String codigo) 
	{
		this.codigoCC = codigo;
	}

	@Override
	public String getNomeBanco() 
	{
		return this.nomeBanco;
	}

	@Override
	public void setNomeBanco(String nome)
	{
		this.nomeBanco = nome;
	}

	@Override
	public String getCodAgencia() 
	{
		return this.codigoAgencia;
	}

	@Override
	public void setCodAgencia(String codigo) 
	{
		this.codigoAgencia = codigo;
	}

}
