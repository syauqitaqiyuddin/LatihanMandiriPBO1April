package latihanstatic;

public class Mahasiswa {
    public static String prodi = "TRPL";
    public String nama = "mr X";

    public static void main(String[] args) {
        System.out.println(Mahasiswa.prodi);
        // System.out.println(Mahasiswa.nama);

        Mahasiswa st1 = new Mahasiswa();
        System.out.println(st1.prodi);
        System.out.println(st1.nama);

        Mahasiswa st2 = new Mahasiswa();
        System.out.println(st2.prodi);
        System.out.println(st2.nama);

        st1.prodi = "Teknologi RPL";
        st1.nama = "Agus";
        st2.prodi = "Teknologi Rekayasa Perangkat Lunak";
        st2.prodi = "Budi";

        System.out.println(st1.prodi);
        System.out.println(st1.nama);

        System.out.println(st2.prodi);
        System.out.println(st2.nama);

        Mahasiswa.prodi = "Software Engineering Technology";
        System.out.println(st1.prodi);
        System.out.println(st1.nama);

        System.out.println(st2.prodi);
        System.out.println(st2.nama);
    }
}
