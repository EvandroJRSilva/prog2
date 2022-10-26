package prog2.aula07;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTExemplo2 
{
	public AWTExemplo2()
	{
		Frame f = new Frame();
		Label l = new Label("Cartão do Funcionário:");
		Button b = new Button("Enviar");
		TextField t = new TextField();
		
		// Configurando as posições (x, y, largura, altura)
		l.setBounds(20, 80, 130, 30);
		t.setBounds(20, 110, 80, 30);
		b.setBounds(100, 110, 80, 30);
		
		// Adicionando os componentes ao frame
		f.add(b); f.add(l); f.add(t);
		
		// Tamanho do frame: 400 de largura, 300 de altura
		f.setSize(400, 300);
		
		f.setTitle("Informaçao do Funcionarário");
		
		f.setLayout(null);
		f.setVisible(true);
		
		// Para fechar a janela
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				f.dispose();
				}
			}
		);
		
	}
	
	public static void main(String[] args)
	{
		new AWTExemplo2();
	}
}
