package latihanpbo1april;

import bangun2D.*;
import bangun3D.Limas;

public class UjiCobaNomor1 {
    public static void main(String[] args) {
        Limas limas1 = new Limas(new Persegi(20), 25);
        System.out.println(limas1.getLuasPermukaan()); // 1400.0

        Limas limas2 = new Limas(new PersegiPanjang(30, 25), 15);
        System.out.println(limas2.getLuasPermukaan()); // 1950.0

        Limas limas3 = new Limas(new SegitigaSamaSisi(4), 6);
        System.out.println(limas3.getLuasPermukaan()); // 42.9282032303

        Limas limas4 = new Limas(new Lingkaran(6), 8);
        System.out.println(limas4.getLuasPermukaan()); // 301.714285714

        Limas limas5 = new Limas(new Persegi(7), 9);
        System.out.println(limas5.getVolume()); // 147.0

        Limas limas6 = new Limas(new SegitigaSamaKaki(13, 6), 7);
        System.out.println(limas6.getVolume()); // 91.0

        Limas limas7 = new Limas(new Lingkaran(28), 15);
        System.out.println(limas7.getVolume()); // 12320.0
    }
}
