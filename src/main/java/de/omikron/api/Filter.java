package de.omikron.api;

import java.util.List;

public class Filter {

	private String				name;
	private boolean				substring;
	private List<FilterValue>	valueList;

	public Filter() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSubstring() {
		return substring;
	}

	public void setSubstring(boolean substring) {
		this.substring = substring;
	}

	public List<FilterValue> getValueList() {
		return valueList;
	}

	public void setValueList(List<FilterValue> valueList) {
		this.valueList = valueList;
	}

	@Override
	public String toString() {
		return "Filter [name=" + name + ", substring=" + substring + ", valueList=" + valueList + "]";
	}

}
