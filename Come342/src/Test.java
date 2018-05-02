import java.util.Scanner;

import entity.Client;
import other.Database;
import control.AddNewClient;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("********AGATE LTD********");
			System.out.println("1 - Add a new client");
			System.out.println("2 - Add a new campaign");
			System.out.println("5 - Assign stff to work on a campaign ");
			System.out.println("11 - Add a new advert to a campaign ");
			System.out.println("12 - Add a new member of staff ");
			System.out.println("0 - Exit");
			System.out.println("----------------------------------------------");
			System.out.print("Please enter a number: ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("----------------------------------------------");
			
			switch(choice) {
			 case 1:
				 AddNewClient();
				 break;
			 case 2:
				 AddNewCampaign();
				 break;
			 case 5:
				 System.out.println("5 - Assign stff to work on a campaign ");
				 break;
			 case 11:
				 System.out.println("11 - Add a new advert to a campaign ");
				 break;
			 case 12:
				 System.out.println("12 - Add a new member of staff ");
				 break;
			 case 0:
				 System.exit(0);
			 	break;
			 default:
				 System.out.println("Error! Please try enter a number");
			 	break;
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.println("");
			}
		}

	}
	
	private static void AddNewClient() { 
		//Nisa Berfin Yesin
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------Client list--------");
		if(Client.getClients().size() == 0) {
			
			System.out.println("Kayýtlý client bulunamadý :(");
			
		} else {
			for(int i=0; i< Client.getClients().size(); i++) {
				String clientName = Client.getClients().get(i).getClientName();
				int count = i + 1;
				System.out.println(String.valueOf(count) + " - "+ clientName);
			}
		}
		
		System.out.print("Client name: ");
		String name = scanner.nextLine();
		
		System.out.print("Client address: ");
		String address = scanner.nextLine();
		
		System.out.print("Client email: ");
		String email = scanner.nextLine();
		
		System.out.print("Contact name: ");
		String contactName = scanner.nextLine();
		
		System.out.print("Contact email: ");
		String contactEmail = scanner.nextLine();
		
		
		Client client = AddNewClient.createNewClient(name, address, email, contactName, contactEmail);
		
		System.out.println("Would you like to add a campaign ?(Yes => 1, No =>2)");
		System.out.print("Answer => ");
		int num = scanner.nextInt();
		
		if(num == 1) {
			
		} else {
			Client.createClient(client);
			System.out.println("Successfully added");
		}
		
	}

	private static void AddNewCampaign() {
		//Gamze Alver
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------Client list--------");
		if(Client.getClients().size() == 0) {
			
			System.out.println("Kayýtlý client bulunamadý :(");
			
		} else {
			
			//Client list
			for(int i=0; i< Client.getClients().size(); i++) {
				String clientName = Client.getClients().get(i).getClientName();
				int count = i + 1;
				System.out.println(String.valueOf(count) + " - "+clientName);
			}
			
			System.out.println("-------------------------------");
			System.out.print("Please enter a number: ");
			int number = scanner.nextInt();
			
			//Client
			Client client = Database.clients.get(--number);
			
			//Campaign list
			if(client.getCampaigns().size() == 0) {
				System.out.println("This client don't have campaign(s).");
			} else {
				
				for(int j=0; j<client.getCampaigns().size(); j++) {
					String campaignTitle = client.getCampaigns().get(j).getTitle();
					int count = j + 1;
					System.out.println(String.valueOf(count) + " - " +campaignTitle);
				}
				
			}
		
		 
		 System.out.println("Campaign Title :");
		 String CampaignTitle = scanner.nextLine();
		 
		 System.out.println("Campaign Start Date:");
		 String CampaignStartDate = scanner.nextLine();
		 
		 System.out.println("Campaign Finish Date :");
		 String CampaignFinishDate = scanner.nextLine();
		 
		 System.out.println("Campaign Estimated Cost :");
		 String estimatedCost = scanner.nextLine();
		 }
		
		
		
	}
}
