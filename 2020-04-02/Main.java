public class Main {
    public static void main(String[] args){
        Balok b = new Balok(10, 4, 3, "kayu", "merah");
        PrismaSegitiga ps3 = new PrismaSegitiga(5, 3, 10, "besi", "kuning");
        Tabung t = new Tabung(7, 10, "kayu", "biru");

        System.out.println(b);
        System.out.println(ps3);
        System.out.println(t);

        b.setPanjang(3);
        b.setLebar(13);

        ps3.setBahan("merah");
        ps3.setBahan("awan");

        t.setJari(14);
        t.setJari(0);

        System.out.println(b.getVolume());
        System.out.println(ps3.getVolume());
        System.out.println(t.getVolume());

        System.out.println(b);
        System.out.println(ps3);
        System.out.println(t);
    }
}
