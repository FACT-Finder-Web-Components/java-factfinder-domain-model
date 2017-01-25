package de.omikron.api;

public class FeedbackText {

	private boolean	html;
	private int		id;
	private String	lable;
	private String	text;

	public FeedbackText() {
	}

	public boolean isHtml() {
		return html;
	}

	public void setHtml(boolean html) {
		this.html = html;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "FeedbackText [html=" + html + ", id=" + id + ", lable=" + lable + ", text=" + text + "]";
	}

}
