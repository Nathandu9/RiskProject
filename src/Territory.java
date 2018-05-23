public class Territory {
<<<<<<< HEAD


    String name;
    int idCountry;
    int idOwner;
    int idRegion;
    int nbDefenders;

    public Territory(String name, int idCountry, int idRegion/*, int idOwner, int nbDefenders*/){
        this.name = name;
        this.idCountry = idCountry;
        this.idRegion = idRegion;


    }

    // Amérique du Nord

    Territory alaska = new Territory("Alaska", 1, 1);
    Territory territoireNordOuest = new Territory("Territoire du Nord-Ouest", 2, 1);
    Territory groenland = new Territory("Groenland", 3,1);
    Territory alberta = new Territory("Alberta", 4, 1);
    Territory ontario = new Territory("Ontario", 5, 1);
    Territory quebec = new Territory("Québec", 6, 1);
    Territory etatsUnisOuest = new Territory("Etats-Unis de l'Ouest", 7, 1);
    Territory etatsUnisEst = new Territory("Etats-Unis de l'Est", 8, 1);
    Territory ameriqueCentrale = new Territory("Amérique Centrale", 9, 1);

    // Amérique du Sud

    Territory venezuela = new Territory("Venezuela", 10, 2);
    Territory perou = new Territory("Pérou", 11, 2);
    Territory bresil = new Territory("Brésil", 12, 2);
    Territory argentine = new Territory("Argentine", 13, 2);

    // Europe

    Territory islande = new Territory("Islande", 14, 3);
    Territory grandeBretagne = new Territory("Grande-Bretagne", 15, 3);
    Territory europeOuest = new Territory("Europe de l'Ouest", 16, 3);
    Territory scandinavie = new Territory("Scandinavie", 17, 3);
    Territory europeNord = new Territory("Europe du Nord", 18, 3);
    Territory europeSud = new Territory("Europe du Sud", 19, 3);
    Territory ukraine = new Territory("Ukraine", 20, 3);

    // Afrique

    Territory afriqueNord = new Territory("Afrique du Nord", 21, 4);
    Territory egypte = new Territory("Egypte", 22, 4);
    Territory afriqueEst = new Territory("Afrique de l'Est", 23, 4);
    Territory congo = new Territory("Congo", 24, 4);
    Territory afriqueSud = new Territory("Afrique du Sud", 25, 4);
    Territory madagascar = new Territory("Madagascar", 26, 4);

    // Asie

    Territory oural = new Territory("Oural", 27, 5);
    Territory siberie = new Territory("Sibérie", 28, 5);
    Territory yakoutie = new Territory("Yakoutie", 29, 5);
    Territory kamchatka = new Territory("Kamchatka", 30, 5);
    Territory tchita = new Territory("Tchita", 31, 5);
    Territory japon = new Territory("Japon", 32, 5);
    Territory mongolie = new Territory("Mongolie", 33, 5);
    Territory chine = new Territory("Chine", 34, 5);
    Territory afghanistan = new Territory("Afghanistan", 35, 5);
    Territory moyenOrient = new Territory("Moyen-Orient", 36, 5);
    Territory inde = new Territory("Inde", 37, 5);
    Territory siam = new Territory("Siam", 38, 5);

    // Australie

    Territory indonesie = new Territory("Indonésie", 39, 6);
    Territory nouvelleGuinee = new Territory("Nouvelle-Guinée", 40, 6);
    Territory australieOuest = new Territory("Australie de l'Ouest", 41, 6);
    Territory australieEst = new Territory("Australie de l'Est", 42, 6);




>>>>>>> 0ab09b0dc00f0e2bb244c848d55e2fb7503a6e0d
}
