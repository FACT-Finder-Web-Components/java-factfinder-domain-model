package de.omikron.api;

public class Target {

	private String	destination;
	private String	name;

	public Target() {
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Target [destination=" + destination + ", name=" + name + "]";
	}

}
