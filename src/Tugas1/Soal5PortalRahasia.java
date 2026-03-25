/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal5PortalRahasia
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal5PortalRahasia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int awal, akhir;

        System.out.print("Masukkan nomor awal: ");
        awal = input.nextInt();
        System.out.print("Masukkan nomor akhir: ");
        akhir = input.nextInt();
        System.out.println("Misi yang membuka portal:");

        for (int i=awal;i<=akhir;i++) {
            if (i%3==0&&i%4==0) {
                System.out.print(i + " ");
            }
        }
    }
}