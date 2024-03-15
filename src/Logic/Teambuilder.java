package Logic;

import java.util.ArrayList;
import java.util.Collections;

import Data.Spieler;
import Data.Teamplan;

public class Teambuilder {
	
	public static Teamplan buildTeamplan(ArrayList<Spieler> spieler) {

		Collections.shuffle(spieler);
		
		Teamplan result = new Teamplan();
		
		for(int i = 0; i < spieler.size(); i=i+4) {
			
			result.getTeamBunt().getSpieler().add(spieler.get(i));	
			
			if ((i+1)>=spieler.size()) break;
			result.getTeamOrange().getSpieler().add(spieler.get(i+1));	
			
			if ((i+2)>=spieler.size()) break;
			result.getTeamBlau().getSpieler().add(spieler.get(i+2));	
			
			if ((i+3)>=spieler.size()) break;
			result.getTeamGrau().getSpieler().add(spieler.get(i+3));	
		}
			
		return result;
	}
}
