package praktikum01;

/**
 *
 * @author Pzyxo
 * 
 * dalam class ini, menggunakan satu class dengan satu method
 */
public class penyelesaian {
   
        
    //method untuk menyelesaikan permasalahan
    public void Jumlah(char merk, double sisiA, double sisiB, double harga, double isi){
           
        //atribut di dalam method
        double jumlah;
        double jumlahDibutuhkan;
        double jumlahPcs;
        double hargaAkhir;
        
        
        
        jumlah = 100 / (sisiA * sisiB); //ini menunjukkan berapa jumlah keramik yg dibutuhkan
        jumlahDibutuhkan = Math.ceil(jumlah); //ini untuk membulatkan ke atas
        jumlahPcs = jumlahDibutuhkan / isi; //ini untuk menunjukkan berapa box yang dibutuhkan
        hargaAkhir = harga * Math.ceil(jumlahPcs); //menunjukkan berapa biaya untuk jumlah box keramik yang dibutuhkan
        
        //perintah untuk menampilkan hasil
        System.out.println("\n\nJumlah yang keramik " + merk + " yang dibutuhkan adalah " + (jumlahDibutuhkan));
        System.out.println("Jumlah box yang dibutuhkan untuk keramik " + merk + " adalah " + Math.ceil(jumlahPcs));
        System.out.println("Uang yang dibutuhkan untuk keramik " + merk + " adalah " + hargaAkhir);
    }
               
}
