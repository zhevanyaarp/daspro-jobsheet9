import java.util.Scanner;

public class Tugas2Kafekampus_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== SELAMAT DATANG DI KAFE KAMPUS ===");
        
        System.out.println("Daftar Menu Kafe:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("----------------------------------------");

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cariMenu = input.nextLine();
        
        boolean ditemukanMenu = false;
        int indeksKetemu = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukanMenu = true;
                indeksKetemu = i;
                break;
            }
        }

        if (ditemukanMenu) {
            System.out.println("--> Menu " + menu[indeksKetemu] + " tersedia dengan harga Rp " + harga[indeksKetemu]);
        } else {
            System.out.println("--> Maaf, menu yang Anda cari tidak tersedia.");
        }
        System.out.println("----------------------------------------");

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesan = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        String[] pesananNama = new String[jumlahPesan];
        int[] pesananHarga = new int[jumlahPesan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                String namaPesananInput = input.nextLine();

                int posisiMenu = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesananInput)) {
                        posisiMenu = j;
                        break;
                    }
                }

                if (posisiMenu != -1) {
                    pesananNama[i] = menu[posisiMenu];
                    pesananHarga[i] = harga[posisiMenu];
                    totalBiaya += harga[posisiMenu];
                    valid = true;
                } else {
                    System.out.println("[!] Menu tidak ada dalam daftar. Silakan masukkan ulang dengan benar.");
                }
            }
        }

        System.out.println("========================================");
        System.out.println("          STRUK PESANAN KAFE            ");
        System.out.println("========================================");
        for (int i = 0; i < pesananNama.length; i++) {
            System.out.println((i + 1) + ". " + pesananNama[i] + ": Rp " + pesananHarga[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL BIAYA KESELURUHAN : Rp " + totalBiaya);
        System.out.println("========================================");
        System.out.println("Terima kasih telah memesan di Kafe Kampus!");

        input.close();
    }
}