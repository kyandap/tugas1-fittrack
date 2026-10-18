public class Member {
    // Atribut privat
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    // Konstanta validasi
    private static final int MIN_PANJANG_TELP = 10;
    private static final String AWALAN_TELP = "0";
    private static final String PAKET_DEFAULT = "Basic";

    // Constructor Parameter
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    // Setter untuk Nama (tidak boleh kosong)
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            this.nama = "Unknown";
        }
    }

    // Setter untuk No Telepon (harus diawali "0" dan minimal 10 digit)
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null && noTelepon.startsWith(AWALAN_TELP) && noTelepon.length() >= MIN_PANJANG_TELP) {
            this.noTelepon = noTelepon;
        } else {
            this.noTelepon = "0000000000"; // Default jika tidak valid
        }
    }

    // Setter untuk Tanggal Daftar
    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    // Setter untuk Jenis Paket (jika kosong/null, gunakan paket default)
    public void setJenisPaket(String jenisPaket) {
        if (jenisPaket != null && !jenisPaket.trim().isEmpty()) {
            this.jenisPaket = jenisPaket;
        } else {
            this.jenisPaket = PAKET_DEFAULT;
        }
    }
}

