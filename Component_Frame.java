import javax.swing.*;
import java.awt.*;

public class Component_Frame extends JFrame{
	JButton b1 = new JButton("1");
	public Component_Frame() {
		JButton b2 = new JButton("2");
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.PINK);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(new JButton("Ignore"));

		setSize(350,400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component_Frame CF = new Component_Frame();
		CF.b1.setBackground(Color.ORANGE);
	}

}
