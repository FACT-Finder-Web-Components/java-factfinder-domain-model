package de.factfinder.api;

import java.util.List;

public class AsnGroup {

	private int					detailedLinks;
	private List<AsnElement>	elements;
	private String				filterStyle;
	private int					groupOrder;
	private String				name;
	private String				selectionType;
	private List<AsnElement>	selectedElements;
	private boolean				showPreviewImages;
	private String				type;
	private String				unit;

	public AsnGroup() {

	}

	public int getDetailedLinks() {
		return detailedLinks;
	}

	public void setDetailedLinks(int detailedLinks) {
		this.detailedLinks = detailedLinks;
	}

	public List<AsnElement> getElements() {
		return elements;
	}

	public void setElements(List<AsnElement> elements) {
		this.elements = elements;
	}

	public String getFilterStyle() {
		return filterStyle;
	}

	public void setFilterStyle(String filterStyle) {
		this.filterStyle = filterStyle;
	}

	public int getGroupOrder() {
		return groupOrder;
	}

	public void setGroupOrder(int groupOrder) {
		this.groupOrder = groupOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSelectionType() {
		return selectionType;
	}

	public void setSelectionType(String selectionType) {
		this.selectionType = selectionType;
	}

	public List<AsnElement> getSelectedElements() {
		return selectedElements;
	}

	public void setSelectedElements(List<AsnElement> selectedElements) {
		this.selectedElements = selectedElements;
	}

	public boolean isShowPreviewImages() {
		return showPreviewImages;
	}

	public void setShowPreviewImages(boolean showPreviewImages) {
		this.showPreviewImages = showPreviewImages;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Group [detailedLinks=" + detailedLinks + ", elements=" + elements + ", filterStyle=" + filterStyle
				+ ", groupOrder=" + groupOrder + ", name=" + name + ", selectionType=" + selectionType
				+ ", selectedElements=" + selectedElements + ", showPreviewImages=" + showPreviewImages + ", type="
				+ type + ", unit=" + unit + "]";
	}

}
