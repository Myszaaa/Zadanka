package Operators;
import java.util.Scanner;
/*
Napisz wyrażenie logiczne, które sprawdza,
czy dana liczba całkowita może być podzielona (bez reszty) przez 7 i 5 jednocześnie.
 */
public class VerifyNumber {
    public static void main(String[] args) {
        System.out.println("Wpisz liczbę całkowitą: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 7 == 0 && number % 5 == 0) {
            System.out.println("Liczba " + number + " jest podzielna przez 7 i 5.");
        } else {
            System.out.println("Liczba " + number + " nie jest podzielna przez 7 i 5.");
        }
    }
}
