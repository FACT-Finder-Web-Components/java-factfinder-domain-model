package de.factfinder.api;

import java.util.HashMap;

import de.factfinder.services.FFResponse;

public class Suggestion extends FFResponse{

	private int						hitCount;
	private String					imgUrl;
	private String					searchParams;
	private String					type;
	private String					name;
	private HashMap<String, String>	attributes;

	public Suggestion() {

	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSearchParams() {
		return searchParams;
	}

	public void setSearchParams(String searchParams) {
		this.searchParams = searchParams;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(HashMap<String, String> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "Suggestion [hitCount=" + hitCount + ", imgUrl=" + imgUrl + ", searchParams=" + searchParams + ", type="
				+ type + ", name=" + name + ", attributes=" + attributes + "]";
	}

}
