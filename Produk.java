package responsiUTS;

// Enkapsulasi dan Akses modifer bersifat privat pada atribut namaProduk dan Harga
public class Produk {
    private String namaProduk;
    private int harga;
    
    // Konstruktor digunakan untuk menginisialisasi objek ketika dibuat
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga= harga;
    }
    
    // Getter dan Setter = Getter(untuk mendapatkan nilai dari variabel tersebut) dan Setter(untuk mengubah nilai dari variabel tersebut)
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    // Metode infoProduk()
    public void infoProduk() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Produk: " + harga);
    }
}

// Kelas Turunan bernama kelas Elektronik yang mewarisi kelas Produk
class Elektronik extends Produk {
    // Menambah atribut garansi untuk produk Elektronik
    private int garansi;
    
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    // Metode Override
    @Override
    public void infoProduk() {
        super.infoProduk(); // Untuk memanggil konstruktor kelas induknya (kelas Produk)
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

// Kelas Turunan bernama kelas Makanan yang mewarisi kelas Produk
class Makanan extends Produk {
    // Menambah atribut tanggalkadaluarsa untuk produk Makanan
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Metode Override
    @Override
    public void infoProduk(){
        super.infoProduk(); // untuk memanggil konstruktor kelas induknya (Kelas Produk)
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}