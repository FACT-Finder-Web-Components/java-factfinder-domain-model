package de.omikron.services;

import java.util.List;

import de.omikron.api.Record;
import de.omikron.api.SimilarRecordAttribute;

public class SimilarRecordsResponse extends FFResponse {

	private List<SimilarRecordAttribute>	attributes;
	private List<Record>					records;

	public SimilarRecordsResponse() {
	}

	public List<SimilarRecordAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<SimilarRecordAttribute> attributes) {
		this.attributes = attributes;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	@Override
	public String toString() {
		return "SimilarRecordsResponse [attributes=" + attributes + ", records=" + records + "]";
	}

}
