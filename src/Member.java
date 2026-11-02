/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {
    // Konstanta untuk menghindari magic number dan magic string
    private static final int MIN_PHONE_LENGTH = 10;
    private static final char REQUIRED_PHONE_PREFIX = '0';
    private static final String DEFAULT_PACKAGE = "Basic";

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Constructor utama untuk menginisialisasi member dengan data lengkap.
     * 
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon member (diawali '0', minimal 10 digit)
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket    jenis paket langganan member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Constructor overloading untuk member dengan paket default (Basic).
     * 
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, DEFAULT_PACKAGE);
    }

    /**
     * Mengembalikan nama member.
     * 
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama member setelah divalidasi tidak boleh kosong.
     * 
     * @param nama nama baru member
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("[ERROR] Nama tidak boleh kosong!");
            return;
        }
        this.nama = nama;
    }

    /**
     * Mengembalikan nomor telepon member.
     * 
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon member setelah melalui validasi format.
     * Jika format tidak valid, nomor lama dipertahankan dan pesan penolakan dicetak.
     * 
     * @param noTelepon nomor telepon baru, wajib diawali angka '0' dan minimal 10 digit
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null || noTelepon.length() < MIN_PHONE_LENGTH || noTelepon.charAt(0) != REQUIRED_PHONE_PREFIX) {
            System.out.println("[ERROR] No Telepon harus diawali angka '0' dan minimal " + MIN_PHONE_LENGTH + " digit!");
            return;
        }
        this.noTelepon = noTelepon;
    }

    /**
     * Mengembalikan tanggal pendaftaran member.
     * 
     * @return tanggal pendaftaran
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengatur tanggal pendaftaran member.
     * 
     * @param tanggalDaftar tanggal pendaftaran baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    /**
     * Mengembalikan jenis paket member.
     * 
     * @return jenis paket
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengatur jenis paket member dengan validasi tidak boleh kosong.
     * 
     * @ jenisPaket jenis paket baru
     */
    public void setJenisPaket(String jenisPaket) {
        if (jenisPaket == null || jenisPaket.trim().isEmpty()) {
            System.out.println("[ERROR] Jenis paket tidak boleh kosong! Diset ke default: " + DEFAULT_PACKAGE);
            this.jenisPaket = DEFAULT_PACKAGE;
            return;
        }
        this.jenisPaket = jenisPaket;
    }

    /**
     * Menampilkan informasi lengkap member ke konsol.
     */
    public void tampilkanInfo() {
        System.out.println("Nama         : " + this.nama);
        System.out.println("No Telepon   : " + this.noTelepon);
        System.out.println("Tanggal      : " + this.tanggalDaftar);
        System.out.println("Jenis Paket  : " + this.jenisPaket);
        System.out.println("-----------------------------------");
    }

    /**
     * Simulasi peningkatan paket member ke paket baru.
     * 
     * @param paketBaru nama paket tujuan upgrade
     */
    public void upgradePaket(String paketBaru) {
        setJenisPaket(paketBaru);
        System.out.println("Paket " + this.nama + " berhasil diubah menjadi: " + this.jenisPaket);
    }

    /**
     * Mengembalikan representasi String dari objek Member.
     * 
     * @return string berisi informasi ringkas member
     */
    @Override
    public String toString() {
        return "Member{" + "nama='" + nama + '\'' + ", jenisPaket='" + jenisPaket + '\'' + '}';
    }
}