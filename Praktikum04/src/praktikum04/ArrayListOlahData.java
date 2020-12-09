/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum04;
/**
 * Author : pzyxo
 */

//package yang dibutuhkan
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.text.SimpleDateFormat;  
import java.util.Date;


public class ArrayListOlahData {
    
//    Array list yang digunakan
    private ArrayList<String> data_nim = new ArrayList();
    private ArrayList<String> data_nama = new ArrayList();
    private ArrayList<Date> data_tglLahir = new ArrayList();
    private ArrayList<Integer> data_gender = new ArrayList();
    
//    method untuk memulai program
    void menu() throws ParseException{
        try{
        Scanner input = new Scanner(System.in);
        OUTER:
        while (true) { //loop untuk mengulang menu terus menerus 
            System.out.println("-----------------------\n      Olah Data\n-----------------------"); 
            System.out.println("Menu :\n1. Tambah Data\n2. Hapus Data(dengan nim)\n3. Cari Data\n4. Tampil Data\n5. Keluar");
            System.out.print("Pilihan menu anda : ");
            int menu = input.nextInt();
            switch (menu) {
                case 1: //pilihan menu 1
                    {
                        System.out.println("-----------------------\n      Tambah Data\n-----------------------");

                            System.out.println("Masukkan Data yang akan ditambahkan");
                            System.out.println("-----------------------");
                            
                            //perintah untuk memasukkan data yang akan digunakan
                            System.out.printf("Nama             : ");
                            input.nextLine(); //agar bisa digunakan nextLine()
                            String name = input.nextLine(); //input nama
                            String nameCap = name.toUpperCase(); //mengubah nama menjadi huruf kapital
                            if (data_nama.contains(nameCap) == true){ //conditional jika data nama sudah ada dalam arrayList
                                System.out.println("Data sudah ada"); 
                                break;
                            } else {                                   //conditional jika data belum ada dalam arrayList
                                System.out.printf("Nim              : "); 
                                String nomor = input.nextLine();          //input nim
                                String numb = nomor.toUpperCase();        //mengubah nim menjadi huruf kapital
                                if (data_nim.contains(numb) == true){     //conditional jika data nim sudah ada dalam arrayList
                                    System.out.println("Data sudah ada");
                                    break;
                                } else {                                  //conditional jika data nim belum ada dalam arra
                                    System.out.printf("Tanggal lahir (DD-MM-YYYY) : ");
                                    String sDate1= input.nextLine();      //input string tanggal dengan format DD-MM-YYYY
                                    Date date1= new SimpleDateFormat("dd-MM-yyyy").parse(sDate1); //mengubah string ke Date
                                    System.out.print("Gender (0: Laki-laki atau 1: Perempuan)  : ");
                                    int gdr = input.nextInt();            //input gender ( 0 atau 1 )
                                    
                                    // awal perintah penambahan data ke dalam array list
                                    data_nama.add(nameCap);
                                    data_nim.add(numb);
                                    data_tglLahir.add(date1);
                                    data_gender.add(gdr);
                                    //end
                                    
                                    System.out.println("-----------------------");
                                    System.out.println("Data telah ditambahkan");
                                    System.out.println("-----------------------");
                                    System.out.println("Kembali ke menu utama");
                                }
                            } continue;
                    }
                case 2:
                    {
                        System.out.println("-----------------------\nHapus Data\n-----------------------");
                        System.out.println("Masukkan data nim yang akan dihapus");
                        System.out.print("NIM               : ");
                        String nim1 = input.next().toUpperCase(); //input nim dan mengubahnya menjadi huruf kapital
                        if (data_nim.contains(nim1) != true){     //conditional jika data tidak ada dalam arrayList
                            System.out.println("Data tidak ada"); 
                        } else {                                  //conditional jika data ada dalam arrayList
                            int index = Collections.binarySearch(this.data_nim, nim1); //mencari index dengan keyword
                            
                            //perintah untuk menghapus data dalam arrayList
                            data_nama.remove(index);
                            data_nim.remove(index);
                            data_tglLahir.remove(index);
                            data_gender.remove(index);
                            //end
                            
                            
                            System.out.println("-----------------------");
                            System.out.println("Data telah dihapus");
                            System.out.println("-----------------------");
                            System.out.println("Kembali ke menu utama");
                }
                        continue;
                    }
                case 3:
                    System.out.println("-----------------------\nCari Data\n-----------------------");
                    System.out.println("1. Cari data berdasarkan gender\n2. Cari data berdasarkan nim");
                    System.out.print("Pilihan anda : ");
                    int pilihan = input.nextInt();  //input pilihan untuk memilih menu
                    if (pilihan == 1){              //conditional jika dipilih menu 1
                        System.out.println("-----------------------\nBerdasarkan Gender\n-----------------------");
                        System.out.print("Pilih gender (0 / 1) : ");
                        int gend = input.nextInt(); //input gender
                        
                        for ( int i = 0; i < data_gender.size(); i++) { //loop untuk menampilkan data
                            if (data_gender.get(i) == gend){ //conditional untuk menampilkan data sesuai input gender
                                
                                System.out.println("-----------------------");
                                System.out.println("Nama : " + data_nama.get(i));
                                System.out.println("NIM : " + data_nim.get(i));
                                System.out.println("Tanggal Lahir : " + data_tglLahir.get(i));
                                System.out.println("Gender : " + data_gender.get(i));
                                System.out.println("-----------------------");
                            } 
                        }
                    } else if (pilihan == 2){               //conditional jika dipilih menu 2
                        System.out.println("\nBerdasarkan NIM\n-----------------------");
                        System.out.print("Masukkan NIM : ");
                        String numb = input.next().toUpperCase(); //input nim dan mengubahnya menjadi kapital
                        if (data_nim.contains(numb) != true){     //conditional jika data tidak ada lama arrayList
                            System.out.println("Data tidak ada");
                        } else {                                  //conditional jika data ada dalam arrayList
                            
                        int index = Collections.binarySearch(this.data_nim, numb); //mencari index dengan keyword
                        
                        //mendeklarasikan variabel baru
                        String cariNama = data_nama.get(index);
                        String cariNIM = data_nim.get(index);
                        Date caritanggal = data_tglLahir.get(index);
                        int cariGender = data_gender.get(index);
                        
                        //menampilkan data sesuai dengan index yang didapat
                        
                        System.out.println("-----------------------");
                        System.out.println("Nama : " + cariNama);
                        System.out.println("NIM : " + cariNIM);
                        System.out.println("Tanggal Lahir : " + caritanggal);
                        System.out.println("Gender : " + cariGender);
                        System.out.println("-----------------------");
                        System.out.println("Kembali ke menu utama");
                        }  
                    }continue;
                case 4:
                    System.out.println("-----------------------\nTampilkan Data\n-----------------------");
                    for ( int i = 0; i < data_nama.size(); i++) { //loop untuk menampilkan data arrayList
                        System.out.println("Nama                    : " + data_nama.get(i));
                        System.out.println("NIM                     : " + data_nim.get(i));
                        System.out.println("Tanggal Lahir (DDMMYY)  : " + data_tglLahir.get(i));
                        System.out.println("Gender                  : " + data_gender.get(i));
                        System.out.println("-----------------------");
                    }
                    
                    if ( data_nama.isEmpty() ){                   //conditional jika arrayList kosong
                        System.out.println("Data kosong, silahkan tambahkan data terlebih dahulu ");
                        System.out.println("-----------------------");
                    }
                    System.out.println("Jumlah mahasiswa : " + data_nama.size()); //menampilkan jumlah data
                    System.out.println("Kembali ke menu utama");
                    continue;
                case 5:
                    break OUTER; //keluar dari program
                default:
                    System.out.println("Silahkan masukkan kembali pilihan menu"); //menampilkan pesan jika terjadi error
                
            }
        }
        } catch (ParseException e){
            System.out.println("Maaf, terjadi error, silahkan restart program");
        }
    }

    
}


//fayusri royfanto - k3519033