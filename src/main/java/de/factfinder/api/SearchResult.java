package de.factfinder.api;

import java.util.List;
import java.util.Map;

public class SearchResult {

	private List<BreadCrumbTrail>	breadCrumbTrailItems;
	private List<Campaign>			campaigns;
	private String					channel;
	private Map<String, Object>		fieldRoles;
	private List<Filter>			filters;
	private List<AsnGroup>			groups;
	private Paging					paging;
	private List<Record>			records;
	private String					resultArticleNumberStatus;
	private int						resultCount;
	private String					resultStatus;
	private List<ResultsPerPage>	resultsPerPageList;
	private SearchControlParameter	searchControlParams;
	private String					searchParams;
	private int						searchTime;
	private int						simiFirstRecord;
	private int						simiLastRecord;
	private String					singleWordResults;
	private List<SortListItem>		sortsList;
	private boolean					timedOut	= false;

	public SearchResult() {
	}

	public List<BreadCrumbTrail> getBreadCrumbTrailItems() {
		return breadCrumbTrailItems;
	}

	public void setBreadCrumbTrailItems(List<BreadCrumbTrail> breadCrumbTrailItems) {
		this.breadCrumbTrailItems = breadCrumbTrailItems;
	}

	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Map<String, Object> getFieldRoles() {
		return fieldRoles;
	}

	public void setFieldRoles(Map<String, Object> fieldRoles) {
		this.fieldRoles = fieldRoles;
	}

	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	public List<AsnGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<AsnGroup> groups) {
		this.groups = groups;
	}

	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public String getResultArticleNumberStatus() {
		return resultArticleNumberStatus;
	}

	public void setResultArticleNumberStatus(String resultArticleNumberStatus) {
		this.resultArticleNumberStatus = resultArticleNumberStatus;
	}

	public int getResultCount() {
		return resultCount;
	}

	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public List<ResultsPerPage> getResultsPerPageList() {
		return resultsPerPageList;
	}

	public void setResultsPerPageList(List<ResultsPerPage> resultsPerPageList) {
		this.resultsPerPageList = resultsPerPageList;
	}

	public SearchControlParameter getSearchControlParams() {
		return searchControlParams;
	}

	public void setSearchControlParams(SearchControlParameter searchControlParams) {
		this.searchControlParams = searchControlParams;
	}

	public String getSearchParams() {
		return searchParams;
	}

	public void setSearchParams(String searchParams) {
		this.searchParams = searchParams;
	}

	public int getSearchTime() {
		return searchTime;
	}

	public void setSearchTime(int searchTime) {
		this.searchTime = searchTime;
	}

	public int getSimiFirstRecord() {
		return simiFirstRecord;
	}

	public void setSimiFirstRecord(int simiFirstRecord) {
		this.simiFirstRecord = simiFirstRecord;
	}

	public int getSimiLastRecord() {
		return simiLastRecord;
	}

	public void setSimiLastRecord(int simiLastRecord) {
		this.simiLastRecord = simiLastRecord;
	}

	public String getSingleWordResults() {
		return singleWordResults;
	}

	public void setSingleWordResults(String singleWordResults) {
		this.singleWordResults = singleWordResults;
	}

	public List<SortListItem> getSortsList() {
		return sortsList;
	}

	public void setSortsList(List<SortListItem> sortsList) {
		this.sortsList = sortsList;
	}

	public boolean isTimedOut() {
		return timedOut;
	}

	public void setTimedOut(boolean timedOut) {
		this.timedOut = timedOut;
	}

	@Override
	public String toString() {
		return "SearchResult [breadCrumbTrailItems=" + breadCrumbTrailItems + ", campaigns=" + campaigns + ", channel="
				+ channel + ", fieldRoles=" + fieldRoles + ", filters=" + filters + ", groups=" + groups + ", paging="
				+ paging + ", records=" + records + ", resultArticleNumberStatus=" + resultArticleNumberStatus
				+ ", resultCount=" + resultCount + ", resultStatus=" + resultStatus + ", resultsPerPageList="
				+ resultsPerPageList + ", searchControlParams=" + searchControlParams + ", searchParams=" + searchParams
				+ ", searchTime=" + searchTime + ", simiFirstRecord=" + simiFirstRecord + ", simiLastRecord="
				+ simiLastRecord + ", singleWordResults=" + singleWordResults + ", sortsList=" + sortsList
				+ ", timedOut=" + timedOut + "]";
	}

}
