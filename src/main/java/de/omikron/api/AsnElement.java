package de.omikron.api;

public class AsnElement {

	private String	associatedFieldName;
	private int		clusterLevel;
	private String	name;
	private String	previewImageURL;
	private int		recordCount;
	private String	searchParams;
	private boolean	selected;

	public AsnElement() {
	}

	public String getAssociatedFieldName() {
		return associatedFieldName;
	}

	public void setAssociatedFieldName(String associatedFieldName) {
		this.associatedFieldName = associatedFieldName;
	}

	public int getClusterLevel() {
		return clusterLevel;
	}

	public void setClusterLevel(int clusterLevel) {
		this.clusterLevel = clusterLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreviewImageURL() {
		return previewImageURL;
	}

	public void setPreviewImageURL(String previewImageURL) {
		this.previewImageURL = previewImageURL;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
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
		return "AsnElement [associatedFieldName=" + associatedFieldName + ", clusterLevel=" + clusterLevel + ", name="
				+ name + ", previewImageURL=" + previewImageURL + ", recordCount=" + recordCount + ", searchParams="
				+ searchParams + ", selected=" + selected + "]";
	}

}
