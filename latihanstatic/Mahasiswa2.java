package latihanstatic;

public class Mahasiswa2 {
    // Attribute
    /*private*/ static String prodi = "TRPL";
    private static String nama;

    // Constructor
    public Mahasiswa2(String nama){
        Mahasiswa2.nama = nama;
    }

    // Method
    public static String getProdi() {
        return prodi;
    }

    public static void setProdi(String prodi) {
        Mahasiswa2.prodi = prodi;
    }

    public static String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        Mahasiswa2.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa2{" +
                "nama=" + nama + ", prodi=" + prodi +
                '}';
    }

    public static void gantiNama(String namaBaru){
        nama = nama;
    }
    public static String tanyaNama(){
        return nama;
    }
    public static String tanyaProdi(){
        return prodi;
    }
    public static String getDetail(){
        return "Mahasiswa2{" +
                "nama=" + getNama() + ", prodi=" + getProdi() +
                '}';
    }
}
