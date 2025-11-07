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
	    boolean contenuPotion = chaudron.resterPotion();
		 String nomGaulois = gaulois.getNom();
		if(contenuPotion) {
			if (nomGaulois.equals("Obélix")) {
                parler("Non, " + nomGaulois + " ! Non ! Et tu le sais bien !");
            } else {
                int forcePotion = chaudron.prendreLouche();
                gaulois.boirePotion(forcePotion);
                parler("Tiens " + nomGaulois + ", un peu de potion magique.");
            }
        } else {
            parler("Désolé " + nomGaulois + ", il n’y a plus une seule goutte de potion.");
        }
    }
}

}

