package de.omikron.api;

public class SortListItem {

	private String	description;
	private String	name;
	private String	order;
	private String	searchParams;
	private boolean	selected;

	public SortListItem() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
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

	@Override
	public String toString() {
		return "SortListItem [description=" + description + ", name=" + name + ", order=" + order + ", searchParams="
				+ searchParams + ", selected=" + selected + "]";
	}

}
