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
public class Praktikum02 {


    public static void main(String[] args) {
        Keramik p1 = new Keramik('A', 0.3, 0.3, 10, 54000);
        
        p1.hitungHarga();
        p1.tampilkan();
       
        Keramik p2 = new Keramik('B', 0.4, 0.4, 5, 65000);
        
        p2.hitungHarga();
        p2.tampilkan();
        
        Keramik p3 = new Keramik('C', 0.3, 0.4, 8, 60000);
        
        p3.hitungHarga();
        p3.tampilkan();
    }
    
}
