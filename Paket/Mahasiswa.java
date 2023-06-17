package Paket;

public class Mahasiswa extends Manusia{
    // Attribute
    private String nama;

    // Constructor
    public Mahasiswa(String nama) {
        super(nama);
    }

    // Method
    @Override
    public void setNama(String nama) {
        this.nama = nama + nama;
    }
    @Override
    public String toString() {
        return "Manusia{" + "nama=" + nama + "}";
    }
}
