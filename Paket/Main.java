package Paket;

public class Main {
    public static void main(String[] args) {
        /*
        CONTOH PENJELASAN
        Manusia a1 = new Manusia("Agus");
        System.out.println(a1);
        a1.setNama("Aji");
        System.out.println(a1.getNama() + "\n");

        Manusia a2 = new Mahasiswa("Budi");
        System.out.println(a2.getNama());
        System.out.println(a2);
        a2.setNama("Bayu");
        System.out.println(a2.getNama());
        System.out.println(a2 + "\n");

        Mahasiswa b1 = new Mahasiswa("Susi");
        System.out.println(b1.getNama());
        System.out.println(b1);
        b1.setNama("Santi");
        System.out.println(b1.getNama());
        System.out.println(b1);
        */
        Manusia orang1 = new Manusia("Agus");
        System.out.println(orang1);
        orang1.setNama("Aji");
        System.out.println(orang1.getNama());

        Manusia orang2 = new Manusia("Budi");
        System.out.println(orang2);
        orang2.setNama("BayuBayu");
        System.out.println(orang2.getNama());

        Manusia orang3 = new Manusia("Susi");
        System.out.println(orang3);
        orang3.setNama("SantiSanti");
        System.out.println(orang3.getNama());

    }
}
