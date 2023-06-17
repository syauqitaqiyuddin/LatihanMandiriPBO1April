package bangun2D;
import master.Matematika;
public class SegitigaSiku extends Segitiga{
    public SegitigaSiku (double a, double t) throws Exception {
        super(a,t);
            if (a <= 0 || t <= 0) {
                try {
                    throw new Exception("Alas dan tinggi harus bernilai positif !");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
    }

    @Override
    public double getKeliling(){
        return getAlas()+ getTinggi()+ getSisiMiring();
    }
    public double getSisiMiring(){
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }
    @Override
    public String toString(){
        return "SegitigaSiku (" + getAlas()+  ", t"+ getTinggi()+ ")";
    }
}
