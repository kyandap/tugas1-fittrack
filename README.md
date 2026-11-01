# FitTrack – Tugas 1 Praktikum PBO
Nama: Kyandaru Annisa Putri
NPM: 250810701100059
Praktikum Pemrograman Berorientasi Objek A

**FitTrack** merupakan aplikasi manajemen member sederhana berbasis Java yang dikembangkan untuk memenuhi tugas Praktikum Pemrograman Berorientasi Objek (PBO).

## 📑 Daftar Isi

1. [Tentang Proyek](#-tentang-proyek)
2. [Fitur Utama](#-fitur-utama)
3. [Struktur Proyek](#-struktur-proyek)
4. [Penjelasan Kode dan Logika](#-penjelasan-kode-dan-logika)
5. [Cara Menjalankan Program](#-cara-menjalankan-program)
6. [Contoh Output Program](#-contoh-output-program)

## 📖 Tentang Proyek

FitTrack adalah program berbasis konsol yang menerapkan beberapa konsep fundamental Object-Oriented Programming (OOP) menggunakan bahasa Java, meliputi:

- **Encapsulation** untuk melindungi dan mengontrol akses terhadap atribut.
- **Constructor Overloading** untuk menyediakan beberapa cara dalam membuat objek.
- **Input Validation** untuk memastikan data yang dimasukkan sesuai dengan ketentuan.
- **Method Overriding** melalui implementasi method `toString()`.

Program ini juga menerapkan pemisahan antara *Class Model* (`Member.java`) dan *Class Driver/Testing* (`TesFitTrack.java`).

## ✨ Fitur Utama

### 1. Encapsulation dan Validasi Data
- Nama tidak boleh kosong atau bernilai `null`.
- Nomor telepon harus diawali angka `0` dan memiliki panjang minimal 10 digit.
- Jenis paket divalidasi dan menggunakan `Basic` sebagai nilai default apabila tidak diisi.

### 2. Constructor Overloading
Menyediakan dua cara untuk membuat objek member, yaitu menggunakan parameter lengkap atau tanpa menyertakan jenis paket.

### 3. Interactive Methods
Dilengkapi beberapa method untuk mengelola dan menampilkan informasi member:
- `tampilkanInfo()` – Menampilkan informasi member.
- `toString()` – Menghasilkan representasi objek dalam bentuk String.
- `upgradePaket()` – Mengubah jenis paket member.

### 4. Structured Console Output
Tampilan terminal dilengkapi header, label tahapan pengujian, pemisah informasi, dan footer agar hasil pengujian lebih mudah dibaca.

## 📂 Struktur Proyek

```text
FitTrack/
│
├── src/
│   ├── Member.java       
│   └── TesFitTrack.java  
└── README.md             
```

## ⚙️ Penjelasan Kode dan Logika

Berikut beberapa konsep dan logika yang diterapkan dalam program:

**1. Validasi Setter**

Setter digunakan untuk memvalidasi data sebelum disimpan ke dalam atribut. Apabila input tidak memenuhi ketentuan, program menampilkan pesan peringatan melalui konsol.

**2. Constructor Chaining (`this(...)`)**

Menggunakan konsep constructor overloading dengan memanggil constructor utama dari constructor alternatif melalui `this(...)`. Hal ini membantu mengurangi duplikasi kode.

**3. Skenario Pengujian (`TesFitTrack`)**

Pengujian program dibagi menjadi empat tahapan utama:

- **Pengujian 1:** Membuat dan menampilkan objek member dengan data normal.
- **Pengujian 2:** Menguji validasi gagal, seperti nama kosong, nomor telepon tidak valid, dan jenis paket kosong.
- **Pengujian 3:** Menguji constructor overloading dengan jenis paket default.
- **Pengujian 4:** Menguji fitur peningkatan paket member menggunakan method `upgradePaket()`.

## 🚀 Cara Menjalankan Program

### Prasyarat

Pastikan komputer telah memiliki **Java Development Kit (JDK)** yang terinstal.

### Langkah-Langkah

**1. Buka terminal atau Command Prompt**, kemudian masuk ke direktori `src`:

```bash
cd path/to/FitTrack/src
```

**2. Kompilasi seluruh file Java:**

```bash
javac Member.java TesFitTrack.java
```

**3. Jalankan program:**

```bash
java TesFitTrack
```

## 🖥️ Contoh Output Program

Berikut merupakan contoh hasil eksekusi program FitTrack melalui terminal:

```text
-----------------------------------------
       APLIKASI FITTRACK - PBO
-----------------------------------------

[INFO] Pengujian 1: Objek Member Normal
Nama         : Kyandaru Annisa Putri
No Telepon   : 081234567890
Tanggal      : 2026-10-26
Jenis Paket  : Gold
-----------------------------------
[INFO] Pengujian 2: Validasi Gagal (No Telp & Paket Kosong)
[ERROR] Nama tidak boleh kosong!
[ERROR] No Telepon harus diawali angka '0' dan minimal 10 digit!
[ERROR] Jenis paket tidak boleh kosong! Diset ke default: Basic
Nama         : null
No Telepon   : null
Tanggal      : 2026-10-27
Jenis Paket  : Basic
-----------------------------------
[INFO] Pengujian 3: Constructor Overloading (Paket Default)
Nama         : Putri Annisa
No Telepon   : 089876543210
Tanggal      : 2026-10-28
Jenis Paket  : Basic
-----------------------------------
[INFO] Pengujian 4: Fitur Upgrade Paket
Paket Siti Aminah berhasil diubah menjadi: Platinum

-- Data Setelah Upgrade --
Nama         : Siti Aminah
No Telepon   : 089876543210
Tanggal      : 2026-10-28
Jenis Paket  : Platinum
-----------------------------------
-----------------------------------------
       PENGUJIAN SELESAI & BERHASIL
-----------------------------------------
```