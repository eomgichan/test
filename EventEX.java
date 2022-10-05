import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;


public class EventEX extends JFrame {
	EventEX() {
		setTitle("Event 예졔");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("누르면 1억이 생기는 버튼");
		JButton btm = new JButton("솔직히 어렵다고 생각하면 개추 ㅋㅋ");
		btn.addActionListener(new MyActionListener());
		btm.addActionListener(new MyActionListener2()); 
		c.add(btn);
		c.add(btm);
		setSize(400,200);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventEX();
		
		
	}
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); 
		if(b.getText().equals("와 축하드립니다")) 
		b.setText("낚이셨어용 ㅋ"); 
		else
		b.setText("와 축하드립니다"); 
		}
	

	}
	class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource(); 
			if(b.getText().equals("일단 나부터ㅋㅋ")) 
			b.setText("개추 ㅋㅋ"); 
			else
			b.setText("일단 나부터ㅋㅋ"); 
			
		}
			
	}
		
		
}

