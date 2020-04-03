public class Balok extends Lego {
    private double panjang;
    private double lebar;

    public Balok(double panjang, double lebar, double tinggi, String bahan, String warna) {
        super(bahan, warna, tinggi);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        if (panjang > getLebar()){
            if (panjang > 0) this.panjang = panjang;
        }
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        if (lebar < getPanjang()){
            if (lebar > 0) this.lebar = lebar;
        }
    }

    @Override
    public double getVolume() {
        return panjang*lebar*getTinggi();
    }

    @Override
    public String toString() {
        return "Balok{" +
                "panjang=" + panjang +
                ", lebar=" + lebar +
                ", tinggi=" + getTinggi() +
                ", bahan=" + getBahan() +
                ", warna=" + getWarna() +
                '}';
    }
}
