/**
 * 
 */
package library.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import library.Book;
/**
 * @author elina
 *
 */
public class BookTests {
	private ArrayList<String> authors = null;
	private ArrayList<String> titles = null;
	private ArrayList<String> ISBNs = null;
	private ArrayList<String> descriptions = null;
	private ArrayList<String> urls = null;
	private BufferedImage testPicture = null;
	private ArrayList<String> keywords = null;
	private ArrayList<String> keywordsNew = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		authors = new ArrayList<String>(Arrays.asList("Author1", "Author2", "Author3", "Author4", "Author5"));
		titles = new ArrayList<String>(Arrays.asList("Title1", "Title2", "Title3", "Title4", "Title5"));
		ISBNs = new ArrayList<String>(Arrays.asList("ISBN1", "ISBN2", "ISBN3", "ISBN4", "ISBN5"));
		descriptions = new ArrayList<String>(Arrays.asList("description1", "description2", "description3", "description4", "description5"));
		urls = new ArrayList<String>(Arrays.asList("url1", "url2", "url3", "url4", "url5"));
		try {
			
			testPicture = 
	                ImageIO.read(new File("C:\\Users\\elina\\eclipse-workspace\\MyLibrary\\src\\test\\resources\\testPic.jpg"));
		} catch (Exception ex) {throw ex;}
		
		keywords = new ArrayList<String>(Arrays.asList("key", "word"));
		keywordsNew = new ArrayList<String>(Arrays.asList("new", "key", "word"));
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBookConstructor_1() {
		
		Book tb_Constr1 = new Book(authors.get(0), titles.get(0));
		assertTrue(tb_Constr1.getAuthor().equals("Author1"));
		assertTrue(tb_Constr1.getTitle().equals("Title1"));
		assertTrue(tb_Constr1.getUrl().equals(""));
		assertNull(tb_Constr1.getPic());
		assertTrue(tb_Constr1.getKeywords().equals(new ArrayList<String>()));
		assertTrue(tb_Constr1.getISBN().equals(""));
		assertTrue(tb_Constr1.getDescription().equals(""));
	}
	
	@Test
	public void testBookConstructor_2() {

		Book tb_Constr2 = new Book(authors.get(1), titles.get(1), ISBNs.get(1), descriptions.get(1));
		assertTrue(tb_Constr2.getAuthor().equals("Author2"));
		assertTrue(tb_Constr2.getTitle().equals("Title2"));
		assertTrue(tb_Constr2.getUrl().equals(""));
		assertNull(tb_Constr2.getPic());
		assertTrue(tb_Constr2.getKeywords().equals(new ArrayList<String>()));
		assertTrue(tb_Constr2.getISBN().equals("ISBN2"));
		assertTrue(tb_Constr2.getDescription().equals("description2"));
	}
	
	@Test
	public void testBookConstructor_3() {

		Book tb_Constr3 = new Book(authors.get(2), titles.get(2), testPicture, ISBNs.get(2), descriptions.get(2));
		assertTrue(tb_Constr3.getAuthor().equals("Author3"));
		assertTrue(tb_Constr3.getTitle().equals("Title3"));
		assertTrue(tb_Constr3.getUrl().equals(""));
		assertTrue(tb_Constr3.getPic().equals(testPicture));
		assertTrue(tb_Constr3.getKeywords().equals(new ArrayList<String>()));
		assertTrue(tb_Constr3.getISBN().equals("ISBN3"));
		assertTrue(tb_Constr3.getDescription().equals("description3"));
	}
	
	@Test
	public void testBookConstructor_4() {

		Book tb_Constr4 = new Book(authors.get(3), titles.get(3), testPicture, urls.get(3), ISBNs.get(3), descriptions.get(3));
		assertTrue(tb_Constr4.getAuthor().equals("Author4"));
		assertTrue(tb_Constr4.getTitle().equals("Title4"));
		assertTrue(tb_Constr4.getUrl().equals("url4"));
		assertTrue(tb_Constr4.getPic().equals(testPicture));
		assertTrue(tb_Constr4.getKeywords().equals(new ArrayList<String>()));
		assertTrue(tb_Constr4.getISBN().equals("ISBN4"));
		assertTrue(tb_Constr4.getDescription().equals("description4"));
	}
	
	@Test
	public void testBookConstructor_5() {

		Book tb_Constr5 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		assertTrue(tb_Constr5.getAuthor().equals("Author5"));
		assertTrue(tb_Constr5.getTitle().equals("Title5"));
		assertTrue(tb_Constr5.getUrl().equals("url5"));
		assertTrue(tb_Constr5.getPic().equals(testPicture));
		assertTrue(tb_Constr5.getKeywords().equals(keywords));
		assertTrue(tb_Constr5.getISBN().equals("ISBN5"));
		assertTrue(tb_Constr5.getDescription().equals("description5"));
	}
	
	@Test
	public void testBookSetsAndGets_Author() {
		
		Book tb_Constr5 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		tb_Constr5.setAuthor(authors.get(0));
		assertTrue(tb_Constr5.getAuthor().equals("Author1"));
	}

	@Test
	public void testBookSetsAndGets_Title() {
		
		Book tb_Constr5 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		tb_Constr5.setTitle(titles.get(0));
		assertTrue(tb_Constr5.getTitle().equals("Title1"));
	}

	@Test
	public void testBookSetsAndGets_Url() {
		
		Book tb_Constr5 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		tb_Constr5.setUrl(urls.get(0));
		assertTrue(tb_Constr5.getUrl().equals("url1"));
	}

	@Test
	public void testBookSetsAndGets_Pic() {
		
		Book tb_Constr5 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		tb_Constr5.setPic(null); 
		assertNull(tb_Constr5.getPic());
	}

	@Test
	public void testBookSetsAndGets_Keywords() {
		
		Book tb_Constr5 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		tb_Constr5.setKeywords(keywordsNew);
		assertTrue(tb_Constr5.getKeywords().equals(keywordsNew));
	}

	@Test
	public void testBookSetsAndGets_ISBN() {
		
		Book tb_Constr5 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		tb_Constr5.setISBN(ISBNs.get(0));
		assertTrue(tb_Constr5.getISBN().equals("ISBN1"));
	}

	@Test
	public void testBookSetsAndGets_Description() {
		
		Book tb_Constr5 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
	    tb_Constr5.setDescription(descriptions.get(0));
		assertTrue(tb_Constr5.getDescription().equals("description1"));
		 
	}
	
	@Test
	public void testBookEquality() {
		Book tb1 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		Book tb2 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		assertTrue(tb1.equals(tb2));
	}

	@Test
	public void testBookToString() {
		Book tb1 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		Book tb2 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		assertFalse(tb1.toString().equals(tb2.toString()));
	}

	@Test
	public void testBookContainKeyWord() {
		Book tb1 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		assertTrue(tb1.containsKeyWord("key"));
	}

	@Test
	public void testBookAddKeyWord() {
		Book tb1 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		String newKW = "Ihan uusi keyword";
		tb1.addKeyword(newKW);
		assertTrue(tb1.containsKeyWord("Ihan uusi keyword"));
	}
	
	@Test
	public void testBookHasID() {
		Book tb1 = new Book(authors.get(4), titles.get(4), testPicture, urls.get(4), keywords, ISBNs.get(4), descriptions.get(4));
		
		assertNotNull(tb1.getID());
	}
}
