import java.util.Scanner;

public class Przedzial {






    public static void main  (String [] arg) {

        int liczba;
        int n=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj liczb od -100 do 100:");
        liczba=scan.nextInt();

        if (liczba>0) {
         while (liczba<100){
         System.out.println(liczba);
         liczba++; }

        } else{ n=-100;
            while (n<liczba){
                System.out.println(liczba);
                n++;
            }}


    }

}
