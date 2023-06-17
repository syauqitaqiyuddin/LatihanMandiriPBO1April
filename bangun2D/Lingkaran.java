package bangun2D;
import master.Matematika;
public class Lingkaran {
    private double phi = 22.0/7;
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getLuas() {
        return Matematika.phi*r*r;
    }
    public double getKeliling() {
        return 2*Matematika.phi*r;
    }

    @Override
    public String toString() {
        return "Lingkaran{" +
                ", r=" + r +
                '}';
    }
}
