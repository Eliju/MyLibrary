/**
 * 
 */
package library;
import java.util.UUID;
/**
 * @author elina
 *
 */
public class Issue {

	/**
	 * 
	 */
	private UUID ID;
	private Integer issueYear;
	private String issue;
	private Magazine series;
	/**
	 * @param iD
	 * @param issueYear
	 * @param issue
	 * @param series
	 */
	public Issue(int issueYear, String issue, Magazine series) {
		super();
		this.ID = UUID.randomUUID();
		this.issueYear = issueYear;
		this.issue = issue;
		this.series = series;
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
	 */	/**
	 * @return the issueYear
	 */
	public Integer getIssueYear() {
		return issueYear;
	}
	/**
	 * @param issueYear the issueYear to set
	 */
	public void setIssueYear(Integer issueYear) {
		this.issueYear = issueYear;
	}
	/**
	 * @return the issue
	 */
	public String getIssue() {
		return issue;
	}
	/**
	 * @param issue the issue to set
	 */
	public void setIssue(String issue) {
		this.issue = issue;
	}
	/**
	 * @return the series
	 */
	public Magazine getSeries() {
		return series;
	}
	/**
	 * @param series the series to set
	 */
	public void setSeries(Magazine series) {
		this.series = series;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((issue == null) ? 0 : issue.hashCode());
		result = prime * result + ((issueYear == null) ? 0 : issueYear.hashCode());
		result = prime * result + ((series == null) ? 0 : series.hashCode());
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
		Issue other = (Issue) obj;
		if (issue == null) {
			if (other.issue != null)
				return false;
		} else if (!issue.equals(other.issue))
			return false;
		if (issueYear == null) {
			if (other.issueYear != null)
				return false;
		} else if (!issueYear.equals(other.issueYear))
			return false;
		if (series == null) {
			if (other.series != null)
				return false;
		} else if ((!series.getAuthor().equals(other.series.getAuthor())) ||
				   (!series.getTitle().equals(other.series.getTitle())))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Issue [ID=" + ID + ", issueYear=" + issueYear + ", issue=" + issue + ", series=" + series + "]";
	}

}
