package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.chaudron = new Chaudron();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
		chaudron.remplirChaudron(quantite, forcePotion);
	}

	public void boosterGaulois(Gaulois gaulois) {
		if (gaulois.toString().equals("Obélix")) {
			parler("Non, Obélix Non !... Et tu le sais très bien !");

		} else {
			if (!chaudron.resterPotion()) {
				parler("Il n’y a plus de potion !");
			} else {
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
				chaudron.prendreLouche();
				gaulois.boirePotion(chaudron.getForcePotion());
			}
		}
	}

}
