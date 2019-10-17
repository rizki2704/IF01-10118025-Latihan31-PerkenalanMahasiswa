/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan31.perkenalanmahasiswa;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Mahasiswa {
    
    public String nim, nama;
    
    public void PerkenalkanDiri(String nim, String nama){
        System.out.println("Hello Everyone");
        System.out.printf("My NIM\t: %s%n", nim);
        System.out.printf("My Name\t: %s%n%n", nama);
    }
    
}
