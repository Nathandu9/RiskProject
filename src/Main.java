import java.util.*;

public class Main {
    public static void main(String[] args) {

        int choice;
        int joueurs;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("***RISK***\n1. Play\n2. Quitter\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Combien de joueurs voulez vous (2-6) ? \n");
                    joueurs = sc.nextInt();
                    while (joueurs < 2 || joueurs > 6) {
                        System.out.print("ERREUR\nCombien de joueurs voulez vous (2-6) ? \n");
                        joueurs = sc.nextInt();
                    }
                    System.out.println("Debut de la partie avec " + joueurs + " joueurs");
                    jeu(joueurs);
                    break;
                case 2:
                    System.out.print("Fermeture du programme.");
                    break;
            }
        }
        while (choice != 2);
    }

    public static void jeu(int joueurs) {
        String couleurs[] = {"Rouge", "Bleu", "Vert", "Jaune", "Orange", "Violet"};
        for (int i = 1; i < joueurs + 1; i++) {
            System.out.print("Joueur " + i + "\t");
        }
        System.out.print("\n");
        for (int i = 1; i < joueurs + 1; i++) {
            System.out.printf("%8s\t",couleurs[i]);
        }
        System.out.print("\n\n\n");
        return;
    }


}
