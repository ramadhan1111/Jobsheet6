import java.util.Scanner;

public class Pemilihan2Percobaan225 {
    public static void main(String[] args){
        Scanner input25 =new Scanner(System.in);

        System.out.println("Masukkan sudut 1 : ");
        float sudut1 = input25.nextFloat();
        System.out.println("Masukkan sudut 2 : ");
        float sudut2 = input25.nextFloat();
        System.out.println("Masukkan sudut 3 : ");
        float sudut3 = input25.nextFloat();
        float totalsudut = sudut1 + sudut2 +sudut3;

        System.out.println("Total sudut : " + totalsudut );

        if (totalsudut == 180){
            if ((sudut1 == 90 ) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
         }  else 
                System.out.println("Bukan Segitiga");
    }
}
