package ArraysAndLoops;

import java.util.Scanner;

/*
Napisz program, który dla dowolnej liczby całkowitej n z przedziału
(1 ≤ n ≤ 30) wypisuje macierz jak w poniższych przykładach.
Użyj dwóch zagnieżdżonych pętli.
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolną liczbę całkowitą, aby wypisać macierz: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("n = " + n + " matrix");
        System.out.println("---------------");
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print (i + j + "\t");
                count++;
            }
            System.out.println();
        }
    }
}
