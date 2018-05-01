package entity;

public class Advert {
	//Gamze Alver
	
	private String advertTitle;
	private String targetCompletionDate;
	private double estimatedCost;
	private double actualCost;
	
	public Advert(String advertTitle, String targetCompletionDate, double estimatedCost, double actualCost) {
		super();
		this.advertTitle = advertTitle;
		this.targetCompletionDate = targetCompletionDate;
		this.estimatedCost = estimatedCost;
		this.actualCost = actualCost;
	}

	public String getAdvertTitle() {
		return advertTitle;
	}

	public void setAdvertTitle(String advertTitle) {
		this.advertTitle = advertTitle;
	}

	public String getTargetCompletionDate() {
		return targetCompletionDate;
	}

	public void setTargetCompletionDate(String targetCompletionDate) {
		this.targetCompletionDate = targetCompletionDate;
	}

	public double getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public double getActualCost() {
		return actualCost;
	}

	public void setActualCost(double actualCost) {
		this.actualCost = actualCost;
	}
	
	

}
