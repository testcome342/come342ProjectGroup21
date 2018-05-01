package other;

import java.util.ArrayList;

import entity.Campaign;
import entity.Client;

public class Database {
	
	public static ArrayList<Client> clients = new ArrayList<Client>();
	
	public static void defaultDatabase() {
		Client arcelik = new Client("ARCELIK", "asdasda", "sadadsa", "asdadsa", "sadada");
		Campaign arcelik_kampanya_1 = new Campaign("ARCELIK KAMPANYA 1", "asdadasd", "asdadad", 999.9);
		
		arcelik.addCampaign(arcelik_kampanya_1);
		
		clients.add(arcelik);
		
	}

}
