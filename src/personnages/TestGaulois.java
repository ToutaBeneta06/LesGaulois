package personnages;

public class TestGaulois {

    public static void main(String[] args) {

        // --- Création des Gaulois ---
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);

        // --- Scène de dialogue ---
        asterix.parler("Bonjour Obélix.");
        obelix.parler("Bonjour Astérix. Ça te dirait d'aller chasser des sangliers ?");
        asterix.parler("Oui, très bonne idée.");

        // --- Rencontre avec un romain ---
        Romain minus = new Romain("Minus", 6);

        System.out.println("Dans la forêt " + asterix + " et " + obelix 
                           + " tombent nez à nez sur le romain " + minus + ".");

        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }

        System.out.println("\n--- Plus tard ---\n");

        // --- Nouvelle scène : le druide et Brutus ---
        Romain brutus = new Romain("Brutus", 14);
        Druide panoramix = new Druide("Panoramix", 2);

        // Le druide prépare 4 doses de potion de force 3
        panoramix.preparerPotion(3, 4);

        // Le druide essaie de booster Obélix (refus)
        panoramix.booster(obelix);

        // Le druide booste Astérix
        panoramix.booster(asterix);

        // Astérix frappe 3 fois Brutus
        for (int i = 0; i < 3; i++) {
            asterix.frapper(brutus);
        }
    }
}

