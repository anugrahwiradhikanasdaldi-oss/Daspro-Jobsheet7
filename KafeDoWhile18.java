import java.util.Scanner;
public class KafeDoWhile18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi = 12000, teh = 7000, roti= 20000, total_harga;
        String nama_pelanggan;
        do {
            System.out.println("=== KAFE SEDERHANA ===");
            System.out.println("masukan nama  pelanggan (ketik'batal'untuk keluar):");
            nama_pelanggan = sc.nextLine();
            if (nama_pelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Terima kasih 'transaksi di batalkan'!");
                break;
            }
            System.out.println("jumlah kopi:");
            kopi = sc.nextInt();
            System.out.println("jumlah teh:");          
            teh = sc.nextInt();
            System.out.println("jumlah roti:");
            roti = sc.nextInt();
            total_harga = (kopi*12000 + teh*7000 + roti*20000);
            System.out.println("Total harga untuk " + nama_pelanggan + " adalah: Rp " + total_harga);
            sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai.");

        sc.close();    
    }
}