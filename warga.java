import java.util.Scanner;

import javafx.scene.control.TableColumn.SortType;

public class warga {
    void warga1() {
        Scanner ab = new Scanner(System.in);

        System.out.println("-----*** Data Warga ***------");
        System.out.println("Masukan Nama : ");
        String nama = ab.nextLine();

        System.out.println("Masukan NIK : ");
        String nik = ab.nextLine();

        System.out.println("Masukan Alamat : ");
        String alamat = ab.nextLine();

        System.out.println("Masukan Telepon : ");
        String telepon = ab.nextLine();

        System.out.println("-----*** Data Pekerjaan ***-----");
        System.out.println("Masukan Nama Pekerjaan : ");
        String namapekerjaan = ab.nextLine();

        System.out.println("Masukan Alamat Kantor : ");
        String alakantor = ab.nextLine();

        System.out.println("-----*** Data Status ***-----");
        System.out.println("Masukan Status : ");
        String status = ab.nextLine();

        System.out.println("Masukan Nama Suami/Istri : ");
        String nmpasangan = ab.nextLine();

        System.out.println("Masukan Jumlah Anak : ");
        String jumlahanak = ab.nextLine();

        System.out.println("Lanjut bayar Iuran ?");

        String pilih = ab.nextLine();

        warga2();
    }

    void warga2() {
        Scanner ab = new Scanner(System.in);

        System.out.println("***Data Iuran Pokok***");

        System.out.print("NIK => ");
        String nik = ab.nextLine();

        System.out.println("Masukan Iuran Sampah");
        Integer sampah = ab.nextInt();

        System.out.println("Masukan Iuran Keamanan");
        Integer keamanan = ab.nextInt();

        System.out.println("***Data Iuran Sekunder***");

        System.out.println("Masukan Sumbangan");
        Integer sumbangan = ab.nextInt();

        Integer total = sampah + keamanan + sumbangan;

        System.out.println("||NIK                              " + nik);
        System.out.println("||Total Pembayaran Iuran Warga  || Rp. " + total);
        System.out.println("Terimakasih sudah membayar");
    }
}
