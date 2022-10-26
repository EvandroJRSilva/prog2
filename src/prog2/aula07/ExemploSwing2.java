package prog2.aula07;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExemploSwing2 {

	public static void main(String[] args) 
	{
		/*
		 * Exemplos retirados de:
		 * 	- https://www.guru99.com/java-swing-gui.html
		 * 	- https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
		 * */
		
		/* 1 */
//		JFrame frame = new JFrame("Exemplo 2");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(300, 300);
//		frame.setLocation(800, 300);
//		
//		JButton butão = new JButton("Aperta");
//		frame.getContentPane().add(butão); // colocando o botão no conteúdo inteiro
//		
//		frame.setVisible(true);
		
		/* 2 */
//		JFrame frame = new JFrame("Exemplo 3");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(600, 300);
//		frame.setLocation(800, 300);
//		
//		JButton botão1 = new JButton("Aperta");
//		//botão1.setPreferredSize(new Dimension(100, 100));
//		
//		JButton botão2 = new JButton("nin min");
//		//botão2.setPreferredSize(new Dimension(200, 100));
//		
//		JButton botão3 = new JButton("Abestado");
//		//botão3.setPreferredSize(new Dimension(100, 100));
//		
//		
//		frame.getContentPane().add(botão1, BorderLayout.LINE_START);
//		frame.getContentPane().add(botão2, BorderLayout.CENTER);
//		frame.getContentPane().add(botão3, BorderLayout.LINE_END);
//		
//		//frame.pack();
//		frame.setVisible(true);
		
		/* 3 */
		JFrame frame = new JFrame("Menuzão");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocation(800, 300);
		
		JMenuBar barraMenu = new JMenuBar();
		JMenu menu1 = new JMenu("Arquivo X");
		JMenu menu2 = new JMenu("Me achuda por favor!");
		
		barraMenu.add(menu1); barraMenu.add(menu2);
		
		JMenuItem menu11 = new JMenuItem("A Verdade está lá fora");
		JMenuItem menu22 = new JMenuItem("É só dizer o pix");
		
		menu1.add(menu11);
		menu2.add(menu22);
		
		// Painel no fim da janela
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Escreve aqui");
		JTextField tfield = new JTextField(10);
		JButton enviar = new JButton("Enviar");
		JButton resetar = new JButton("Resetar");
		
		panel.add(label); panel.add(tfield); panel.add(enviar); panel.add(resetar);
		
		// Área de texto bem no mei
		JTextArea tArea = new JTextArea();
		
		// Tacando tudo dentro do frame
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, barraMenu);
		frame.getContentPane().add(BorderLayout.CENTER, tArea);
		frame.setVisible(true);
	}

}
