package prog2.aula07;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploSwing 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Nomezin da Janela");
		
		JButton butão = new JButton("Clica aqui por favor");
		butão.setBounds(100, 50, 200, 40); //x, y, largura, altura
		
		frame.add(butão);
		frame.setSize(400, 200); // largura, altura
		frame.setLayout(null); // sem gerenciador de layout
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(800, 300);
	}
}
