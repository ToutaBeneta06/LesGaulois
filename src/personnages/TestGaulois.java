package personnages;
public class TestGaulois {

    public static void main(String[] args) {
        // Cr�er des instances de Gaulois et Romain
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Gaulois obelix = new Gaulois("Ob�lix", 10);
        Romain minus = new Romain("Minus", 6);

        // Faire parler les Gaulois (exemple)
        asterix.frapper(minus);  // Ast�rix frappe Minus 1�re fois
        asterix.frapper(minus);  // Ast�rix frappe Minus 2�me fois
        asterix.frapper(minus);  // Ast�rix frappe Minus 3�me fois

        // Affichage de l'�tat de la situation avant la baston
        System.out.println("Dans la for�t " + asterix.getNom() + " et " + obelix.getNom() +
                " tombent nez � nez sur le romain " + minus.getNom() + ".");

        // Ast�rix frappe 3 fois Minus
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
    }
}

