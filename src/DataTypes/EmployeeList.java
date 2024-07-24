package DataTypes;
/*
Firma chce przechowywać informacje o swoich pracownikach w systemie.
Każdy z rekordów definiujący pracownika powinien zawierać poniższe informacje:
    - First name
    - Last name
    - Age (0…100)
    - Gender (m or f)
    - Personal ID number (e.g. 8306112507)
Zadeklaruj zmienne potrzebne do zachowania informacji dla jednego pracownika, używając odpowiednich typów danych.
Używaj opisowych nazw. Wprowadź i wyświetl przykładowe dane.
*/
public class EmployeeList {
    public static void main(String[] args) {
        String firstName = "Michał";
        String lastName = "Kowalski";
        int age = 25;
        char gender = 'M';
        long IDNumber = 10000l;

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("ID Number: " + IDNumber);
    }
}
