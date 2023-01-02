import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer pilih = 0;

        System.out.println("----------------------------------------");
        System.out.println("- Pendataan dan Pembayaran Iuran Warga -");
        System.out.println("----------------------------------------");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        pilih = sc.nextInt();

        warga n = new warga();

        if (pilih == 1) {
            n.warga1();
        }
        if (pilih == 2) {
            n.warga2();
        }
        while (pilih == 3) {
            ;
        }

    }

}