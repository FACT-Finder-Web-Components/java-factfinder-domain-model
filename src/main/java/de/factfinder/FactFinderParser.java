package de.factfinder;

import de.factfinder.services.FFResponse;
import de.factfinder.services.ProductCampaignResponse;
import de.factfinder.services.RecommendationResponse;
import de.factfinder.services.SearchResponse;
import de.factfinder.services.SimilarRecordsResponse;
import de.factfinder.services.SuggestResponse;

/**
 * This is a generic Parser interface for the FACTFinder ObejctModel.
 * 
 * @author arno.pitters
 *
 */
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