import java.util.Scanner;
import java.util.InputMismatchException;

class Test {
    //if and for logic
     static void myMethod (int angka){
        for (int i = 1; i <= angka; i ++);{
            if (angka == 10){
                System.out.println("Sempurna.");
            } else if (angka > 10) {
                System.out.println("Maaf kamu tidak bisa lebih dari angka 10, silahkan input angka lain.");
            } else {
                System.out.println("Kamu tidak sempurna.");
            }}
        }

     
    //scanner + string input handler 
    public static void main (String[] args) {
        while (true) try {
            Scanner input = new Scanner(System.in);
                    System.out.print("Masukkan angka: ");
                    int angka = input.nextInt();
                    myMethod(angka);}

        catch (InputMismatchException e) {
            System.out.println("Maaf kamu hanya bisa input angka saja.");        
    }
    }
}
