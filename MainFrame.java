import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;



public class MainFrame extends JFrame {
	JTable table;
	DefaultTableModel tModel;
	ArrayList<Book> bookList = new ArrayList<>();
	BookInformationReader reader = new BookInformationReader();
	
	MainFrame(){
		String columName[] = {"ID", "TITLE", "AUTHOR", "PUBLISHER", "YEAR", "TYPE"};
		reader.readBookInformation(this);
		Object[][] bData = new Object[bookList.size()][6];
		for(int i = 0; i < bookList.size(); i++) {
			int j = 0;
			bData[i][j] = (Object)(bookList.get(i).id); j++;
			bData[i][j] = (Object)(bookList.get(i).title); j++;
			bData[i][j] = (Object)(bookList.get(i).author); j++;
			bData[i][j] = (Object)(bookList.get(i).publisher); j++;
			bData[i][j] = (Object)(bookList.get(i).year); j++;
			bData[i][j] = (Object)(bookList.get(i).type);
		}
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		tModel = new DefaultTableModel(bData, columName);
		table = new JTable(tModel);
		JScrollPane sp = new JScrollPane(table);
		c.add(sp, BorderLayout.CENTER);
		setSize(800, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MainFrame f = new MainFrame();

	}

}
