package Objections;

import java.util.Scanner;

/*
Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.
 */
public class Brithday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz datę urodzin w formacie DD/MM/RRRR: ");
        String brithday = sc.nextLine();

        String [] parts = brithday.split("/");

        if (parts.length == 3) {
            String day = parts[0];
            String month = parts[1];
            String year = parts[2];

            System.out.println("Dzień: " + day);
            System.out.println("Miesiąc: " + month);
            System.out.println("Rok: " + year);
        } else {
            System.out.println("Podałeś zły format daty");
        }

    }
}
