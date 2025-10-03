package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 12);
		asterix.parler("Bonjour Ob�lix");
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chawser des sangliers?");
		asterix.parler("Oui tr�s bonne id�e.");
		Romain minus = new Romain("Minus", 6);
		System.out.println("Dans la for�t " + asterix.getNom() + " et " + obelix.getNom()
				+ " tombent nez � nez sur le romain " + minus.getNom() + ".");
		for (int i = 0; i <= 4; i++) {
			asterix.frapper(minus);
			i++;
		}
	}

	@Override
	public String toString() {
		return "TestGaulois []";
	}
}
