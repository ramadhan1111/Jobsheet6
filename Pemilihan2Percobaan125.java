import java.util.Scanner;

public class Pemilihan2Percobaan125 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Tahun :");
        int tahun = input.nextInt();
        if ((tahun % 4) == 0){
            if((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        
        }else
            System.out.println("Bukan Tahun Kabisat");
    }
}
