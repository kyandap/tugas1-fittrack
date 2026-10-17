# Tugas 1 Praktikum PBO - Sistem Keanggotaan Gym FitTrack

## 👤 Identitas Praktikan
* **Nama:** Kyandaru Annisa Putri
* **NPM:** 250810701100059
* **Kelas Praktikum:** PBO A

---

## 📌 Deskripsi Singkat
Program ini dibuat untuk mensimulasikan sistem pendataan keanggotaan gym **FitTrack**. Sistem ini bertujuan untuk mengunduh dan mencatat data member secara digital agar meminimalkan kesalahan input data manual, seperti format nomor telepon atau pilihan jenis paket keanggotaan. Aplikasi ini berbasis Java dan berfokus pada validasi data yang ketat pada setiap atribut member.

---

## ✨ Fitur Utama
1. **Validasi Nama:** Memastikan nama member tidak kosong dan tidak hanya berisi spasi.
2. **Validasi Nomor Telepon:** Memastikan nomor telepon diawali angka `0` dan memiliki panjang minimal 10 digit.
3. **Validasi Paket Keanggotaan:** Membatasi pilihan paket hanya pada `Basic`, `Premium`, atau `VIP`.
4. **Keamanan Data Member:** Menjaga nilai lama atribut jika data baru yang diinput melanggar aturan validasi.
5. **Pencetakan Data Terstruktur:** Menampilkan seluruh daftar member dari array menggunakan perulangan `for` dan format `toString()` yang rapi.

---

## 🧠 Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan Konsep |
| :--- | :--- | :--- |
| **Encapsulation** | Class `Member` | Menyembunyikan atribut (`private`) dan hanya memberikan akses lewat *getter* & *setter* ber-validasi. |
| **Constructor Overloading** | Class `Member` | Menyediakan fleksibilitas pembuatan objek (dengan paket eksplisit atau menggunakan paket default). |
| **Method Overriding** | Method `toString()` | Mengubah representasi string default objek Java agar mencetak atribut yang rapi dan mudah dibaca. |
| **DRY (Don't Repeat Yourself)** | Constructor `Member` | Memanggil *setter* di dalam *constructor* untuk memusatkan logika validasi di satu tempat. |

---

## 📁 Struktur Project

```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
