package okno;

import javax.swing.JFrame;

public class Okno extends JFrame {
	public Okno(){
		setSize(300,200);
		setTitle("Moje okno");
	}
	public static void main(String[] args){
		Okno okienko = new Okno();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
	}
}
