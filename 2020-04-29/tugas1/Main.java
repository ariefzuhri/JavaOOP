package tugas1;

import tugas1.Manusia;

public class Main {
    public static void main(String[] args){
        Manusia a1 = new Manusia("Agus");
        System.out.println(a1);
        a1.setNama("Aji");
        System.out.println(a1.getNama());

        Manusia a2 = new Mahasiswa("Budi");
        System.out.println(a2);
        a2.setNama("Bayu");
        System.out.println(a2.getNama());

        Mahasiswa b1 = new Mahasiswa("Susi");
        System.out.println(b1);
        b1.setNama("Santi");
        System.out.println(b1.getNama());

        /*
        Output nomor 1:
        Tugas1.Manusia{nama=Agus}
        Aji
        Tugas1.Manusia{nama=null}
        Budi
        Tugas1.Manusia{nama=null}
        Susi

        Output nomor 2:
        Tugas1.Manusia{nama=Agus}
        Aji
        Tugas1.Manusia{nama=Budi}
        BayuBayu
        Tugas1.Manusia{nama=Susi}
        SantiSanti
        */
    }
}
