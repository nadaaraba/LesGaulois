package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
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
		return "Le Gaulois " + nom + " : ";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix.getNom());
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println((nom + " envoie un grand coup dans la m�choire de " + nomRomain));
		int forceCoup = force / 3;
		romain.recevoirCoup(forceCoup);
	}

	public void boirePotion(int effetPotion) {
		parler("Merci Druide, je sens que ma force est " + String.valueOf(effetPotion) + " fois decuplee");
	}
}
