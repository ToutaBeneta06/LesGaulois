package personnages;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
        this.effetPotion = 1;
    }

    public String getNom() {
        return nom;
    }

    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup((force * effetPotion) / 3);
        if (effetPotion - 1 > 0) {
            effetPotion = effetPotion - 1;
        } else {
            effetPotion = 1;
        }
    }

    public void boosterPotion(int effet) {
        effetPotion = effet;
    }
}
