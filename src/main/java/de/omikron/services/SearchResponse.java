package de.omikron.services;

import de.omikron.api.SearchResult;


/**
 * The response from a Search.ff service.
 * 
 * @author arno.pitters
 *
 */
public class SearchResponse extends FFResponse{

	private SearchResult searchResult;

	public SearchResponse() {
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(SearchResult searchResult) {
		this.searchResult = searchResult;
	}

	@Override
	public String toString() {
		return "SearchResponse [searchResult=" + searchResult + "]";
	}

}
