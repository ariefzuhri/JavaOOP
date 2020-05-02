package tugas1;

public class Mahasiswa extends Manusia {
    private String nama;

    public Mahasiswa(String nama) {
        super(nama);
        this.nama = nama; // tambah ini
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama+nama); // ganti, awalnya -> this.nama = nama+nama;
    }

    @Override
    public String toString() {
        return "Tugas1.Manusia{" + "nama=" + nama + '}';
    }
}
