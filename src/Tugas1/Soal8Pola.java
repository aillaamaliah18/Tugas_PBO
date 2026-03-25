/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal8Pola
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal8Pola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran pola: ");
        int n = input.nextInt();

        for (int i=0;i<n;i++) {          
            for (int j=0;j<n;j++) {      

                if (i==0||i==n-1) {
                    System.out.print("0 ");
                } 
                else if (i==j) {
                    System.out.print("0 ");
                } 
                else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}