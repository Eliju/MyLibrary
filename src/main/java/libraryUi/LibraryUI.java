package libraryUi;
import filereader.ReadBookFile;

public class LibraryUI {
	
	
	public LibraryUI() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ReadBookFile reader;
		reader = new ReadBookFile("C:\\Users\\elina\\OneDrive\\Asiakirjat\\Kirjat\\ee_kirja\\ee_kirja_isbn_cat_compress.txt",
				"C:\\Users\\elina\\OneDrive\\Asiakirjat\\Kirjat\\ee_kirja\\booklistInJSON.json");
		reader.read();

	}

}
