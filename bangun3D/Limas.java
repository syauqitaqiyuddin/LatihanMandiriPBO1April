package bangun3D;

public class Limas {
    private double tinggi;
    private String jenisAlas;

    public Limas(double tinggi, String jenisAlas) {
        this.tinggi = tinggi;
        this.jenisAlas = jenisAlas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public String getJenisAlas() {
        return jenisAlas;
    }

    public void setJenisAlas(String jenisAlas) {
        this.jenisAlas = jenisAlas;
    }

    public double volume() {
        if (jenisAlas.equals("Persegi")) {
            return (tinggi * tinggi * tinggi) / 3;
        } else if (jenisAlas.equals("PersegiPanjang")) {
            return (tinggi * tinggi * tinggi) / 3;
        } else if (jenisAlas.equals("Segitiga")) {
            return (tinggi * tinggi * tinggi) / 6;
        } else if (jenisAlas.equals("Lingkaran")) {
            return (tinggi * tinggi * tinggi * 22) / (7 * 3 * 6);
        } else {
            System.out.println("Jenis alas tidak dikenali");
            return 0.0;
        }
    }

    public double luasPermukaan() {
        double sisiTegak = Math.sqrt((tinggi * tinggi) / 2);

        if (jenisAlas.equals("Persegi")) {
            return (tinggi * tinggi * 5);
        } else if (jenisAlas.equals("PersegiPanjang")) {
            return (tinggi * tinggi) + (2 * tinggi * sisiTegak);
        } else if (jenisAlas.equals("Segitiga")) {
            return (tinggi * tinggi) + (2 * tinggi * Math.sqrt((tinggi * tinggi / 4) + (sisiTegak * sisiTegak)));
        } else if (jenisAlas.equals("Lingkaran")) {
            return (tinggi * tinggi * 22) / 7;
        } else {
            System.out.println("Jenis alas tidak dikenali");
            return 0.0;
        }
    }
}
