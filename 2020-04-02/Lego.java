public abstract class Lego {
    private String bahan;
    private String warna;
    private double tinggi;

    public Lego(String bahan, String warna, double tinggi) {
        this.bahan = bahan;
        this.warna = warna;
        this.tinggi = tinggi;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        if (warna.equals("merah") || warna.equals("kuning") || warna.equals("biru")){
            this.warna = warna;
        }
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        if (tinggi > 0)  this.tinggi = tinggi;
    }

    public abstract double getVolume();
}
