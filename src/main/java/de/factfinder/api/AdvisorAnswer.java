package de.factfinder.api;

import java.util.List;

public class AdvisorAnswer {

	private String					id;
	private String					params;
	private List<AdvisorQuestion>	questions;
	private String					text;

	public AdvisorAnswer() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public List<AdvisorQuestion> getQuestions() {
		return questions;
	}

	public void setQuestions(List<AdvisorQuestion> questions) {
		this.questions = questions;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "AdvisorAnswer [id=" + id + ", params=" + params + ", questions=" + questions + ", text=" + text + "]";
	}

}
