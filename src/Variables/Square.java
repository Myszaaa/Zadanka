package Variables;

import java.util.Scanner;

//Napisz program obliczający pole powierzchni, obwód oraz długość przekątnej dla kwadratów o następujących długościach boku: 2, 7, 11 oraz 19.
//Podpowiedź: do wyznaczenia pierwiastka kwadratowego z liczby użyj metody sqrt() z klasy Math np. Math.sqrt(16);
public class Square {
    public static void main(String[] args) {
        System.out.println("Podaj wartość boku kwadratu: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int polePowierzchni = a * a;
        int obwod = 4 * a;
        double przekatna = Math.sqrt(2) * a;

        System.out.println("Pole powierzchni kwadratu o boku " + a + " wynosi: " + polePowierzchni);
        System.out.println("Obwód kwadratu o boku " + a + " wynosi: " + obwod);
        System.out.println("Przekątna kwadratu o boku " + a + " wynosi: " + przekatna);

        scanner.close();
    }
}
