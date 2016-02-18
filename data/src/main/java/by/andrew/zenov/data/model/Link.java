package by.andrew.zenov.data.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "link")
public class Link implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="shortUrl")
	private String shortUrl;
	
	@Column(name="sourceUrl")
	private String sourceUrl;
	
	@Column(name="description")
	private String description;
	
	@Column(name="clickCount")
	private Long clickCount;
	
	@ManyToOne
	@JoinColumn(name="tags")
	private Set<Tag> tags;
	
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getClickCount() {
		return clickCount;
	}
	public void setClickCount(Long clickCount) {
		this.clickCount = clickCount;
	}
	public Set<Tag> getTags() {
		return tags;
	}
	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	
}
