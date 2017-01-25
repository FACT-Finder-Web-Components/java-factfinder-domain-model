package de.omikron.services;

import java.util.List;

import de.omikron.api.Record;

/**
 * The response from a Recommander.ff service.
 * 
 * @author arno.pitters
 *
 */
public class RecommendationResponse extends FFResponse {

	private List<Record> resultRecords;

	public RecommendationResponse() {
		// TODO Auto-generated constructor stub
	}

	public List<Record> getResultRecords() {
		return resultRecords;
	}

	public void setResultRecords(List<Record> resultRecords) {
		this.resultRecords = resultRecords;
	}

	@Override
	public String toString() {
		return "ProductCampaignResponse [resultRecords=" + resultRecords + "]";
	}
}
