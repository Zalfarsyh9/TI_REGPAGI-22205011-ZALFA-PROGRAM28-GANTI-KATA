/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi22205011.latihan28.zalfa.java;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TI_REGPAGI22205011Latihan28ZalfaJava {

    public static void main(String[] args) {
        //Deklarasi variabel
        String kalimat, kataAsal, kataGanti, kalimatBaru;
        
        //Input kalimat dari user 
        System.out.println("==== Program Mengganti kata ====");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan kalimat: ");
        kalimat = input.nextLine();
        
        //Input kata yang akan diganti
        System.out.println("Ganti kata");
        kataAsal = input.nextLine();
        
        //Input kata pengganti 
        System.out.println("Menjadi kata");
        kataGanti = input.nextLine();
        
        //Ganti kata dalam kalimat
        kalimatBaru = kalimat.replaceAll(kataAsal, kataGanti);
         
        //Tampilkan hasil 
        System.out.println("\n==== Hasil Formating ====");
        System.out.println("Kalimat awal\t: " +kalimat);
        System.out.println("kalimat baru\t: " +kalimatBaru);
    
    }
}

