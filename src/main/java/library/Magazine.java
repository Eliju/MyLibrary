/**
 * 
 */
package library;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * @author elina
 *
 */
public class Magazine extends Publication {

	/**
	 * 
	 */
	private String ISSN;
	private String description;
	private ArrayList<Issue> issues;
	/**
	 * @param author
	 * @param title
	 * @param ISSN
	 * @param description
	 * @param issues
	 */
	public Magazine(String author, String title, String ISSN, String description, ArrayList<Issue> issues) {
		super(author, title);
		this.ISSN = ISSN;
		this.description = description;
		this.issues = issues;
	}
	/**
	 * @param author
	 * @param title
	 * @param pic
	 * @param url
	 * @param keywords
	 * @param ISSN
	 * @param description
	 * @param issues
	 */
	public Magazine(String author, String title, BufferedImage pic, String url, ArrayList<String> keywords, String ISSN, String description, ArrayList<Issue> issues) {
		super(author, title, pic, url, keywords);
		this.ISSN = ISSN;
		this.description = description;
		this.issues = issues;
	}
	/**
	 * @param author
	 * @param title
	 * @param pic
	 * @param url
	 * @param ISSN
	 * @param description
	 * @param issues
	 */
	public Magazine(String author, String title, BufferedImage pic, String url, String ISSN, String description, ArrayList<Issue> issues) {
		super(author, title, pic, url);
		this.ISSN = ISSN;
		this.description = description;
		this.issues = issues;
	}
	/**
	 * @param author
	 * @param title
	 * @param pic
	 * @param ISSN
	 * @param description
	 * @param issues
	 */
	public Magazine(String author, String title, BufferedImage pic, String ISSN, String description, ArrayList<Issue> issues) {
		super(author, title, pic);
		this.ISSN = ISSN;
		this.description = description;
		this.issues = issues;
	}
	/**
	 * @param author
	 * @param title
	 * @param ISSN
	 * @param description
	 */
	public Magazine(String author, String title, String ISSN, String description) {
		super(author, title);
		this.ISSN = ISSN;
		this.description = description;
		this.issues = new ArrayList<Issue>();
	}
	/**
	 * @param author
	 * @param title
	 * @param ISSN
	 */
	public Magazine(String author, String title, String ISSN) {
		super(author, title);
		this.ISSN = ISSN;
		this.description = "";
		this.issues = new ArrayList<Issue>();
	}
	/**
	 * @param author
	 * @param title
	 */
	public Magazine(String publisher, String title) {
		super(publisher, title);
		this.ISSN = "";
		this.description = "";
		this.issues = new ArrayList<Issue>();
	}
	/**
	 * @return the ISSN
	 */
	public String getISSN() {
		return ISSN;
	}
	/**
	 * @param ISSN the ISSN to set
	 */
	public void setISSN(String ISSN) {
		this.ISSN = ISSN;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the issues
	 */
	public ArrayList<Issue> getIssues() {
		return issues;
	}
	/**
	 * @param issues the issues to set
	 */
	public void setIssues(ArrayList<Issue> issues) {
		this.issues = issues;
	}
	
	public void addIssue(Issue issue) {
		this.issues.add(issue);
	}
	
	public Issue getIssue(String issue) {
		//return this.issues.stream()
		//		.filter(i -> i.getIssue().equals(issue))
		//		.findAny()
		//		.orElse(null);
			return null;	
	}
	
	public boolean containsIssue(String issue) {
		return (!this.getIssue(issue).equals(null));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ISSN == null) ? 0 : ISSN.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((issues == null) ? 0 : issues.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (ISSN == null) {
			if (other.ISSN != null)
				return false;
		} else if (!ISSN.equals(other.ISSN))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		 if (issues == null) { 
			 if (other.issues != null) 
				 return false; 
		} else if (!issues.equals(other.issues))  
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Magazine [ISSN=" + ISSN + ", description=" + description + ", issues=" + issues + "]";
	}
	
	
}
