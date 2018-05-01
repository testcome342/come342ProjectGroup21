import java.util.Scanner;

import entity.Client;
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
			System.out.println("Please enter a number");
			System.out.print("Answer=> ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("----------------------------------------------");
			
			switch(choice) {
			 case 1:
				 AddNewClient();
				 break;
			 case 2:
				 System.out.println("2 - Add a new campaign");
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
				System.out.println(String.valueOf(i) + clientName);
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
		System.out.println("Answer => ");
		int num = scanner.nextInt();
		
		if(num == 1) {
			
		} else {
			Client.createClient(client);
			System.out.println("Successfully added");
		}
		
	}


}
