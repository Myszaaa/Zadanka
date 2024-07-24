package Operators;
//Napisz program, który potwierdzi, że poniższe działanie na liczbach binarnych jest poprawne.
//11001 & 11101 ^ 00011 = 11010
public class VerifyBinarry {
    public static void main(String[] args) {
        int a = 0b11001;
        int b = 0b11101;
        int c = 0b00011;
        int wynik = 0b11010;

        boolean isCorrect = (a & b ^ c) == wynik;
        System.out.println("Czy podane działanie jest poprawne: " + isCorrect);
    }
}
