import java.util.Scanner;

public class Latihan2_25 {
    public static void main(String[] args){
        Scanner input25 = new Scanner(System.in);
        String Kategori;
        int jumlahBuku, harga, total, bayar;
        double diskon = 0;
        double diskon1 = 0;
        double diskon2 = 0;
        System.out.println("Masukkan Kategori Buku");
        Kategori =input25.next();
        System.out.println("Masukkan Jumlah buku yang dibeli");
        jumlahBuku =input25.nextInt();
        System.out.println("Masukkan Harga Buku");
        harga =input25.nextInt();

        if (Kategori.equalsIgnoreCase("kamus")){
            if (jumlahBuku > 2){
                diskon = 0.12;
                System.out.println("Anda mendapat diskon sebesar 10% dan tambahan 2%");
            }else if (jumlahBuku <= 2){
                diskon = 0.1;
                 System.out.println("Anda mendapat diskon sebesar 10%");
            }
            total = (jumlahBuku * harga);
            diskon1 = total * diskon;
            bayar = (int) (total - (total * diskon));
            System.out.println("Anda mendapat diskon sebanyak : Rp " + diskon1);
            System.out.println("Total Harga: " + bayar);
        }else if (Kategori.equalsIgnoreCase("Novel")){
            if (jumlahBuku > 3){
                diskon = 0.09;
                 System.out.println("Anda mendapat diskon sebesar 7% dan tambahan 2%");
            }else if (jumlahBuku <= 3){
                diskon = 0.08;
                 System.out.println("Anda mendapat diskon sebesar 8%");
            }
            total = (jumlahBuku * harga);
            diskon2 = total * diskon;
            bayar = (int) (total -(total * diskon));
            System.out.println("Anda mendapat diskon sebanyak : Rp " + diskon2);
            System.out.println("Total Harga: " + bayar);
        }


    }
}
