package de.omikron;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import de.omikron.services.FFResponse;

/**
 * This is a JSON Parser for the JSON FACT-Finder response into Objects and
 * back.
 * 
 * @author arno.pitters
 *
 */
public class FactFinderGsonParser implements FactFinderParser {

	private Gson gson;

	public FactFinderGsonParser() {
		this(new GsonBuilder().serializeNulls().create());
	}

	public FactFinderGsonParser(Gson gson) {
		this.gson = gson;
	}

	public <T> Object parse(String json, Class<T> cl) throws Exception {
		return gson.fromJson(json, cl);
	}

	public String asJson(FFResponse result) {
		return gson.toJson(result);
	}

	@Override
	public Class<? extends FFResponse> getServiceResponseClass(String serviceName) throws Exception {
		switch (serviceName) {
		case "Search":
			return FactFinderParser.SERVICE_SEARCH;
		case "Suggest":
			return FactFinderParser.SERVICE_SUGGEST;
		case "Recommender":
			return FactFinderParser.SERVICE_RECOMMENDER;
		case "SimilarRecords":
			return FactFinderParser.SERVICE_SIMILAR_RECORDS;
		case "ProductCampaign":
			return FactFinderParser.SERVICE_PRODUCT_CAMPAIGN;
		default:
			throw new Exception("No serviceResponseClass for service name: " + serviceName);
		}
	}
}
