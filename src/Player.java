public class Player {

    String name ;
    int ID;
    int TerritoriesNumber;

    public Player(String name, int ID, int territoriesNumber) {
        this.name = name;
        this.ID = ID;
        TerritoriesNumber = territoriesNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTerritoriesNumber() {
        return TerritoriesNumber;
    }

    public void setTerritoriesNumber(int territoriesNumber) {
        TerritoriesNumber = territoriesNumber;
    }

}
