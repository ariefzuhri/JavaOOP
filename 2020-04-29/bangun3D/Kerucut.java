package bangun3D;
import master.Matematika;

public class Kerucut extends Tabung {
    public Kerucut(double r, double tinggi) {
        super(r, tinggi);
    }

    public double getLuas(){
        return getLuasAlas() + Matematika.phi*getR()*getSisiMiring();
    }

    private double getSisiMiring() {
        return Matematika.getMiring(getR(), getTinggi());
    }

    public double getVolume(){
        return super.getVolume()/3;
        /*
        Dapat juga menggunakan:
        return phi*getR()*getR()*getTinggi();
        */
    }

    @Override
    public String toString() {
        return "Kerucut{" +
                "r=" + getR() +
                ", tinggi=" + getTinggi() +
                '}';
    }
}
