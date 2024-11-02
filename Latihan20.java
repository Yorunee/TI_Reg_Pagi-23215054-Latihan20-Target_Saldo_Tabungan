
package Pertemuan5;


public class Latihan20 {
    public static void main(String[] args) {
        double saldo = 3500000;
        double bunga = 0.08;
        double saldoTarget = 6000000;
        int bulan = 1;

        while (saldo < saldoTarget) {
            saldo += saldo * bunga;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldo);
            bulan++;
        }
    }
}
