package grubenCraft;

public class Spitzhacke extends Werkzeug implements Cloneable {
	
	Spitzhacke(Qualitaet qualitaet) {
		super(qualitaet);
	}
	
	protected Spitzhacke clone() {
		try {
			return (Spitzhacke) super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
