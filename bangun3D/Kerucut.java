package bangun3D;
import master.Matematika;
public class Kerucut extends Tabung{
    private double phi = 22.0/7;
    public Kerucut(double r, double tinggi) {
        super(r, tinggi);
    }
    public double getLuas(){
        return getLuasAlas() + phi*getR()* getSisiMiring();
    }
    public double getSisiMiring(){
        return Matematika.getMiring(getR(), getTinggi());
    }
    public double getVolume() {
        return phi*getR()*getR()*getTinggi();
    }

    @Override
    public String toString() {
        return "Kerucut{" + getR() + "tinggi=" + getTinggi() + "}";
    }
}
