
/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : Soal4BilGenap
 */
package Tugas1;

/**
 *
 * @author ASUS VIVOBOOK
 */
import java.util.Scanner;
public class Soal4BilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int angka;

        do{
            System.out.print("Masukkan bilangan genap: ");
            angka = input.nextInt();

            if (angka%2!=0) {
                System.out.println("Bilangan ganjil! Silakan input lagi");
            }

        }while (angka%2!=0);

        int hasil = angka+1;
        System.out.println("Hasil setelah ditambah 1: "+hasil);
    }
}