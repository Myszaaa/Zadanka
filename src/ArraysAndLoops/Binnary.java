package ArraysAndLoops;

import java.util.Scanner;

/*
Napisz program, który:
konwertuje binarną liczbę całkowitą na postać dziesiętną,
dane wejściowe są wprowadzane jako ciąg znaków,
wynik powinien być zmienną typu long,
nie korzystaj z gotowych rozwiązań.
Przykłady:

binary	decimal
0	0
11	3
1010101010101011	43691
1110000110000101100101000000	236476736
 */
public class Binnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę binarną: ");
        long liczbaBinarna = Long.parseLong(sc.nextLine());
        long dlugoscLiczby = String.valueOf(liczbaBinarna).length();
        System.out.println("Test dlugosci liczby: " + dlugoscLiczby);
        long[] binnary = new long[(int) dlugoscLiczby];
        for (int i = (int) dlugoscLiczby - 1; i >= 0 ; i--) {
            binnary[i] = liczbaBinarna % 10;
            liczbaBinarna = liczbaBinarna / 10;
        }
        for (int i = 0; i < binnary.length; i++) {
            System.out.println("tablica[ " + i + " ] = " + binnary[i]);
        }
        long [] mnoznik = new long[(int) dlugoscLiczby];
        int x = 0;
        for (int i = (int) dlugoscLiczby -1; i >= 0; i--) {
            mnoznik[i] = x;
            x++;
        }
        for (int i = 0; i < mnoznik.length; i++) {
            System.out.println("tablica mnoznika[ " + i + " ] = " + mnoznik[i]);
        }
        long wynik = 0;
        for (int i = 0; i < dlugoscLiczby; i++) {
            wynik += (long) (binnary[i] * Math.pow(2,dlugoscLiczby - 1 - mnoznik[i]));
        }
        System.out.println("Wynik dziesiętny: " + wynik);




    }
}
