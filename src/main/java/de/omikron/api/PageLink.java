package de.omikron.api;

public class PageLink {

	private String	caption;
	private boolean	currentPage;
	private int		number;
	private String	searchParams;

	public PageLink() {
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public boolean isCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(boolean currentPage) {
		this.currentPage = currentPage;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSearchParams() {
		return searchParams;
	}

	public void setSearchParams(String searchParams) {
		this.searchParams = searchParams;
	}

	@Override
	public String toString() {
		return "PageLink [caption=" + caption + ", currentPage=" + currentPage + ", number=" + number
				+ ", searchParams=" + searchParams + "]";
	}

}
