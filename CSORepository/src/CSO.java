import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CSO extends JFrame implements ActionListener {
	public CSO(){
		setSize(300,200);
		setTitle("CSORepo");
		setLayout(null);
		JButton button = new JButton("Podaj datê");
		button.setBounds(0, 0, 100, 20);
		add(button);
		button.addActionListener(this);
	}
	public static void main(String[]args){
		CSO okno = new CSO();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(new Date());
		
	}
}
