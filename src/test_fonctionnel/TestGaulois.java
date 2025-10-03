package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 12);
		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chawser des sangliers?");
		asterix.parler("Oui très bonne idée.");
		Romain minus = new Romain("Minus", 6);
		System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom()
				+ " tombent nez à nez sur le romain " + minus.getNom() + ".");
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
