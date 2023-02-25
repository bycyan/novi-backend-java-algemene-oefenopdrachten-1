package nl.novi.opdrachten.beslissingsstructuren;
import java.util.Scanner;

public class Geslacht {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Wat is uw geslacht? man/vrouw/anders");
        String geslacht = userInputScanner.nextLine().toLowerCase();

        String man = "Dag meneer";
        String vrouw = "Dag mevrouw";
        String anders = "Dag persoon";

            if (geslacht.equals("man")) {
                System.out.println(man.toUpperCase());
            } else if (geslacht.equals("vrouw")) {
                System.out.println(vrouw.toUpperCase());
            } else {
                System.out.println(anders.toUpperCase());
            }

        /*
        Hier boven heeft de gebruiker zijn geslacht ingevoerd. Print met behulp van een beslissingsstructuur (if/else)
        de volgende berichten:
        Wanneer de gebruiker een 'man' is: "Dag meneer."
        Wanneer de gebruiker een 'vrouw' is": "Dag mevrouw."
        In alle andere gevallen: "Dag persoon."

        Bonus: Lukt het je om de code zo te maken dat hoofdletters genegeerd worden?
         */

    }

}
