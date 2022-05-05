package grubenCraft;

public abstract class Werkzeug {
	
	int haltbarkeit;
	Qualitaet qualitaet;

	public Werkzeug() {}	
	
	public Werkzeug(Qualitaet qualitaet) {
		
		this.qualitaet = qualitaet;
		this.haltbarkeit = qualitaet.haltbarkeit;
	}
	
	protected Werkzeug clone() throws CloneNotSupportedException {
		return (Werkzeug) super.clone();
	}
}
