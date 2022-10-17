import java.io.*;
import java.util.*; // StringTokenizer

public class BookInformationReader {
	
	void readBookInformation(MainFrame mf) {
		File dataFile = new File("C:/booklist.txt");
		String readData;
		StringTokenizer st;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(dataFile));
			while((readData = br.readLine()) != null) {
				Book book = new Book();
				st = new StringTokenizer(readData, "/");
				book.id = st.nextToken();
				book.title = st.nextToken();
				book.author = st.nextToken();
				book.publisher = st.nextToken();
				book.year = st.nextToken();
				book.type = st.nextToken();
				mf.bookList.add(book);
			}
			br.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
