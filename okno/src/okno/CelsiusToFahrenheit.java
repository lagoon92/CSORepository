package okno;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CelsiusToFahrenheit  extends JFrame implements ActionListener
{
	private JLabel lCelsius, lFahrenheit;
	private JTextField tCelsius, tFahrenheit;
	private JButton bKonwertuj;
	private JCheckBox chWielkie;
	private double tempCelsius, tempFahrenheit;
	
	public CelsiusToFahrenheit()
	{
				
		setSize(400,200);
		setTitle("Przeliczanie stopni celsiusza na fehrenheita");
		setLayout(null);
		
		lCelsius = new JLabel("Stopnie celsiusa: ");
		lCelsius.setBounds(20,20,150,20);
		add(lCelsius);
		
		tCelsius = new JTextField("");
		tCelsius.setBounds(170,20,150,20);
		add(tCelsius);
		tCelsius.addActionListener(this);
		
		lFahrenheit = new JLabel("Stopnie Fahrenheita: ");
		lFahrenheit.setBounds(20,70,150,20);
		add(lFahrenheit);
		
		tFahrenheit = new JTextField("");
		tFahrenheit.setBounds(170,70,150,20);
		add(tFahrenheit);
		
		bKonwertuj = new JButton("Konwertuj");
		bKonwertuj.setBounds(20,100,150,20);
		add(bKonwertuj);
		bKonwertuj.addActionListener(this);
		
		chWielkie = new JCheckBox("Wielkie litery");
		chWielkie.setBounds(250,120,150,20);
		add(chWielkie);
		chWielkie.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object zrodlo = e.getSource();
		if (zrodlo==bKonwertuj || zrodlo==tCelsius)
		{
		tempCelsius = Double.parseDouble(tCelsius.getText());
		tempFahrenheit = 32.0 + (9.0/5)*tempCelsius;
		tFahrenheit.setText(String.valueOf(tempFahrenheit));
		}
		else if (zrodlo==chWielkie)
		{
			if (chWielkie.isSelected()==true)
			{
				tFahrenheit.setFont(new Font("SansSerif", Font.BOLD, 18));
			}
			else 
			{
				tFahrenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
			}
		}
	}

	public static void main(String[] args)
	{
		CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}
}
