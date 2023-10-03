import java.util.Scanner;

public class Pemilihan2Percobaan325 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String Kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        Kategori = input25.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input25.nextInt();

        if (Kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <=0)
                System.out.println("Penghasilan yang anda masukkan tidak valid");
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        }else if (Kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <=0)
                System.out.println("Penghasilan yang anda masukkan tidak valid");
             if (penghasilan <= 2500000)
                pajak = 0.1;
            else if (penghasilan <= 350000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        }else
            System.out.println("Masukkan Kategori Salah");
    }
}
