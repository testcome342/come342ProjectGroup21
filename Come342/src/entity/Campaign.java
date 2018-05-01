package entity;

public class Campaign { // Gamze Alver
	
	private String title; 
	private String campaignStartDate;
	private String campaignFinishDate;  
	private double estimatedCost;
	
	public Campaign(String title, String campaignStartDate, String campaignFinishDate, double estimatedCost) {
		super();
		this.title = title;
		this.campaignStartDate = campaignStartDate;
		this.campaignFinishDate = campaignFinishDate;
		this.estimatedCost = estimatedCost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(String campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public String getCampaignFinishDate() {
		return campaignFinishDate;
	}

	public void setCampaignFinishDate(String campaignFinishDate) {
		this.campaignFinishDate = campaignFinishDate;
	}

	public double getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	
	
}
