public class Zmienne {
    public static void main(String[] args) {
        int liczba1;
        liczba1 = 13;

        double liczba2 = 17.7;

        System.out.println("Moja zmienna: " + liczba1);

        //zmienna x1 przechowuje...
        int hours = 8;
        int days = 5;
        int weeks = 52;

        int workHoursPerYear = hours * days * weeks;


        System.out.println("Wynik: " + workHoursPerYear);

        int wymiar1 = 3;
        int wymiar2 = 6;
        int pom1 = wymiar1 * wymiar2;
        wymiar1 = 5;
        wymiar2 = 7;
        int pom2 = wymiar1 * wymiar2;

        char znak = '#';

        String napis = "Dzisiaj\t jest \"ładnie\"";
        napis += "!";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój napis: " + napis + "koniec \n");
        System.out.print("Mój napis: " + napis);
        System.out.print("Mój\\ napis: " + napis);

        boolean sun = true; //false

    }
}
