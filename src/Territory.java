public class Territory {

    int id ;
    String nom;
    int nbreDefenseurs;

    public Territory(int id, String nom, int nbreDefenseurs) {
        this.id = id;
        this.nom = nom;
        this.nbreDefenseurs = nbreDefenseurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbreDefenseurs() {
        return nbreDefenseurs;
    }

    public void setNbreDefenseurs(int nbreDefenseurs) {
        this.nbreDefenseurs = nbreDefenseurs;
    }
}
