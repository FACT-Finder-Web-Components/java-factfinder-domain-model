package de.omikron.api;

public class SimilarRecordAttribute {

	private String	name;
	private String	value;

	public SimilarRecordAttribute() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SimilarRecordAttribute [name=" + name + ", value=" + value + "]";
	}

}
