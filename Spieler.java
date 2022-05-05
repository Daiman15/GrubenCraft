package grubenCraft;

public class Spieler implements Cloneable {
	
	String name;
	Werkzeug werkzeug = new Spitzhacke(Qualitaet.EISEN);
	float gesundheit = 100f;
	Inventar inventar = new Inventar();
	
	Spieler(String name) {
		this.name = name;
	}
	
	public void baueAb() {
		
		if (werkzeug == null) {
			System.out.println(name + " hat kein Werkzeug in der Hand!");
			return;
		}
		
		System.out.println(name + " baut ab: Plock!");
		werkzeug.haltbarkeit--;
		
		if (werkzeug.haltbarkeit <= 0) {
			werkzeug = null;
		}
	}
	
	protected Spieler clone() {
		try {
			Spieler klon = (Spieler) super.clone();
			Spitzhacke werkzeugKlon = (Spitzhacke) werkzeug.clone();
			klon.setWerkzeug(werkzeugKlon);
			return klon;
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Werkzeug getWerkzeug() {
		return this.werkzeug;
	}
	
	public void setWerkzeug(Werkzeug werkzeug) {
		this.werkzeug = werkzeug;
	}
	
	public float getGesundheit() {
		return this.gesundheit;
	}
	
	public void setGesundheit(float gesundheit) {
		this.gesundheit = gesundheit;
	}
	
	public Inventar getInventar() {
		return this.inventar;
	}
}
