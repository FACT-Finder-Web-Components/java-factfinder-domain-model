package de.factfinder.api;

import java.util.List;

public class Campaign {

	private List<AdvisorQuestion>	activeQuestions;
	private List<AdvisorQuestion>	advisorTree;
	private String					category;
	private List<FeedbackText>		feedbackTexts;
	private String					flavour;
	private String					id;
	private String					name;
	private List<Record>			pushedProductsRecords;
	private Target					target;

	public Campaign() {
	}

	public List<AdvisorQuestion> getActiveQuestions() {
		return activeQuestions;
	}

	public void setActiveQuestions(List<AdvisorQuestion> activeQuestions) {
		this.activeQuestions = activeQuestions;
	}

	public List<AdvisorQuestion> getAdvisorTree() {
		return advisorTree;
	}

	public void setAdvisorTree(List<AdvisorQuestion> advisorTree) {
		this.advisorTree = advisorTree;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<FeedbackText> getFeedbackTexts() {
		return feedbackTexts;
	}

	public void setFeedbackTexts(List<FeedbackText> feedbackTexts) {
		this.feedbackTexts = feedbackTexts;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Record> getPushedProductsRecords() {
		return pushedProductsRecords;
	}

	public void setPushedProductsRecords(List<Record> pushedProductsRecords) {
		this.pushedProductsRecords = pushedProductsRecords;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Campaign [activeQuestions=" + activeQuestions + ", advisorTree=" + advisorTree + ", category="
				+ category + ", feedbackTexts=" + feedbackTexts + ", flavour=" + flavour + ", id=" + id + ", name="
				+ name + ", pushedProductsRecords=" + pushedProductsRecords + ", target=" + target + "]";
	}

}
