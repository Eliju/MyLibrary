/**
 * 
 */
package library;
import java.util.UUID;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
/**
 * @author elina
 *
 */
public abstract class Publication {

	/**
	 * 
	 */
	private UUID ID;
	private String author;
	private String title;
	private BufferedImage pic;
	private String url;
	private ArrayList<String> keywords;
	
	
	public Publication(String author, String title) {
		this.ID = UUID.randomUUID();
		this.author = author;
		this.title = title;
		this.pic = null;
		this.url = "";
		this.keywords = new ArrayList<String>();
	}

	public Publication(String author, String title, BufferedImage pic) {
		this(author, title);
		this.pic = pic;
		this.url = "";
		this.keywords = new ArrayList<String>();
	}

	public Publication(String author, String title, BufferedImage pic, String url) {
		this(author, title, pic);
		this.url = url;
		this.keywords = new ArrayList<String>();
	}

	public Publication(String author, String title, BufferedImage pic, String url, ArrayList<String> keywords) {
		this(author, title, pic, url);
		this.keywords = keywords;
	}

	/**
	 * @return the iD
	 */
	public UUID getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	/*
	 * public void setID(UUID iD) { ID = iD; }
	 */

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the pic
	 */
	public BufferedImage getPic() {
		return pic;
	}

	/**
	 * @param pic the pic to set
	 */
	public void setPic(BufferedImage pic) {
		this.pic = pic;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the keywords
	 */
	public ArrayList<String> getKeywords() {
		return keywords;
	}

	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(ArrayList<String> keywords) {
		this.keywords = keywords;
	}
	
	public void addKeyword(String keyword) {
		this.keywords.add(keyword);
	}
	
	public boolean containsKeyWord(String keyword) {
		return this.keywords.contains(keyword);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((keywords == null) ? 0 : keywords.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publication other = (Publication) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (keywords == null) {
			if (other.keywords != null)
				return false;
		} else if (!keywords.equals(other.keywords))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Publication [ID=" + ID + ", author=" + author + ", title=" + title + ", pic=" + pic + ", url=" + url
				+ ", keywords=" + keywords + "]";
	}
	
	
}
