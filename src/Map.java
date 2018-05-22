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
        StdDraw.picture(1200 / 2, 620 / 2, "Carte Risk Vide.jpg", 1180, 600); //Taille de l'image à l'intérieur de la fenêtre
        StdDraw.setPenRadius(0.005); //Epaisseur des cercles
        Font fontNomsPays = new Font("Baskerville Old Face",Font.BOLD, 23); //On crée une nouvelle police

        StdDraw.setFont(fontNomsPays);//On définit la police comme étant xxx


        // AMERIQUE DU NORD

        StdDraw.text(120,575, "Amérique du Nord");

        StdDraw.circle(70,520,13); //Alaska
        StdDraw.circle(150,525,13); //Territoire du Nord-Ouest
        StdDraw.circle(150,470,13); //Alberta
        StdDraw.circle(210,460,13); //Ontario
        StdDraw.circle(280,462,13); //Québec
        StdDraw.circle(150,400,13); //Etat de l'Ouest
        StdDraw.circle(227,382,13); //Etat de l'Est
        StdDraw.circle(157,340,12); //Amerique Centrale
        StdDraw.circle(350,550,13); //Groenland


        // AMERIQUE DU SUD

        StdDraw.text(150,175, "Amérique");
        StdDraw.text(155,153, "du Sud");

        StdDraw.circle(230,270,13); //Venezuela
        StdDraw.circle(250,185,13); //Pérou
        StdDraw.circle(320,205,13); //Brésil
        StdDraw.circle(260,130,13); //Argentine

        // EUROPE

        StdDraw.text(540,560, "Europe");

        StdDraw.circle(423,491,13); //Islande
        StdDraw.circle(423,412,13); //Grande-Bretagne
        StdDraw.circle(427,320,13); //Europe Occidentale
        StdDraw.circle(495,483,13); //Scandinavie
        StdDraw.circle(505,415,13); //Europe du Nord
        StdDraw.circle(525,350,13); //Europe du Sud
        StdDraw.circle(610,470,13); //Ukraine

        // AFRIQUE

        StdDraw.text(460,120, "Afrique");

        StdDraw.circle(470,230,13); //Afrique du Nord
        StdDraw.circle(545,255,13); //Egypte
        StdDraw.circle(550,150,13); //Congo
        StdDraw.circle(550,70,13); //Afrique du Sud
        StdDraw.circle(642,70,13); //Madagascar
        StdDraw.circle(575,210,13); //Afrique de l'Est

        // ASIE

        StdDraw.text(915,330, "Asie");

        StdDraw.circle(645,250,13); //Moyen-Orient
        StdDraw.circle(710,320,13); //Inde
        StdDraw.circle(680,400,13); //Afghanistan
        StdDraw.circle(695,470,13); //Oural
        StdDraw.circle(750,550,13); //Sibérie
        StdDraw.circle(825,545,13); //Yakoutie
        StdDraw.circle(910,540,13); //Kamchatka
        StdDraw.circle(815,465,13); //Tchita
        StdDraw.circle(810,400,13); //Mongolie
        StdDraw.circle(935,390,13); //Japon
        StdDraw.circle(840,330,13); //Chine
        StdDraw.circle(825,265,13); //Siam

        // Australie

        StdDraw.text(790,110, "Australie");

        StdDraw.circle(840,170,13); //Indonésie
        StdDraw.circle(925,190,13); //Nouvelle-Guinée
        StdDraw.circle(860,70,13); //Australie Occidentale
        StdDraw.circle(970,70,13); //Australie Orientale


        }

    }
