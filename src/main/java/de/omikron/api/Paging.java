package de.omikron.api;

import java.util.List;

public class Paging {

	private int				currentPage;
	private PageLink		firstLink;
	private PageLink		lastLink;
	private PageLink		nextLink;
	private int				pageCount;
	private List<PageLink>	pageLinks;
	private PageLink		previousLink;
	private int				resultsPerPage;

	public Paging() {
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public PageLink getFirstLink() {
		return firstLink;
	}

	public void setFirstLink(PageLink firstLink) {
		this.firstLink = firstLink;
	}

	public PageLink getLastLink() {
		return lastLink;
	}

	public void setLastLink(PageLink lastLink) {
		this.lastLink = lastLink;
	}

	public PageLink getNextLink() {
		return nextLink;
	}

	public void setNextLink(PageLink nextLink) {
		this.nextLink = nextLink;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<PageLink> getPageLinks() {
		return pageLinks;
	}

	public void setPageLinks(List<PageLink> pageLinks) {
		this.pageLinks = pageLinks;
	}

	public PageLink getPreviousLink() {
		return previousLink;
	}

	public void setPreviousLink(PageLink previousLink) {
		this.previousLink = previousLink;
	}

	public int getResultsPerPage() {
		return resultsPerPage;
	}

	public void setResultsPerPage(int resultsPerPage) {
		this.resultsPerPage = resultsPerPage;
	}

	@Override
	public String toString() {
		return "Paging [currentPage=" + currentPage + ", firstLink=" + firstLink + ", lastLink=" + lastLink
				+ ", nextLink=" + nextLink + ", pageCount=" + pageCount + ", pageLinks=" + pageLinks + ", previousLink="
				+ previousLink + ", resultsPerPage=" + resultsPerPage + "]";
	}

}
