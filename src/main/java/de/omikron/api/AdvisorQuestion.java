package de.omikron.api;

import java.util.List;

public class AdvisorQuestion {

	private List<AdvisorAnswer>	answers;
	private String				id;
	private String				text;

	public AdvisorQuestion() {
	}

	public List<AdvisorAnswer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AdvisorAnswer> answers) {
		this.answers = answers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Question [answers=" + answers + ", id=" + id + ", text=" + text + "]";
	}

}
