public class StringDemo {
    public static void main(String[] args) {
        String name = "Alfred";
        int dlugosc;
        dlugosc = name.length();
        char inicjal = name.charAt(0);

        System.out.println("Ilość znaków: " + dlugosc + ", inicjał: " + inicjal);

        String male, duze;
        male = name.toLowerCase();
        duze = name.toUpperCase();
        System.out.println(male + ", " + duze);


    }
}
