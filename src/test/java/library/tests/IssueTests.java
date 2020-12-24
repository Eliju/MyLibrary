/**
 * 
 */
package library.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import library.Magazine;
import library.Issue;

/**
 * @author elina
 *
 */
public class IssueTests {
	private Magazine mag = null;
	private Magazine magNew = null;

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
		mag = new Magazine("Sanoma Oy", "Tiede");
		magNew = new Magazine("Sanoma Oy", "Tiede Luonto");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIssueConstructor() {
		Issue i = new Issue(2020, "12/2020", mag);
		
		assertTrue(i.getIssueYear() == 2020);
		assertTrue(i.getIssue().equals("12/2020"));
		assertTrue(i.getSeries().equals(mag));
	}

	@Test
	public void testIssueHasID() {
		Issue i = new Issue(2020, "12/2020", mag);
		
		assertNotNull(i.getID());
	}
	
	@Test
	public void testIssueSetsAndGets_IssueYear() {
		Issue i = new Issue(2020, "12/2020", mag);

		i.setIssueYear(2021);
		assertTrue(i.getIssueYear() == 2021);
		
	}

	@Test
	public void testIssueSetsAndGets_Issue() {
		Issue i = new Issue(2020, "12/2020", mag);

		i.setIssue("1/2021");
		assertTrue(i.getIssue().equals("1/2021"));
		
	}

	@Test
	public void testIssueSetsAndGets_Series() {
		Issue i = new Issue(2020, "12/2020", mag);

		i.setSeries(magNew);
		assertTrue(i.getSeries().equals(magNew));
	}

	@Test
	public void testIssueEquality() {
		Issue i1 = new Issue(2020, "12/2020", mag);
		Issue i2 = new Issue(2020, "12/2020", mag);

		assertTrue(i1.equals(i2));
	}

	@Test
	public void testIssueToString() {
		Issue i1 = new Issue(2020, "12/2020", mag);
		Issue i2 = new Issue(2020, "12/2020", mag);

		assertFalse(i1.toString().equals(i2.toString()));
	}
}
