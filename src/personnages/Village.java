package personnages;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	private int nbVillageoisMax;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom= nom;
		villageois= new Gaulois[nbVillageoisMax];
	}
	
	public String getNom() {
		return nom;
	}

	
	public Gaulois getChef() {
		return chef;
	}

	public void setChef(Gaulois chef) {
		this.chef = chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
		
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois> nbVillageoisMax) {
			System.out.println("Il n'y a pas autant d'habitants dans notre village!");
			return null;
		}
		return villageois[numVillageois];

	}
	

	public void afficherVillage() {
		System.out.println("Dans le village du chef " + chef.getNom() + " habitent :");
		for (int i = 0;i<nbVillageois;i++) {
			System.out.println(villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des ind�structibles",30);
		Gaulois abraracourcix= new Gaulois("Abraracourcix",6);
		village.setChef(abraracourcix);
		Gaulois asterix= new Gaulois("Ast�rix",8);
		village.ajouterVillageois(asterix);
		Gaulois obelix= new Gaulois("Ob�lix", 25);
		village.ajouterVillageois(obelix);

		
		
	}
}
