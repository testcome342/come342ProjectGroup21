package control;

import entity.Client;

public class AddNewClient {

	public static Client createNewClient(String name, String address, String email, String contactName, String contactEmail) {
		
		Client client = new Client(name, address, email, contactName, contactEmail);
		
		return client;
		
	}

}
