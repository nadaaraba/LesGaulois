package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[] = new Equipement[2];
	private int nbEquipement=0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne!");
		}
	}
	
	private void donner(Equipement equipement,int position) {
		equipements[position] = equipement;
		nbEquipement ++;
		System.out.println("Le soldat " + nom + " s'equipe d'un " + equipement + " .");
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé!");
			break;
		case 1:
			if ((equipements[0] == equipement) || (equipements[1] == equipement)) {
				System.out.println("Le soldat " + nom + " possede deja un " + equipement + " .");
			}
			else {
				if (equipements[0] == null) donner(equipement,0);
				else donner(equipement,1);
			}
			break;
		case 0 :
			donner(equipement,0);
			break;
		}
	}

}
