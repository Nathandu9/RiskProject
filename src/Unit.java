abstract class Unit {
    int cost;
    int power;
    int attackPriority;
    int defensePriority;
    int nbMovements;
    int idCountry;
    int idOwner; // ???

    public Unit(int cost, int power, int attackPriority, int defensePriority, int nbMovements){
        this.cost = cost;
        this.power = power;
        this.attackPriority = attackPriority;
        this.defensePriority = defensePriority;
        this.nbMovements = nbMovements;
    }

}
