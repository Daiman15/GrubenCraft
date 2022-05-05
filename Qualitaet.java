package grubenCraft;

public enum Qualitaet {
	
	HOLZ(59),
	STEIN(131),
	EISEN(250),
	GOLD(32),
	DIAMANT(1561);
	
	public final int haltbarkeit;
	
	private Qualitaet(final int haltbarkeit) {
		this.haltbarkeit = haltbarkeit;
	}
}
