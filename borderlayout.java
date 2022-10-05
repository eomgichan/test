import javax.swing.*;
import java.awt.*;

public class borderlayout extends JFrame{
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	
	borderlayout() {
		JPanel pan = new JPanel();
		pan.setBackground(Color.BLUE);
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(b1, BorderLayout.NORTH);
		c.add(b2, BorderLayout.SOUTH);
		c.add(b3, BorderLayout.EAST);
		c.add(b4, BorderLayout.WEST);
		c.add(pan, BorderLayout.CENTER);
		pan.setLayout(new BorderLayout());
		pan.add(b5, BorderLayout.NORTH);
		pan.add(b6, BorderLayout.SOUTH);
		pan.add(b7, BorderLayout.EAST);
		pan.add(b8, BorderLayout.WEST);
		pan.add(b9, BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new borderlayout();
	}

}
