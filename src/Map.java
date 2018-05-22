import java.awt.Color;
import java.awt.event.KeyEvent;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.*;
import java.applet.*;

public class Map {
    public final static int X_MAX = 1200;
    public final static int Y_MAX = 620;
    public final static float WIDTH = 1f;


    public static void main(String[] args){
        StdDraw.setCanvasSize(1200, 620); //Taille de la fenêtre
        StdDraw.setXscale(0, X_MAX + WIDTH);
        StdDraw.setYscale(0, Y_MAX + WIDTH);
        StdDraw.picture(1200 / 2, 620 / 2, "RiskMapV2.jpg", 1180, 600); //Taille de l'image à l'intérieur de la fenêtre
        StdDraw.setPenRadius(0.005); //Epaisseur des cercles
        Font fontNomsPays = new Font("Baskerville Old Face",Font.BOLD, 23); //On crée une nouvelle police

        StdDraw.setFont(fontNomsPays);//On définit la police comme étant xxx


        // AMERIQUE DU NORD

        StdDraw.text(130,575, "Amérique du Nord");

        StdDraw.circle(70,520,13); //Alaska
        StdDraw.circle(150,525,13); //Territoire du Nord-Ouest
        StdDraw.circle(150,470,13); //Alberta
        StdDraw.circle(220,460,13); //Ontario
        StdDraw.circle(300,462,13); //Québec
        StdDraw.circle(150,400,13); //Etat de l'Ouest
        StdDraw.circle(227,382,13); //Etat de l'Est
        StdDraw.circle(165,337,13); //Amerique Centrale
        StdDraw.circle(350,550,13); //Groenland


        // AMERIQUE DU SUD

        StdDraw.text(160,175, "Amérique");
        StdDraw.text(165,153, "du Sud");

        StdDraw.circle(230,270,13); //Venezuela
        StdDraw.circle(260,185,13); //Pérou
        StdDraw.circle(320,210,13); //Brésil
        StdDraw.circle(265,130,13); //Argentine

        // EUROPE

        StdDraw.text(540,560, "Europe");

        StdDraw.circle(440,493,13); //Islande
        StdDraw.circle(427,420,13); //Grande-Bretagne
        StdDraw.circle(445,325,13); //Europe de l'Ouest
        StdDraw.circle(510,483,13); //Scandinavie
        StdDraw.circle(515,410,13); //Europe du Nord
        StdDraw.circle(545,355,13); //Europe du Sud
        StdDraw.circle(620,460,13); //Ukraine

        // AFRIQUE

        StdDraw.text(470,130, "Afrique");

        StdDraw.circle(470,230,13); //Afrique du Nord
        StdDraw.circle(570,255,13); //Egypte
        StdDraw.circle(570,160,13); //Congo
        StdDraw.circle(570,70,13); //Afrique du Sud
        StdDraw.circle(670,70,13); //Madagascar
        StdDraw.circle(600,210,13); //Afrique de l'Est

        // ASIE

        StdDraw.text(955,335, "Asie");

        StdDraw.circle(665,250,13); //Moyen-Orient
        StdDraw.circle(750,320,13); //Inde
        StdDraw.circle(710,400,13); //Afghanistan
        StdDraw.circle(730,470,13); //Oural
        StdDraw.circle(770,540,13); //Sibérie
        StdDraw.circle(860,545,13); //Yakoutie
        StdDraw.circle(950,540,13); //Kamchatka
        StdDraw.circle(860,465,13); //Tchita
        StdDraw.circle(860,405,13); //Mongolie
        StdDraw.circle(983,395,13); //Japon
        StdDraw.circle(840,350,13); //Chine
        StdDraw.circle(860,270,13); //Siam

        // Australie

        StdDraw.text(825,110, "Australie");

        StdDraw.circle(880,167,13); //Indonésie
        StdDraw.circle(970,190,13); //Nouvelle-Guinée
        StdDraw.circle(910,70,13); //Australie de l'Ouest
        StdDraw.circle(1010,70,13); //Australie de l'Est

        }

    }
