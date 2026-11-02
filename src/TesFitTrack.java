/**
 * Class pengujian (driver) untuk menjalankan simulasi program FitTrack.
 * Class ini menguji berbagai skenario seperti pembuatan objek normal,
 * validasi input, constructor overloading, dan fitur upgrade paket.
 */
public class TesFitTrack {

    /**
     * Method utama untuk menjalankan eksekusi program dan skenario pengujian.
     * 
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       APLIKASI FITTRACK - PBO           ");
        System.out.println("=========================================\n");

        System.out.println("[INFO] Pengujian 1: Objek Member Normal");
        Member member1 = new Member("Budi Santoso", "081234567890", "2026-10-26", "Gold");
        member1.tampilkanInfo();
        
        System.out.println("[INFO] Pengujian 2: Validasi Gagal (No Telp & Paket Kosong)");
        Member member2 = new Member("", "12345", "2026-10-27", "");
        member2.tampilkanInfo();

        System.out.println("[INFO] Pengujian 3: Constructor Overloading (Paket Default)");
        Member member3 = new Member("Siti Aminah", "089876543210", "2026-10-28");
        member3.tampilkanInfo();

        System.out.println("[INFO] Pengujian 4: Fitur Upgrade Paket");
        member3.upgradePaket("Platinum");
        System.out.println("\n-- Data Setelah Upgrade --");
        member3.tampilkanInfo();
        
        System.out.println("=========================================");
        System.out.println("       PENGUJIAN SELESAI & BERHASIL      ");
        System.out.println("=========================================");
    }
}