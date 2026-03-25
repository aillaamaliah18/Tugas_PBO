/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal7UpahLembur
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal7UpahLembur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int jamlembur;
        int upahperjam;
        int totalupah;

        System.out.print("Masukkan jumlah jam lembur: ");
        jamlembur = input.nextInt();

        if (jamlembur<=20) {
            upahperjam = 2000;
        } 
        else {
            upahperjam = 3000;
        }
        if (jamlembur>50) {
            jamlembur = 50;
        }

        totalupah = jamlembur*upahperjam;

        System.out.println("Total upah lembur: Rp "+totalupah);
    }
}