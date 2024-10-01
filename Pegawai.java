package responsiUTS;

// Enkapsulasi dan Akses modifer bersifat privat pada atribut namaPegawai dan Gaji
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    // Konstruktor digunakan untuk menginisialisasi objek ketika dibuat
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai =namaPegawai;
        this.gaji = gaji;
    }
    
    // Getter dan Setter = Getter(untuk mendapatkan nilai dari variabel tersebut) dan Setter(untuk mengubah nilai dari variabel tersebut)
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setnamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public int getGaji(){
        return gaji;
    }
    
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    // Metode InfoPegawai()
    public void infoPegawai(){
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

// Kelas Turunan bernama kelas PegawaiTetap yang mewarisi kelas Pegawai
class PegawaiTetap extends Pegawai {
    private int tunjangan;
    
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    // Metode Override
    @Override
    public void infoPegawai() {
        super.infoPegawai();
        System.out.println("Tunjangan: " + tunjangan);
    }
}

// Kelas Turunan bernama kelas PegawaiKontrak yang mewarisi kelas Pegawai
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    // Metode Override
    @Override
    public void infoPegawai() {
        super.infoPegawai();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}