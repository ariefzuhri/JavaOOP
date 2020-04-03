package master;

public class Matematika {
    // static agar dapat diakses dari class lain tanpa harus membuat object terlebih dahulu
    // final agar nilai dari variable tidak dapat diubah
    public static final double phi = 22.0/7;

    public static double getMiring(double a, double b){
        double miring = a*a + b*b;
        return Math.sqrt(miring);
    }

    public static double getLurus(double miring, double a){
        double b = miring*miring - a*a;
        return Math.sqrt(b);
    }
}
