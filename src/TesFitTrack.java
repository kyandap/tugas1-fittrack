public class TesFitTrack {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("     APLIKASI FITTRACK - PBO     ");
        System.out.println("----------------------------------c\n");

        System.out.println("[INFO] Pengujian 1: Objek Member Normal");
        Member member1 = new Member("Kyandaru Annisa Putri", "081234567890", "2026-10-26", "Gold");
        member1.tampilkanInfo();
        
        System.out.println("[INFO] Pengujian 2: Validasi Gagal (No Telp & Paket Kosong)");
        Member member2 = new Member("", "12345", "2026-10-27", "");
        member2.tampilkanInfo();

        System.out.println("[INFO] Pengujian 3: Constructor Overloading (Paket Default)");
        Member member3 = new Member("Putri Annisa", "089876543210", "2026-10-28");
        member3.tampilkanInfo();

        System.out.println("[INFO] Pengujian 4: Fitur Upgrade Paket");
        member3.upgradePaket("Platinum");
        System.out.println("\n-- Data Setelah Upgrade --");
        member3.tampilkanInfo();
        
        System.out.println("-----------------------------------------");
        System.out.println("       PENGUJIAN SELESAI & BERHASIL      ");
        System.out.println("-----------------------------------------");
        
    }
    
}