package prog2.aula07;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTExemplo extends Frame
{
	public AWTExemplo()
	{
		Button b = new Button("Clica nin min");
		
		// Posição do botão na tela (x, y, largura, altura)
		b.setBounds(30, 100, 80, 30);
		
		// Adicionando o botão ao Frame
		add(b);
		// Configurando o tamanho do frame
		setSize(300, 300);
		// Configurando o título do frame
		setTitle("Exemplo basicão do AWT");
		
		// Sem gerenciador de layout
		setLayout(null);
		
		// Configurando o frame para visível (default: não visível)
		setVisible(true);
		
		// Para fechar a janela
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				dispose();
				}
			}
		);
	}
	
	public static void main(String[] args)
	{
		new AWTExemplo();
	}
}
