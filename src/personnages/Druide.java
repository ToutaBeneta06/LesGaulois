package personnages;

public class Druide {
    private String nom;
    private int force;
    private int nbPotions;
    private int effetPotion;

    public Druide(String nom, int force) {
        this.nom = nom;
        this.force = force;
        this.nbPotions = 0;
        this.effetPotion = 1;
    }

    public String getNom() {
        return nom;
    }

    public void parler() {
        System.out.println("Je suis le Druide " + nom + ".");
    }

    public void prendreParole() {
        System.out.println("Le Druide " + nom + " : \"J'ai concocté " + nbPotions + " doses de potion magique. Elle a une force de " + effetPotion + ".\"");
    }

    public void fabriquerPotion(int nb, int effet) {
        nbPotions += nb;
        effetPotion = effet;
        System.out.println("Le Druide " + nom + " : \"J'ai concocté " + nb + " doses de potion magique. Elle a une force de " + effet + ".\"");
    }

    public void boosterGaulois(Gaulois gaulois) {
        if (nbPotions > 0) {
            gaulois.boosterPotion(effetPotion);
            nbPotions--;
            System.out.println("Le Druide " + nom + " : \"Tiens " + gaulois.getNom() + ", un peu de potion magique.\"");
        } else {
            System.out.println("Le Druide " + nom + " : \"Désolé, plus de potion magique !\"");
        }
    }
}
