package grubenCraft;

public abstract class Werkzeug implements Cloneable {
	
	int haltbarkeit;
	Qualitaet qualitaet;

	public Werkzeug() {}	
	
	public Werkzeug(Qualitaet qualitaet) {
		
		this.qualitaet = qualitaet;
		this.haltbarkeit = qualitaet.haltbarkeit;
	}
	
}
