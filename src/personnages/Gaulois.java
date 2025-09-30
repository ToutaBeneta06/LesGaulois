package personnages;

public class Gaulois {
    private String nom;
    private int force;

    // Constructeur
    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // M�thode pour frapper un Romain
    public void frapper(Romain romain) {
        String nomRomain = romain.getNom();
        System.out.println(nom + " envoie un grand coup dans la m�choire de " + nomRomain);
        
        int forceCoup = force / 3;  // Calcul de la force du coup
        romain.recevoirCoup(forceCoup);  // Applique le coup au romain
    }
}



//Donc, par la suite, si vous voyez � l�affichage une adresse comme personnages.Gaulois@24d46ca6 alors que vous souhaitez la valeur d�un attribut
	//comme Ast�rix c�est s�rement que vous avez �crit System.out.println(asterix);
	//au lieu de System.out.println(asterix.getNom());, et qu'il n'y a pas eu r��criture
	//du toString dans la classe."
	

}
