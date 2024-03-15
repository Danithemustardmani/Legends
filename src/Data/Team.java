package Data;

import java.util.ArrayList;

public class Team {

	private Teamfarbe farbe = Teamfarbe.Bunt;
	private ArrayList<Spieler> spieler = new ArrayList<Spieler>();
	
	public Teamfarbe getFarbe() {
		return farbe;
	}

	public void setFarbe(Teamfarbe farbe) {
		this.farbe = farbe;
	}
	
	public ArrayList<Spieler> getSpieler() {
		return spieler;
	}
	
	public Team(Teamfarbe farbe) {
		this.setFarbe(farbe);
	}
}

enum Teamfarbe {
	Orange,
	Bunt,
	Grau,
	Blau
}
