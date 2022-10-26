package prog2.aula07;

import javax.swing.*;

public class SwingExemplo 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Frame do Olar Mundo");
		final JLabel label = new JLabel("Olar Mondo!");
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
