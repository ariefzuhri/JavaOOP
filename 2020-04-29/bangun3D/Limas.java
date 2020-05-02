package bangun3D;

import bangun2D.*;
import master.Matematika;

public class Limas {
    private BangunDatar alas;
    private double tinggi;

    public Limas(Persegi alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Limas(PersegiPanjang alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Limas(Lingkaran alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Limas(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public BangunDatar getAlas() {
        return alas;
    }

    public void setAlas(BangunDatar alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public String toString() {
        return "Limas{" +
                "alas=" + alas +
                ", tinggi=" + tinggi +
                '}';
    }

    public double getVolume(){
        return (tinggi * alas.getLuas())/3;
    }

    public double getLuasPermukaan(){
        return getLuasAlas() + getLuasSelimut();
    }

    public double getLuasAlas(){
        return alas.getLuas();
    }

    public double getLuasSelimut(){ // Jumlah luas-luas pada sisi tegak
        if (getDetailAlas().equals("Persegi")){
            return 4*0.5*((Persegi) alas).getSisi()*tinggi;
        } else if (getDetailAlas().equals("Persegi Panjang")){
            return 2*0.5*((PersegiPanjang) alas).getPanjang()*tinggi + 2*0.5*((PersegiPanjang) alas).getLebar()*tinggi;
        } else if (getDetailAlas().equals("Lingkaran")){
            return Matematika.phi*((Lingkaran) alas).getR()*Matematika.getMiring(((Lingkaran) alas).getR(), tinggi);
        } else{ // if (getDetailAlas().equals("Segitiga")){
            return 3*0.5*((Segitiga) alas).getAlas()*tinggi;
        }
    }

    public String getDetailAlas(){
        if (alas instanceof Persegi){
            return "Persegi";
        } else if (alas instanceof PersegiPanjang){
            return "Persegi Panjang";
        } else if (alas instanceof Lingkaran){
            return "Lingkaran";
        } else if (alas instanceof Segitiga){
            return "Segitiga";
        } else {
            return "Limas";
        }
    }
}
