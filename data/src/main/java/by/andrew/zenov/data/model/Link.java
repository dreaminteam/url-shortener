package by.andrew.zenov.data.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "link")
public class Link implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "shortUrl")
	private String shortUrl;

	@Column(name = "sourceUrl", nullable = false, length = 1000)
	private String sourceUrl;

	@Column(name = "description", nullable = true, length = 10000)
	private String description;

	@Column(name = "clickCount", nullable = true)
	private Long clickCount;

	@OneToMany
	@JoinColumn(name = "tag")
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
