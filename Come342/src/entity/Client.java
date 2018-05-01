package entity;

import java.util.ArrayList;

import other.Database;

public class Client {  // Nisa Berfin Yesin 
	
	private String clientName;
	private String clientAddress;
	private String clientEmail;
	private String contactName;
	private String contactEmail;
	private ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
	
	public Client(String clientName, String clientAddress, String clientEmail, String contactName, String contactEmail) {
		super();
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.clientEmail = clientEmail;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public ArrayList<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(ArrayList<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	
	public static ArrayList<Client> getClients() {
		return Database.clients;
	}
	
	public void addCampaign(Campaign campaign) {
		this.campaigns.add(campaign);
	}
	
	public static void createClient(Client client) {
		Database.clients.add(client);
	}

}
