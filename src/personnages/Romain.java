package personnages;

public class Romain {
    private String nom;
    private int force;

    // Constructeur
    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour recevoir un coup
    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;  // Réduit la force du romain en fonction du coup reçu
        if (force <= 0) {
            System.out.println("Le Romain " + nom + " : \"J'abandonne !\"");
        } else {
            System.out.println("Le Romain " + nom + " : \"Aïe\"");
        }
    }
}

