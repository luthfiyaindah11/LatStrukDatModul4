
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luthfiya Indah Fithriani
 */
public class Mahasiswa {
    
    
    String nama, kelas, matkulPraktikum;
    int nim;
    
    public Mahasiswa (String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       HashMap<String, Mahasiswa> mhs = new HashMap<>();
       String input;
       Mahasiswa data;
       
       mhs.put("1", new Mahasiswa("Putri ", " 3H ", "Struktur Data", 2020000));
       mhs.put("2", new Mahasiswa("Agus ", " 3A ", "Matematika", 2020012));
       mhs.put("3", new Mahasiswa("Arro", "3O", "Pemrograman", 2020017));
       
        System.out.print("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas : " + data.kelas + ", Mata kuliah praktikum : "
            + data.matkulPraktikum + ", NIM : " + data.nim);
        }
    }
    
}
