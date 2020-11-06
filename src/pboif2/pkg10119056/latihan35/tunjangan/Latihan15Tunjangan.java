/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan35.tunjangan;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Tunjangan
 */

public class Latihan15Tunjangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Karyawan karyawan1=new Karyawan();
        System.out.println("============Program Tunjangan============");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        karyawan1.gajiPokok=input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum) :");
        karyawan1.status=input.next();
        
        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok      : Rp. "+karyawan1.gajiPokok);
        System.out.println("Tunjangan       : Rp. "+karyawan1.tunjangan());
        System.out.println("Total Gaji      : Rp. "+karyawan1.totalGaji());
        System.out.println("(Develover by: Irfan Ginanjar)");
    }
    
}
