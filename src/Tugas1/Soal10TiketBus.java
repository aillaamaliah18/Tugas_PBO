/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal10TiketBus
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal10TiketBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int tujuan, kelas, jumlah;
        int harga = 0;
        int total;
        double diskon = 0;
        double bayar;

        System.out.print("Masukkan tujuan (1=Jakarta, 2=Yogya, 3=Surabaya): ");
        tujuan = input.nextInt();

        System.out.print("Masukkan kelas (1=Eksekutif, 2=Bisnis, 3=Ekonomi): ");
        kelas = input.nextInt();
        System.out.print("Masukkan jumlah tiket: ");
        jumlah = input.nextInt();

        if (tujuan==1) {
            if (kelas==1) harga = 70000;
            else if (kelas==2) harga = 40000;
            else if (kelas==3) harga = 10000;
        } 
        else if (tujuan==2) {
            if (kelas==1) harga = 80000;
            else if (kelas==2) harga = 50000;
            else if (kelas==3) harga = 20000;
        } 
        else if (tujuan==3) {
            if (kelas==1) harga = 90000;
            else if (kelas==2) harga = 60000;
            else if (kelas==3) harga = 30000;
        }

        total = harga*jumlah;

        if ((tujuan==3&&kelas==1&&jumlah>=4) ||
            (tujuan==2&&kelas==3&&jumlah>=4)) {
            diskon = 0.1*total;
        }

        bayar = total-diskon;

        System.out.println("Harga tiket   : Rp " +harga);
        System.out.println("Total harga   : Rp " +total);
        System.out.println("Diskon        : Rp " +diskon);
        System.out.println("Total bayar   : Rp " +bayar);
    }
}