package Paket;

public class Manusia {
    // Attribute
    private String nama;

    // Constructor
    public Manusia(String nama) {
        this.nama = nama;
    }

    // Method
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public String toString() {
        return "Manusia{" + "nama='" + nama + '}';
    }
}
