package prog2.aula03;

import java.lang.annotation.Documented;

@Documented
public @interface DadosDaClasse 
{
	String autor();
	String data();
	int versao() default 1;
	String dataUltimaModificacao() default "N/A";
	double pesoAutor() default 75.5;
	boolean isAdministrador() default false;
}
