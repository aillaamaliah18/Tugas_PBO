/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal6DiesNatalis
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal6DiesNatalis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur PNP: ");
        int umur = input.nextInt();

        if (umur%10==0) {
            int dekade = umur / 10;
            System.out.println("Dekade PNP Ke "+dekade);
        } else {
            System.out.println("Dies Natalis PNP Ke "+umur);
        }
    }
}