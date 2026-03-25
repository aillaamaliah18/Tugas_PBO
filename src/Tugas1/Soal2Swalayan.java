/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal2Swalayan
Deskripsi : Menghitung total pembelian, diskon (jika ada), dan total pembayaran
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal2Swalayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String merek;
        int jumlah;
        int harga = 0;
        double diskon = 0;
        double totalpembelian;
        double totalbayar;

        System.out.print("Masukkan merek susu (X/Y/Z): ");
        merek = input.next();
        System.out.print("Masukkan jumlah kotak: ");
        jumlah = input.nextInt();

        switch (merek) {
            case "X":
                harga = 40000;
                totalpembelian = harga*jumlah;

                if (jumlah >= 3) {
                    diskon = 0.10*totalpembelian;
                }break;

            case "Y":
                harga = 50000;
                totalpembelian = harga*jumlah;

                if (jumlah > 3) {
                    diskon = 0.12*totalpembelian;
                }break;

            case "Z":
                harga = 60000;
                totalpembelian = harga*jumlah;

                if (jumlah >= 2) {
                   diskon = 0.15*harga*(jumlah-1);
                }break;

            default:
                System.out.println("Merek tidak tersedia!");
                return;
        }

        totalpembelian = harga*jumlah;
        totalbayar = totalpembelian-diskon;

        System.out.println("Total Pembelian : Rp "+totalpembelian);
        System.out.println("Diskon          : Rp "+diskon);
        System.out.println("Total Bayar     : Rp "+totalbayar);
    }
}