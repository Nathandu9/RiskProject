public class Region {
    String nameRegion;
    int nbTerritories;
    int idRegion;
    int nbBonusUnits;
    int idOwner;


    public Region(String nameRegion, int nbTerritories, int idRegion, int nbBonusUnitsRegion){ // ID OWNER ???
        this.nameRegion = nameRegion;
        this.nbTerritories = nbTerritories;
        this.idRegion = idRegion;
        this.nbBonusUnits = nbBonusUnitsRegion;
        //ID OWNER ???
    }

    Region ameriqueDuNord = new Region("Amérique du Nord", 9, 1, 4);
    Region ameriqueDuSud = new Region("Amérique du Sud", 4, 2, 2);
    Region europe = new Region("Europe", 7, 3, 3);
    Region afrique = new Region("Afrique", 6,4, 3);
    Region asie = new Region("Asie", 12,5, 6);
    Region australie = new Region("Australie", 4, 6, 2);