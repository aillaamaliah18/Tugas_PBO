/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal3DeretBil
Deskripsi : Menghitung jumlah deret dan rata-ratanya
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal3DeretBil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        int jumlah = 0;
        int total = 0;

        System.out.print("Masukkan batas awal: ");
        awal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        akhir = input.nextInt();
        System.out.println("Deret bilangan:");

        for (int i=awal;i<=akhir;i++) {
            if (i%11==0&&i%2!=0) { 
                System.out.print(i + " ");
                total = total+i;
                jumlah++;
            }
        }

        System.out.println();
        if (jumlah>0) {
            double rata = (double) total/jumlah;
            System.out.println("Jumlah deret: "+total);
            System.out.println("Rata-rata: "+rata);
        } 
    }
}