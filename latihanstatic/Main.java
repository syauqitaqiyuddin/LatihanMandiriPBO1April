package latihanstatic;

public class Main {
    public static void main(String[] args) {
        // System.out.println(Mahasiswa2.prodi);
        // System.out.println(Mahasiswa2.nama);

        Mahasiswa2 st1 = new Mahasiswa2("Mr X satu");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());

        Mahasiswa2 st2 = new Mahasiswa2("Mr X dua");
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());

        st1.setProdi("Teknologi RPL");
        st1.setNama("Agus");
        st2.setProdi("Teknologi Rekayasa Perangkat Lunak");
        st2.setNama("Budi");

        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());

        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());

        Mahasiswa2.setProdi("Software Engineering Technology");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());

        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
    }
}
