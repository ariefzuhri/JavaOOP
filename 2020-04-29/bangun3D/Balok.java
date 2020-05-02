package bangun3D;

import bangun2D.PersegiPanjang;

public class Balok extends PersegiPanjang {
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getLuas() {
        return 2 * (getPanjang()*getLebar()+getPanjang()*tinggi+getLebar()*tinggi);
    }

    @Override
    public double getKeliling() {
        return 4 * (getPanjang()+getLebar()+tinggi);
    }

    public double getLuasAlas(){
        return super.getLuas();
        // Mengakses getLuas() dari superclass, bukan getLuas() dari kelas ini
    }

    public double getVolume(){
        return super.getLuas()*tinggi;
        /*
        Dapat juga menggunakan rumus:
        return getPanjang()*getLebar()*tinggi;
         */
    }

    @Override
    public String toString() {
        return "Balok{" +
                "panjang=" + getPanjang() +
                ", lebar=" + getLebar() +
                ", tinggi=" + tinggi +
                '}';
    }
}
