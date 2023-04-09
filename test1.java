import java.util.Scanner;
import java.util.InputMismatchException;

class myMethod {
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        while (true){
            //handling int input
            try {
                System.out.print("Masukkan angka: ");
                int umur = input.nextInt();
            //for logic
            // for (umur == 10; umur++){
            //     System.out.println(umur)
            // }
            //if logic
            if (umur == 10){
                System.out.println("Sempurna.");
            } else if (umur > 10) {
                System.out.println("Maaf kamu tidak bisa lebih dari angka 10, silahkan input angka lain.");
            } else {
                System.out.println("Kamu tidak sempurna.");
            }
            }
            //handling other type data input
            catch (InputMismatchException e)
            {
                input.next();
                System.out.println("Maaf kamu hanya bisa input angka saja.");
            }
        }
    }
}