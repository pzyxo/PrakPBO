/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum03;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Pzyxo
 */
public class tebakAngka {
    /*atribut*/
    private int angkaAcak;
    private int skor = 100; //skor awal 

    
    
    private int generator(){ /*Method untuk membuat angka random*/
        Random r = new Random();
        int low = 0;
        int high = 100;
        angkaAcak = r.nextInt(high - low) + low; /*Rumus untuk mendapat nilai random range 0-100*/
        return angkaAcak; 
    }
    

    public void tebakAngka(){ /*Method untuk game tebak angkanya*/ 
        int generator = generator();
        int nilaiSalah = 0; //jumlah salah tiap tebakan
        int skorBonus = 0; //skor bonus
        Scanner input = new Scanner(System.in);
        System.out.println("Hai.. nama saya pzyxo, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        
        while (skor > 0){
            System.out.print("Masukkan nilai tebakan anda : "); /*Ini untuk menginputkan nilai tebakan*/
            int tebakan = input.nextInt();
                if (tebakan == angkaAcak){
                    System.out.println("\nYeeee… Bilangan tebakan anda BENAR :-)");
                    System.out.println("Skor anda : " + skor); 
                    if (nilaiSalah < 5){ /*ketika kesempatan salah kurang dari 5, mendapat bonus*/
                        skorBonus += 50;
                        skor += skorBonus;
                    }
                    System.out.println("Bonus : " + skorBonus);
                    System.out.println("Skor Total : " + skor);
                    break;
                } else {
                    if (tebakan > angkaAcak){
                        System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                    } else {
                        System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                    }
                    skor -= 2; /*Setiap jawaban salah, mengurangi skor awal*/
                    nilaiSalah += 1; /*Setiap jawaban yang salah, mengurangi kesempatan mendapat bonus*/
                }
                if (skor == 0){
                System.out.println("\nGame Over x.x");
                } 
               
        }
    }
}
