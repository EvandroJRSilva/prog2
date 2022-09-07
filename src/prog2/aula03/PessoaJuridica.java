package prog2.aula03;

public class PessoaJuridica extends Pessoa
{
	String cnpj;
	String nomeFantasia;
	
	
	//------------------------------------------------------------------
	//GETTERS AND SETTERS
	//------------------------------------------------------------------
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
}
