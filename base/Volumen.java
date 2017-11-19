package base;

import java.util.Scanner;

public class Volumen
{
    public Volumen(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib die Breite ein: ");
        int breite = Integer.parseInt(scanner.nextLine());

        System.out.println("Gib die Länge ein: ");
        int länge = Integer.parseInt(scanner.nextLine());

        System.out.println("Gib die Höhe ein: ");
        int höhe = Integer.parseInt(scanner.nextLine());

        int ausgabeZahlen = länge * breite * höhe;
        System.out.println("Deine Figur hat ein Volumen von " + ausgabeZahlen + "cm³.");

        System.out.println("Wollen sie noch einmal ein Volumen berechnen?");
        String ausgabe = scanner.nextLine();
        if(ausgabe.matches("ja"))new Volumen();
    }
}
