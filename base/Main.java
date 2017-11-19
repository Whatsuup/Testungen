package base;

import base.experiments.Game;
import base.experiments.SystemIn;
import base.gui.Gui;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Was wollen sie tuen?");
        System.out.println("    - Geben sie 'Volumen' für Volumenberechnung ein");
        System.out.println("    - Geben sie 'Alex' ein um in Alex´s Spielereien zu kommen");
        System.out.println("    - Geben sie 'Gui' ein um das Gui zu öffnen");
        System.out.println("    - Geben sie 'Game' ein um ein Spiel zu spielen");
        System.out.println("    - Geben sie 'Passwort' ein um zu den Passwörtern zu kommen");

        String firstScan = scanner.nextLine();
        if (firstScan.equals("Volumen"))new Volumen();
        if (firstScan.equals("Alex"))new Function();
        if (firstScan.equals("Gui"))new Gui();
        if (firstScan.equals("Game"))new Game();
        if (firstScan.equals("Passwort"))new SystemIn();
    }
}
