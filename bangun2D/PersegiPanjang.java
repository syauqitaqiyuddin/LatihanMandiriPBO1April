package bangun2D;

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getLuas(){
        return panjang *lebar;
    }
    public double getkeliling(){
        return 2*(panjang*lebar);
    }

    @Override
    public String toString() {
        return "PersegiPanjang{" +
                "panjang=" + panjang +
                ", lebar=" + lebar +
                '}';
    }
}
