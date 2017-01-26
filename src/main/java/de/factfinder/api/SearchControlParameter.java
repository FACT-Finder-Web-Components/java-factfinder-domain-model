package de.factfinder.api;

public class SearchControlParameter {

	private boolean	disableCache;
	private boolean	generateAdvisorTree;
	private boolean	idsOnly;
	private boolean	useAsn;
	private boolean	useAso;
	private boolean	useCampaigns;
	private boolean	useFoundWords;
	private boolean	useKeywords;
	private boolean	usePersonalization;
	private boolean	useSemanticEnhancer;

	public SearchControlParameter() {
	}

	public boolean isDisableCache() {
		return disableCache;
	}

	public void setDisableCache(boolean disableCache) {
		this.disableCache = disableCache;
	}

	public boolean isGenerateAdvisorTree() {
		return generateAdvisorTree;
	}

	public void setGenerateAdvisorTree(boolean generateAdvisorTree) {
		this.generateAdvisorTree = generateAdvisorTree;
	}

	public boolean isIdsOnly() {
		return idsOnly;
	}

	public void setIdsOnly(boolean idsOnly) {
		this.idsOnly = idsOnly;
	}

	public boolean isUseAsn() {
		return useAsn;
	}

	public void setUseAsn(boolean useAsn) {
		this.useAsn = useAsn;
	}

	public boolean isUseAso() {
		return useAso;
	}

	public void setUseAso(boolean useAso) {
		this.useAso = useAso;
	}

	public boolean isUseCampaigns() {
		return useCampaigns;
	}

	public void setUseCampaigns(boolean useCampaigns) {
		this.useCampaigns = useCampaigns;
	}

	public boolean isUseFoundWords() {
		return useFoundWords;
	}

	public void setUseFoundWords(boolean useFoundWords) {
		this.useFoundWords = useFoundWords;
	}

	public boolean isUseKeywords() {
		return useKeywords;
	}

	public void setUseKeywords(boolean useKeywords) {
		this.useKeywords = useKeywords;
	}

	public boolean isUsePersonalization() {
		return usePersonalization;
	}

	public void setUsePersonalization(boolean usePersonalization) {
		this.usePersonalization = usePersonalization;
	}

	public boolean isUseSemanticEnhancer() {
		return useSemanticEnhancer;
	}

	public void setUseSemanticEnhancer(boolean useSemanticEnhancer) {
		this.useSemanticEnhancer = useSemanticEnhancer;
	}

	@Override
	public String toString() {
		return "SearchControlParameter [disableCache=" + disableCache + ", generateAdvisorTree=" + generateAdvisorTree
				+ ", idsOnly=" + idsOnly + ", useAsn=" + useAsn + ", useAso=" + useAso + ", useCampaigns="
				+ useCampaigns + ", useFoundWords=" + useFoundWords + ", useKeywords=" + useKeywords
				+ ", usePersonalization=" + usePersonalization + ", useSemanticEnhancer=" + useSemanticEnhancer + "]";
	}

}
