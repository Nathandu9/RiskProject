public class Region {

    int ID;
    int TerritoriesNumber;
    String Owner;

    public Region(int ID, int nbreTerritories, String detenteur) {
        this.ID = ID;
        TerritoriesNumber = nbreTerritories;
        Owner = detenteur;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNbreTerritories() {
        return TerritoriesNumber;
    }

    public void setNbreTerritories(int nbreTerritories) {
        TerritoriesNumber = nbreTerritories;
    }

    public String getDetenteur() {
        return Owner;
    }

    public void setDetenteur(String detenteur) {
        Owner = detenteur;
    }

}