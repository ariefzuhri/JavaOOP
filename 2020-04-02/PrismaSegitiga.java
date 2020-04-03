public class PrismaSegitiga extends Lego {
    private double alas;
    private double tinggiAlas;

    public PrismaSegitiga(double alas, double tinggiAlas, double tinggi, String bahan, String warna) {
        super(bahan, warna, tinggi);
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        if (alas > 0) this.alas = alas;
    }

    public double getTinggiAlas() {
        return tinggiAlas;
    }

    public void setTinggiAlas(double tinggiAlas) {
        if (tinggiAlas > 0) this.tinggiAlas = tinggiAlas;
    }

    @Override
    public double getVolume() {
        return (0.5*alas*tinggiAlas)*getTinggi();
    }

    @Override
    public String toString() {
        return "PrismaSegitiga{" +
                "alas=" + alas +
                ", tinggiAlas=" + tinggiAlas +
                ", tinggi=" + getTinggi() +
                ", bahan=" + getBahan() +
                ", warna=" + getWarna() +
                '}';
    }
}
