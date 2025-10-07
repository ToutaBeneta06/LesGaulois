package personnages;

public class TestGaulois {
    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 15);
        Druide panoramix = new Druide("Panoramix", 10);

        System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom() + " tombent nez à nez sur le romain " + minus.getNom() + ".");

        panoramix.fabriquerPotion(4, 3);

        panoramix.boosterGaulois(obelix);
        panoramix.boosterGaulois(asterix);

        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
    }
}
