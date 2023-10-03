import java.util.Scanner;

public class Suhu25 {

    public static void main(String[] args){
        Scanner sc25 = new Scanner(System.in);
        int suhu;
        String hujan;

        System.out.print("Masukkan Besaran Suhu : ");
        suhu = sc25.nextInt();

        if (suhu <= 27 ) {
             System.out.println("Memakai Dress");
       } else {
             System.out.println("Memakai Celana Pendek"); 
       }
        System.out.print("Apakah sekarang hujan (y atau t)? ");
        hujan = sc25.next();
            if (hujan.equals("y")) {
                System.out.println("Membawa Payung");
             }   else {
                System.out.println("Memakai sunscreen");
             }
            
    }
}
