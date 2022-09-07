package prog2.aula03.exercicio;

public interface Conta 
{		
	/* Valores */
	public void depositar(double valor);
	public void sacar(double valor) throws Exception;
	public double getSaldo();
	
	/* Códigos */
	public String getCodigo();
	public void setCodigo(String codigo);
}
