package base.experiments;

import java.util.Scanner;

public class SystemIn
{
    public Scanner scanner = new Scanner(System.in);
    public static String passwort, ausgabe;

    public SystemIn(){
        System.out.println("Geben sie ihr Passwort ein:");
        passwort = scanner.nextLine();
        System.out.println("Passwort: ");
        ausgabe = scanner.nextLine();

        if(ausgabe.matches(passwort)){
            System.out.println("Richtig");
            System.out.println("Wollen sie das Passwort ändern?");
            ausgabe = scanner.nextLine();
            if (ausgabe.matches("ja")){
                System.out.println("Geben sie das neue Passwort ein:");
                ausgabe = scanner.nextLine();
                System.out.println("Ihr neues Passwort: "+ausgabe);
                ausgabe = passwort;
                System.out.println("Neuanmeldung erfolgt");
                new SystemIn();
            }
        }

        else{System.out.println("Falsch. Abbruch.");}
    }
}
