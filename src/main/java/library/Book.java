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
public class Book extends Publication {
	/**
	 * 
	 */
	private String ISBN;
	private String description;

	/**
	 * @param author
	 * @param title
	 */
	public Book(String author, String title) {
		super(author, title);
		this.ISBN = "";
		this.description = "";
	}
	/**
	 * @param author
	 * @param title
	 * @param ISBN
	 * @param description
	 */
	public Book(String author, String title, String ISBN, String description) {
		super(author, title);
		this.ISBN = ISBN;
		this.description = description;
	}
	/**
	 * @param author
	 * @param title
	 * @param pic
	 * @param ISBN
	 * @param description
	 */
	public Book(String author, String title, BufferedImage pic, String ISBN, String description) {
		super(author, title, pic);
		this.ISBN = ISBN;
		this.description = description;
	}
	/**
	 * @param author
	 * @param title
	 * @param pic
	 * @param url
	 * @param ISBN
	 * @param description
	 */
	public Book(String author, String title, BufferedImage pic, String url, String ISBN, String description) {
		super(author, title, pic, url);
		this.ISBN = ISBN;
		this.description = description;
	}
	/**
	 * @param author
	 * @param title
	 * @param pic
	 * @param url
	 * @param keywords
	 * @param ISBN
	 * @param description
	 */
	public Book(String author, String title, BufferedImage pic, String url, ArrayList<String> keywords, String ISBN, String description) {
		super(author, title, pic, url, keywords);
		this.ISBN = ISBN;
		this.description = description;
	}
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		Book other = (Book) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " Book [ISBN=" + ISBN + ", description=" + description + "]";
	}
}
