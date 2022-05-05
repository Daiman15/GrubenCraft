package grubenCraft;

public class GrubenCraft {

	public static void main(String[] args) {
		Spieler spieler1 = new Spieler("Steve");
	
		Spieler spieler2 = spieler1.clone();
		spieler2.setName("Alex");
		
		for (int i = 0; i < 245; i++) {
			spieler1.baueAb();
		}
		
		for (int i = 0; i < 10; i++) {
			spieler2.baueAb();
		}
	}
}
