/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal1UangDina
Deskripsi : menghitung berapa uang yang pasti diterima dan yang masih bisa 
Dina dapatkan jika menyelesaikan semua sisa halaman yang belum diketik
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal1UangDina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int totalhalaman = 50;
        int upahperhalaman = 15000;

        System.out.print("Masukkan jumlah halaman yang sudah diketik (X): ");
        int x = input.nextInt();

        int uangditerima = x*upahperhalaman;
        int sisahalaman = totalhalaman-x;
        int uangsisa = sisahalaman*upahperhalaman;

        System.out.println("Uang yang sudah diterima Dina: Rp "+uangditerima);
        System.out.println("Uang yang masih bisa didapatkan: Rp "+uangsisa);
    }
}