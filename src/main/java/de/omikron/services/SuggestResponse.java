package de.omikron.services;

import java.util.List;

import de.omikron.api.Suggestion;


/**
 * The response from a Suggest.ff service.
 * 
 * @author arno.pitters
 *
 */
public class SuggestResponse extends FFResponse {

	private List<Suggestion> suggestions;

	public SuggestResponse() {
	}

	public List<Suggestion> getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(List<Suggestion> suggestions) {
		this.suggestions = suggestions;
	}

	@Override
	public String toString() {
		return "SuggestResponse [suggestions=" + suggestions + "]";
	}

}
