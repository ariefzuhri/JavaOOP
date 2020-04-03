public class Tabung extends Lego {
    private static final double phi = 22.0/7;
    private double jari;

    public Tabung(double jari, double tinggi, String bahan, String warna) {
        super(bahan, warna, tinggi);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        if (jari > 0) this.jari = jari;
    }

    @Override
    public double getVolume() {
        return phi*jari*jari*getTinggi();
    }

    @Override
    public String toString() {
        return "Tabung{" +
                "jari=" + jari +
                ", tinggi=" + getTinggi() +
                ", bahan=" + getBahan() +
                ", warna=" + getWarna() +
                '}';
    }
}
