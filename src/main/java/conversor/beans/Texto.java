package conversor.beans;

import java.util.List;

import org.jsoup.Jsoup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Texto {

	@SerializedName("links")
	@Expose
	private List<Link> links;
	
	@SerializedName("content")
	@Expose
	private String content;
	
	@SerializedName("_name")
	@Expose
	private String name;

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = Jsoup.parse(content, "UTF-8").text();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
