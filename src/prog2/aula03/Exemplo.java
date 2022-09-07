package prog2.aula03;

import java.lang.annotation.Documented;

@Documented
public @interface Exemplo 
{
	boolean isExemplo() default false;
}
