package personnages;

public class Chaudron {
    private int quantitepotion = 0;
    private int forcePotion = 0;

    public boolean resterPotion() {
        return quantitepotion > 0;
    }

    public void remplirChaudron(int quantite, int forcePotion) {
        this.quantitepotion = quantite;
        this.forcePotion = forcePotion;
    }

    public int prendreLouche() {
        if (quantitepotion > 0) {
            quantitepotion--;
        }
    }
}

