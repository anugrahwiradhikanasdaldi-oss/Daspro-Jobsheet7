import java.util.Scanner;   
public class PembelianTiket18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket = 50000, total_harga;
        String nama_pembeli;
        do {
        System.out.println("=== PEMBELIAN TIKET BIOSKOP ===");
        System.out.print("Masukkan nama pembeli (ketik 'keluar' untuk berhenti): ");
        nama_pembeli = sc.nextLine();
        if (nama_pembeli.equalsIgnoreCase("keluar")) {
            System.out.println("Terima kasih! Pembelian tiket selesai.");
            break;
        }
        System.out.print("Jumlah tiket: ");
        int jumlah_tiket = sc.nextInt();
        if (jumlah_tiket>=4) {
        System.out.println("diskon yang anda dapatkan 10%");
        if (jumlah_tiket>= 10) {
            System.out.println("diskon yang anda dapatkan 15%");
        }
        } else {
            System.out.println("anda tidak mendapatkan diskon");
        } 
    } while (true);

        sc.close();
    }
}
