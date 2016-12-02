import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CSO extends JFrame implements ActionListener {
	JButton bPodajDate, bWyjscie;
	JLabel lWyswietlDate;
	
	public CSO(){
		setSize(300,200);
		setTitle("CSORepo");
		setLayout(null);
		bPodajDate = new JButton("Podaj datê");
		bPodajDate.setBounds(0, 0, 100, 20);
		add(bPodajDate);
		bPodajDate.addActionListener(this);
		
		bWyjscie = new JButton("Wyjœcie");
		bWyjscie.setBounds(0, 50, 100, 20);
		add(bWyjscie);
		bWyjscie.addActionListener(this);
		
		lWyswietlDate = new JLabel("Data: ");
		lWyswietlDate.setBounds(0, 120, 200, 20);
		lWyswietlDate.setForeground(Color.PINK);
		add(lWyswietlDate);
	}
	public static void main(String[]args){
		CSO okno = new CSO();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();
		if (zrodlo==bPodajDate){
			lWyswietlDate.setText(new Date().toString());
			//System.out.println(new Date());	
		}
		else if (zrodlo==bWyjscie){
			dispose();
		}
		
	}
}
