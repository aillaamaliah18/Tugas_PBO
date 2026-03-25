/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal9PolaAngka
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal9PolaAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran: ");
        int n = input.nextInt();

        for (int i=1;i<=n;i++) {
            
            for (int j=1;j<=n-i;j++) {
                System.out.print("  "); 
            }

            for (int k=n-i+1;k<=n;k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
        
     }
}