/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;

/**
 *
 * @author Pzyxo
 */
public class Keramik {
    
    //atribut
    public char merk;
    public double panjang;
    public double lebar;
    public double harga;
    public double isiBox;
    private double luas;
    private double dibutuhkan;
    private double box;
    private double hargaAkhir;
    
    //constructor
    Keramik(char m, double p, double l, double i, double h){
        this.merk = m;
        this.panjang = p;
        this.lebar = l;
        this.isiBox = i;
        this.harga = h;
    }
    
    
    //method    
    private double hitungLuas(){
        luas = this.panjang * this.lebar;
        return luas;
    }
    
    private double hitungDibutuhkan(){
        double hitungLuas = hitungLuas();
        double dibutuhkanA;
        dibutuhkanA = 100 / luas;
        dibutuhkan = Math.ceil(dibutuhkanA);
        return dibutuhkan;
    }
    
    private double hitungBox(){
        double hitungDibutuhkan = hitungDibutuhkan();
        double boxA;
        boxA = dibutuhkan / isiBox;
        box = Math.ceil(boxA);
        return box;
    }
    
    public double hitungHarga(){
        double hitungBox = hitungBox();
        hargaAkhir = box * this.harga;
        return hargaAkhir;
    }
    
    public void tampilkan(){
        System.out.println("\nJumlah keramik yang dibutuhkan merk " + this.merk + " adalah " + dibutuhkan);
        System.out.println("Jumlah biaya yang harus dikeluarkan adalah " + hargaAkhir);
    }
    
}
