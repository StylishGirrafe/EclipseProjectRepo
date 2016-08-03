import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class MainGUI {

	public static void main(String[] args) {
		
		//showInputDialog only accepts String || Only for inputting
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter secon number");
		
		//convert to int
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		//for displaying
		JOptionPane.showMessageDialog(null, "The answer is "+sum, "The title", JOptionPane.PLAIN_MESSAGE);
		
		//GUI with JFrame (jangan lupa disable dulu yg diatas)
		GUIJFrame bucky = new GUIJFrame();
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bucky.setSize(275,180);
		bucky.setVisible(true);
	}

}
