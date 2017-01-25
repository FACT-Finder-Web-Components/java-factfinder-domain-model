package de.omikron;

import de.omikron.services.FFResponse;
import de.omikron.services.ProductCampaignResponse;
import de.omikron.services.RecommendationResponse;
import de.omikron.services.SearchResponse;
import de.omikron.services.SimilarRecordsResponse;
import de.omikron.services.SuggestResponse;

public interface FactFinderParser {

	final Class<SearchResponse>				SERVICE_SEARCH				= SearchResponse.class;
	final Class<SuggestResponse>			SERVICE_SUGGEST				= SuggestResponse.class;
	final Class<RecommendationResponse>		SERVICE_RECOMMENDER			= RecommendationResponse.class;
	final Class<SimilarRecordsResponse>		SERVICE_SIMILAR_RECORDS		= SimilarRecordsResponse.class;
	final Class<ProductCampaignResponse>	SERVICE_PRODUCT_CAMPAIGN	= ProductCampaignResponse.class;

	<T> Object parse(String json, Class<T> cl) throws Exception;

	String asJson(FFResponse result);

	Class<?> getServiceResponseClass(String service) throws Exception;

}