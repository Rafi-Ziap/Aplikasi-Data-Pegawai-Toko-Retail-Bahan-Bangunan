/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Pegawai {
    private String nama;
    private String id;
    private String usia;
    private String alamat;
    private String divisi;
    private String shift;

    public Pegawai(String nama, String id, String usia, String alamat, String divisi, String shift) {
        this.nama = nama;
        this.id = id;
        this.usia = usia;
        this.alamat = alamat;
        this.divisi = divisi;
        this.shift = shift;
    }

    public String getId() {
        return id;
    }

    public void setAll(String nama, String usia, String alamat, String divisi, String shift) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.divisi = divisi;
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Nama : " + nama +
               "\nID : " + id +
               "\nUsia : " + usia +
               "\nAlamat : " + alamat +
               "\nDivisi : " + divisi +
               "\nShift : " + shift + "\n";
    }
}
