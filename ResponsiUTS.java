package responsiUTS;

public class ResponsiUTS {

    // Kelas Main 
    public static void main(String[] args) {
        // Output Produk
        System.out.println("== Informasi Produk ==");
        // Objek Elektronik
        Produk komputer = new Elektronik("komputer", 750000000, 5);
        
        // Menampilkan informasi untuk produk Elektronik berupa Komputer
        komputer.infoProduk();
        System.out.println(); // Untuk spasi antar output
        
        // Output Pegawai
        System.out.println("== Informasi Pegawai ==");
        // Objek Pegawai Tetap
        Pegawai pegawaiTetap = new PegawaiTetap("Manda", 20000000, 500000);
        
        
        // Menampilkan informasi untuk pegawai Tetap
        pegawaiTetap.infoPegawai();
        System.out.println(); // Untuk spasi antar output
        
        // Output Polimorfisme
        System.out.println("== Informasi Polimorfisme ==");
        // Polimorfisme untuk Produk (Snack)
        Produk snack = new Makanan("Snack", 10000, "2024-10-15");
        snack.infoProduk();
        System.out.println();
        
        // Polimorfisme untuk Pegawai (Dinda)
        Pegawai pegawaiKontrak = new PegawaiKontrak("Dinda", 15000000, 10);
        pegawaiKontrak.infoPegawai();
    }
}
