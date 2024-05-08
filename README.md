# Panduan Instalasi Proyek NetBeans

## Persyaratan Sistem

- **JDK15**
- **Apache NetBeans IDE 12.0**
- **MariaDB 10.4/MySQL 15.1**

## Panduan Pengaturan Cepat

### 1. Mengunduh Proyek

Anda dapat mengunduh proyek dengan dua metode berikut:

- **Metode SSH**:
    ```sh
    git clone git@github.com:presidenwashil/Crud2341902.git Crud2341902
    ```

- **Metode HTTPS**:
    ```sh
    git clone https://github.com/presidenwashil/Crud2341902.git Crud2341902
    ```

### 2. Membuka Proyek di NetBeans

Setelah mengatur konfigurasi, ikuti langkah-langkah berikut untuk membuka proyek di NetBeans IDE:

1. **Buka** NetBeans IDE.
2. Pilih **File** > **Open Project**.
3. Pilih direktori **Crud2341902** tempat proyek Anda disimpan.
4. Ikuti petunjuk untuk membuka proyek.

Setelah proyek terbuka, lakukan langkah-langkah berikut untuk mengonfigurasi pustaka:

1. Pada bagian **Project**, klik kanan pada **Libraries**.
2. Pilih **Add JAR/Folder**.
3. Masuk ke direktori `Crud2341902/dist/lib/`.
4. Tambahkan pustaka:
    - `mysql-connector-java-5.1.47.jar`
    - `swing-layout-1.0.4.jar`

Setelah semua langkah di atas selesai, Anda siap untuk mulai mengembangkan dan menjalankan proyek Anda.

--- 

Pastikan untuk mengikuti semua langkah dengan cermat. Jika Anda menemui masalah, periksa kembali persyaratan sistem dan konfigurasi proyek Anda.
