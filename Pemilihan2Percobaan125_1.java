import java.util.Scanner;

public class Pemilihan2Percobaan125_1 {
    public static void main (String[] args){
        Scanner input25 = new Scanner(System.in);
        System.out.println("Masukkan Tahun :");
        int tahun = input25.nextInt();
        if ((tahun % 4 == 0 && tahun % 100 != 0 ) || tahun % 400 == 0){

            if((tahun % 100) != 0){
                System.out.println("Tahun Kabisat");
        }
        }else
            System.out.println("Bukan Tahun Kabisat");
    }
}

