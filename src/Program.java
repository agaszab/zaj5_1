import java.util.Scanner;

public class Program {

    public static void main  (String [] arg) {

        int index=0;
        int wynik=0;
        Scanner scan=new Scanner(System.in);
        int [] liczby=new int[5];

        while (index<liczby.length){
            System.out.println("Podaj liczbe:");
            liczby[index]=scan.nextInt();
            wynik+=liczby[index];
           index++;

        }
        wynik=liczby[0]+liczby[1]+liczby[2]+liczby[3]+liczby[4];
        System.out.println("Suma podanych przeci ciebie liczb jest rowna "+wynik);



    }
}
