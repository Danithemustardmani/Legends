package Logic;

import static org.junit.jupiter.api.Assertions.*;

import java.io.Console;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Data.Spieler;
import Data.Teamplan;
import junit.framework.Assert;

class LogicTest {

	private ArrayList<Spieler> spielerTotal = new ArrayList<Spieler>();
	
	@BeforeEach
	void setUp() throws Exception {
		spielerTotal.add(new Spieler("Svenni"));
		spielerTotal.add(new Spieler("Danni"));
		spielerTotal.add(new Spieler("Uschi"));
		spielerTotal.add(new Spieler("Frank"));
		spielerTotal.add(new Spieler("Oli"));
		spielerTotal.add(new Spieler("Andi"));
		spielerTotal.add(new Spieler("Xeber"));
		spielerTotal.add(new Spieler("Josua"));
	}

	@Test
	void test() {
		Teamplan plan = Teambuilder.buildTeamplan(spielerTotal);
		
		System.out.println(">Team Bunt");
		plan.getTeamBunt().getSpieler().forEach(s -> System.out.println(">>>" + s.getName()));
		
		System.out.println(">Team Orange");
		plan.getTeamOrange().getSpieler().forEach(s -> System.out.println(">>>" + s.getName()));
		
		System.out.println(">Team Blau");
		plan.getTeamBlau().getSpieler().forEach(s -> System.out.println(">>>" + s.getName()));
		
		System.out.println(">Team Grau");
		plan.getTeamGrau().getSpieler().forEach(s -> System.out.println(">>>" + s.getName()));	
	}
}
