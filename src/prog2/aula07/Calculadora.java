package prog2.aula07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends Frame implements ActionListener 
{
	Label lb1, lb2, lb3;
	TextField txt1, txt2, txt3;
	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
	
	public Calculadora()
	{
		// Criando os objetos
		lb1 = new Label("Var 1");
		lb2 = new Label("Var 2");
		lb3 = new Label("Resultado");
		
		txt1 = new TextField(10); // aceita até 10 caracteres
		txt2 = new TextField(10);
		txt3 = new TextField(10);
		
		btn1 = new Button("Adicionar");
		btn2 = new Button("Subtrair");
		btn3 = new Button("Multiplicar");
		btn4 = new Button("Dividir");
		btn5 = new Button("Resto");
		btn6 = new Button("Reset");
		btn7 = new Button("Fechar");
		
		// Adicionando os componentes
		add(lb1); add(txt1);
		add(lb2); add(txt2);
		add(lb3); add(txt3);
		add(btn1); add(btn2);
		add(btn3); add(btn4);
		add(btn5); add(btn6);
		add(btn7);
		
		setSize(500, 120);
		setTitle("Calculadora");
		setLayout(new FlowLayout());
		//setLayout(new FlowLayout(FlowLayout.RIGHT));
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		double a=0, b=0, c=0;
		
		try 
		{
			a = Double.parseDouble(txt1.getText());
		}
		catch(NumberFormatException e)
		{
			txt1.setText("Entrada Inválida!");
		}
		
		try 
		{
			b = Double.parseDouble(txt2.getText());
		}
		catch(NumberFormatException e)
		{
			txt2.setText("Entrada Inválida!");
		}
		
		// Contas
		if(ae.getSource() == btn1)
		{
			c = a+b;
			txt3.setText(String.valueOf(c));
		}
		
		if(ae.getSource() == btn2)
		{
			c = a-b;
			txt3.setText(String.valueOf(c));
		}
		
		if(ae.getSource() == btn3)
		{
			c = a*b;
			txt3.setText(String.valueOf(c));
		}
		
		if(ae.getSource() == btn4)
		{
			c = a/b;
			txt3.setText(String.valueOf(c));
		}
		
		if(ae.getSource() == btn5)
		{
			c = a%b;
			txt3.setText(String.valueOf(c));
		}
		
		if(ae.getSource() == btn6)
		{
			txt1.setText("0");
			txt2.setText("0");
			txt3.setText("0");
		}
		
		if(ae.getSource() == btn7)
			System.exit(0);
	}
	
	public static void main(String[] args)
	{
		Calculadora calculadora = new Calculadora();
		calculadora.setVisible(true);
		calculadora.setLocation(800, 300);
	}
	
}
