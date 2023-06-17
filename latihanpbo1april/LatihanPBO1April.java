package latihanpbo1april;
import bangun2D.*;
import bangun3D.Limas;
import bangun3D.PrismaSegitiga;


public class LatihanPBO1April {
    public static void main(String[] args) {
//        try {
//            Segitiga segi3 = new SegitigaSiku(3, -4);
//            PrismaSegitiga prisma1 = new PrismaSegitiga(segi3, 10);
//            System.out.println(prisma1);
//            System.out.println(prisma1.getVolume());
//            System.out.println(prisma1.getDetailAlas());
//            System.out.println("----------------------");
//
//            SegitigaSamaKaki kaki = new SegitigaSamaKaki(10, 7);
//            PrismaSegitiga prisma2 = new PrismaSegitiga(kaki, 10);
//            System.out.println(prisma2);
//            System.out.println(prisma2.getVolume());
//            System.out.println(prisma2.getDetailAlas());
//            System.out.println("------------------------");
//        } catch (Exception e) {
//            System.out.println("An error occurred: " + e.getMessage());
//            e.printStackTrace();
//        }


        //tes output limas:
        Limas limasPersegi = new Limas(5.0, "Persegi");
        double volumePersegi = limasPersegi.volume();
        double luasPermukaanPersegi = limasPersegi.luasPermukaan();
        System.out.println("Volume Limas Persegi: " + volumePersegi);
        System.out.println("Luas Permukaan Limas Persegi: " + luasPermukaanPersegi);
        System.out.println("-----------------------------");

        Limas limasLingkaran = new Limas(7.0, "Lingkaran");
        double volumeLingkaran = limasLingkaran.volume();
        double luasPermukaanLingkaran = limasLingkaran.luasPermukaan();
        System.out.println("Volume Limas Lingkaran: " + volumeLingkaran);
        System.out.println("Luas Permukaan Limas Lingkaran: " + luasPermukaanLingkaran);
        System.out.println("-----------------------------");

        Limas limasSegitiga = new Limas(12,"Segitiga");
        double volumeSegitiga = limasSegitiga.volume();
        double luasPermukaanSegitiga = limasSegitiga.luasPermukaan();
        System.out.println("Volume limas segitiga: " + volumeSegitiga);
        System.out.println("Luas permukaan limas segitiga: " + luasPermukaanSegitiga);
        System.out.println("-----------------------------");

    }
}
