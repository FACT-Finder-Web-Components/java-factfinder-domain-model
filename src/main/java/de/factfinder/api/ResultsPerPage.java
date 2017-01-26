package de.factfinder.api;

import com.google.gson.annotations.SerializedName;

public class ResultsPerPage {

	@SerializedName("default")
	private boolean	isDefault;
	private String	searchParams;
	private boolean	selected;
	private int		value;

	public ResultsPerPage() {
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getSearchParams() {
		return searchParams;
	}

	public void setSearchParams(String searchParams) {
		this.searchParams = searchParams;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ResultsPerPage [searchParams=" + searchParams + ", selected=" + selected + ", value=" + value + "]";
	}

}
