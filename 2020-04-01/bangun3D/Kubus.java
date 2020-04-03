package bangun3D;

import bangun2D.Persegi;

public class Kubus extends Persegi {
    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public double getLuas() {
        return super.getLuas();
        /*
        Dapat juga menggunakan rumus:
        return 6*getSisi()*getSisi();
        */
    }

    @Override
    public double getKeliling() {
        return 12 * getSisi();
    }

    public double getLuasAlas(){
        return super.getLuas();
        // Mengakses getLuas() dari superclass, bukan getLuas() dari kelas ini
    }

    public double getVolume(){
        return super.getLuas()*getSisi();
        /*
        Dapat juga menggunakan rumus:
        return getSisi()*getSisi()*getSisi();
         */
    }

    @Override
    public String toString() {
        return "Kubus{" +
                "sisi=" + getSisi() +
                "}";
    }
}