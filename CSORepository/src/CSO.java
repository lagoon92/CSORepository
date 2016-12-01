import javax.swing.JFrame;

public class CSO extends JFrame {
	public CSO(){
		setSize(300,200);
		setTitle("CSORepo");
	}
	public static void main(String[]args){
		CSO okno = new CSO();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
	}
}
