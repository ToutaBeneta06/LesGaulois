package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois; // tableau de Gaulois
    private int nbVillageois;     // compteur du nombre d’habitants

    public Village(String nom, Chef chef, int nbMaxVillageois) {
        this.nom = nom;
        this.chef = chef;
        villageois = new Gaulois[nbMaxVillageois];
    }

    public String getNom() {
        return nom;
    }

    public Chef getChef() {
        return chef;
    }

    // b. Ajouter un villageois
    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
            gaulois.setVillage(this);
        } else {
            System.out.println("Le village est plein !");
        }
    }

    // c. Trouver un villageois
    public Gaulois trouverVillageois(int numero) {
        if (numero <= 0 || numero > nbVillageois) {
            System.out.println("Il n’y a pas autant d’habitants dans notre village !");
            return null;
        }
        return villageois[numero - 1];
    }

    // e. Afficher les villageois
    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }

    // d + g. Méthode main pour tester tout
    public static void main(String[] args) {
        // Création du chef
        Chef abraracourcix = new Chef("Abraracourcix", 6);

        // Création du village
        Village village = new Village("Village des Irréductibles", abraracourcix, 30);

        // Vérification de l’accès hors limite
        Gaulois gaulois = village.trouverVillageois(30);

        // Création d’Astérix
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

        // Test de la méthode trouverVillageois
        gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);
        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois);

        // Création d’Obélix
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);

        // Affichage des habitants
        village.afficherVillageois();

        // Création de DoublePolémix
        Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);

        // Présentations
        abraracourcix.setVillage(village);
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
    }
}


}
