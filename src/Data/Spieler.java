package Data;

public class Spieler {
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public Spieler(String name) {
		setName(name);
	}
}
