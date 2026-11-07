import java.util.Scanner;

public class Tugas1PengelolaanNilaiMhs_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        System.out.println("    --- INPUT DATA NILAI ---    ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double rata2 = (double) total / nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("=================================");
        System.out.println("  REKAPITULASI STATUS KELULUSAN  ");
        System.out.println("=================================");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i] + " (" + status + ")");
        }

        System.out.println("---------------------------------");
        System.out.println("Total Nilai Keseluruhan : " + total);
        System.out.println("Nilai Rata-rata Kelas   : " + rata2);
        System.out.println("Nilai Tertinggi         : " + tertinggi);
        System.out.println("Nilai Terendah          : " + terendah);
        System.out.println("=================================");

        input.close();
    }
}