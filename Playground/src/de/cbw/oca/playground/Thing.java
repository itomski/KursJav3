package de.cbw.oca.playground;

public class Thing {
	
	private String name;
	private double weight;
	private ThingStatus status;
	
	public Thing(String name, double weight, ThingStatus status) {
		this.name = name;
		this.weight = weight;
		this.status = status;
	}

	public Thing(String name, double weight) {
		this(name, weight, ThingStatus.ACTIVE);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ThingStatus getStatus() {
		return status;
	}

	public void setStatus(ThingStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Thing [name=");
		builder.append(name);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
