package Operators;

/*Napisz program, który oblicza ile warta byłaby inwestycja na kwotę 14 000 zł,
gdyby jej wartość zwiększyła się w pierwszym roku o 40%,
w drugim roku zanotowała stratę w wysokości 1500 zł, a w trzecim roku zwiększyła się o 12%.
*/
public class Investment {
    public static void main(String[] args) {
        double inwestycja = 14000;
        double pierwszyRok = inwestycja * 1.4;
        System.out.println("Inwestycja: " + inwestycja + " zł.");
        System.out.println("Pierwszy rok: " + pierwszyRok + " zł.");
        double drugiRok = pierwszyRok - 1500;
        System.out.println("Drugi rok: " + drugiRok + " zł.");
        double trzeciRok = drugiRok * 1.12;
        System.out.println("Trzeci rok: " + trzeciRok + " zł.");
    }
}

