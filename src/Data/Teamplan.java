package Data;

public class Teamplan {
	private Team teamBunt = new Team(Teamfarbe.Bunt);
	private Team teamOrange = new Team(Teamfarbe.Orange);
	private Team teamBlau = new Team(Teamfarbe.Blau);
	private Team teamGrau = new Team(Teamfarbe.Grau);
	
	public Team getTeamBunt() {
		return teamBunt;
	}
	
	public Team getTeamOrange() {
		return teamOrange;
	}
	
	public Team getTeamBlau() {
		return teamBlau;
	}
	
	public Team getTeamGrau() {
		return teamGrau;
	}
}
