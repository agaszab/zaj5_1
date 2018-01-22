import java.util.Scanner;

public class TablicaLiczb {

    public static void main(String[] arg) {

        int suma = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj jaki rozmiar ma miec tablica:");
        int rozmiarTab = scan.nextInt();
        int[] tab = new int[rozmiarTab];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj " + i + " element tablicy");
            tab[i] = scan.nextInt();
        }

        for (int liczba : tab) {
            suma += liczba * liczba;
        }

        System.out.println("Suma kwadratow elementow tablicy jest rowna: " + suma);
    }
}