package de.factfinder.api;

public class BreadCrumbTrail {

	private String	associatedFieldName;
	private String	searchParams;
	private String	text;
	private String	type;
	private String	value;

	public BreadCrumbTrail() {
	}

	public String getAssociatedFieldName() {
		return associatedFieldName;
	}

	public void setAssociatedFieldName(String associatedFieldName) {
		this.associatedFieldName = associatedFieldName;
	}

	public String getSearchParams() {
		return searchParams;
	}

	public void setSearchParams(String searchParams) {
		this.searchParams = searchParams;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BreadCrumTrail [associatedFieldName=" + associatedFieldName + ", searchParams=" + searchParams
				+ ", text=" + text + ", type=" + type + ", value=" + value + "]";
	}

}
