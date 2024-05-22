# Tampilan Program
![Tampilan Program](screenshot/UAP_2341902)

# Panduan Instalasi Proyek NetBeans

## Persyaratan Sistem

- **JDK15**
- **Apache NetBeans IDE 12.0**
- **MariaDB 10.4/MySQL 15.1**
- **XAMPP v3.2.4 (dengan Apache dan MySQL)**

## Panduan Pengaturan Cepat

### 1. Mengunduh Proyek

Unduh proyek dengan metode berikut:

- **Metode SSH**:
    ```sh
    git clone git@github.com:presidenwashil/Crud2341902.git Crud2341902
    ```

- **Metode HTTPS**:
    ```sh
    git clone https://github.com/presidenwashil/Crud2341902.git Crud2341902
    ```

### 2. Mengonfigurasi Basis Data

Sebelum menjalankan proyek, konfigurasikan basis data sebagai berikut:

**Menggunakan XAMPP**:
- Jalankan **Apache** dan **MySQL** di XAMPP.
- Buka **browser** dan akses `localhost/phpmyadmin`.
- Buat **basis data baru** dengan nama `crud2341902`.
- **Impor** file `crud2341902.sql` dari direktori proyek:
    - Masuk ke direktori `Crud2341902/`.
    - Temukan file `crud2341902.sql`.
    - Impor file tersebut ke basis data baru yang telah Anda buat di phpMyAdmin.

### 3. Membuka Proyek di NetBeans

Setelah mengatur konfigurasi, ikuti langkah-langkah ini untuk membuka proyek di NetBeans IDE:

1. **Buka NetBeans IDE**.
2. Pilih **File** > **Open Project**.
3. Pilih direktori **Crud2341902** tempat proyek Anda disimpan.
4. Ikuti petunjuk untuk membuka proyek.

Setelah proyek terbuka, lakukan konfigurasi pustaka:

1. Di bagian **Project**, klik kanan pada **Libraries**.
2. Pilih **Add JAR/Folder**.
3. Masuk ke direktori `Crud2341902/dist/lib/`.
4. Tambahkan pustaka berikut:
    - `mysql-connector-java-5.1.47.jar`
    - `swing-layout-1.0.4.jar`

Setelah langkah-langkah di atas selesai, Anda siap untuk mulai mengembangkan dan menjalankan proyek.

---

Pastikan untuk mengikuti panduan ini dengan cermat untuk memastikan instalasi yang sukses. Jika Anda menghadapi kendala, pastikan persyaratan sistem dan konfigurasi proyek sudah benar.
