package personnages;
public class TestGaulois {

    public static void main(String[] args) {
        // Créer des instances de Gaulois et Romain
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 10);
        Romain minus = new Romain("Minus", 6);

        // Faire parler les Gaulois (exemple)
        asterix.frapper(minus);  // Astérix frappe Minus 1ère fois
        asterix.frapper(minus);  // Astérix frappe Minus 2ème fois
        asterix.frapper(minus);  // Astérix frappe Minus 3ème fois

        // Affichage de l'état de la situation avant la baston
        System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom() +
                " tombent nez à nez sur le romain " + minus.getNom() + ".");

        // Astérix frappe 3 fois Minus
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
    }
}

