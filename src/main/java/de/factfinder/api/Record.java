package de.factfinder.api;

import java.util.HashMap;
import java.util.List;

public class Record {

	private List<String>			foundWords;
	private String					id			= null;
	private List<String>			keywords;
	private HashMap<String, Object>	record		= new HashMap<String, Object>();
	private int						position	= -1;

	private float					searchSimilarity;
	private short					simiMalusAdd;

	public Record() {
	}

	public List<String> getFoundWords() {
		return foundWords;
	}

	public void setFoundWords(List<String> foundWords) {
		this.foundWords = foundWords;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public HashMap<String, Object> getRecord() {
		return record;
	}

	public void setRecords(HashMap<String, Object> records) {
		this.record = records;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public float getSearchSimilarity() {
		return searchSimilarity;
	}

	public void setSearchSimilarity(float searchSimilarity) {
		this.searchSimilarity = searchSimilarity;
	}

	public short getSimiMalusAdd() {
		return simiMalusAdd;
	}

	public void setSimiMalusAdd(short simiMalusAdd) {
		this.simiMalusAdd = simiMalusAdd;
	}

	@Override
	public String toString() {
		return "Record [foundWords=" + foundWords + ", id=" + id + ", keywords=" + keywords + ", records=" + record
				+ ", position=" + position + ", searchSimilarity=" + searchSimilarity + ", simiMalusAdd=" + simiMalusAdd
				+ "]";
	}

}
