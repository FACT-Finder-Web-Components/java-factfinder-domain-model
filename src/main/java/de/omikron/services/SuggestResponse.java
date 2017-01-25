package de.omikron.services;

import java.util.List;

import de.omikron.api.Suggestion;

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
