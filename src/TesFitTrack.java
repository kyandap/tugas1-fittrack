public class TesFitTrack {
    public static void main(String[] args) {
        System.out.println("=== UJI COBA FITTRACK ===");

        System.out.println("[1] Member Normal:");
        Member member1 = new Member("Budi Santoso", "081234567890", "2026-10-26", "Gold");
        member1.tampilkanInfo();

        System.out.println("[2] Member Validasi Gagal (No Telp Salah & Paket Kosong):");
        Member member2 = new Member("", "12345", "2026-10-27", "");
        member2.tampilkanInfo();

        System.out.println("[3] Member Constructor Overloading (Paket Default):");
        Member member3 = new Member("Siti Aminah", "089876543210", "2026-10-28");
        member3.tampilkanInfo();

        System.out.println("[4] Uji Upgrade Paket:");
        member3.upgradePaket("Platinum");
        member3.tampilkanInfo();
        
    }
    
}