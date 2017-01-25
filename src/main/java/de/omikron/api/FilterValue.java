package de.omikron.api;

public class FilterValue {

	private boolean	exclude;
	private String	type;
	private String	value;

	public FilterValue() {
	}

	public boolean isExclude() {
		return exclude;
	}

	public void setExclude(boolean exclude) {
		this.exclude = exclude;
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
		return "FilterValue [exclude=" + exclude + ", type=" + type + ", value=" + value + "]";
	}

}
