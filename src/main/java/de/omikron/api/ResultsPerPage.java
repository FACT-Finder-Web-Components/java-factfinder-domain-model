package de.omikron.api;

// TODO map default with annotation
public class ResultsPerPage {

	// private boolean default;
	private String	searchParams;
	private boolean	selected;
	private int		value;

	public ResultsPerPage() {
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
