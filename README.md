# QuestTugasLayout_0154

Aplikasi Android sederhana untuk menampilkan informasi kontak mahasiswa menggunakan **Kotlin** dan **Jetpack Compose**.

## 📱 Tampilan Aplikasi

Berikut adalah tampilan aplikasi QuestTugasLayout yang dijalankan melalui Android Emulator.

<img width="200" height="426" alt="Screenshot 2026-10-11 013932" src="https://github.com/user-attachments/assets/87ee125b-d53f-4036-9461-6d63bb713d8b" />


## ✨ Fitur Aplikasi

- Menampilkan judul **Teknologi Informasi** dan nama Universitas Muhammadiyah Yogyakarta.
- Menampilkan empat kartu kontak mahasiswa.
- Menampilkan nama, nomor telepon, dan alamat setiap mahasiswa.
- Menggunakan warna berbeda pada setiap kartu kontak.
- Menampilkan logo Universitas Muhammadiyah Yogyakarta di sisi kiri dan kanan setiap kartu.
- Menampilkan nama kontak Nur dengan font tulisan sambung.
- Menampilkan copyright pada bagian bawah layar.

## 🛠️ Teknologi yang Digunakan

- **Kotlin** — bahasa pemrograman aplikasi.
- **Jetpack Compose** — membangun antarmuka pengguna secara deklaratif.
- **Material 3** — komponen dan tema antarmuka.
- **Android Studio** — lingkungan pengembangan aplikasi.
- **XML Resources** — menyimpan teks, warna, dimensi, dan tema aplikasi.

## 📂 Struktur Project

```text
QuestTugasLayout_0154/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/questtugaslayout/
│           │       ├── MainActivity.kt
│           │       ├── data/
│           │       │   └── Contact.kt
│           │       └── ui/
│           │           ├── ContactScreen.kt
│           │           ├── components/
│           │           │   └── ContactCard.kt
│           │           └── theme/
│           │               ├── Color.kt
│           │               ├── Theme.kt
│           │               └── Type.kt
│           └── res/
│               ├── drawable/
│               │   ├── ic_launcher_background.xml
│               │   ├── ic_launcher_foreground.xml
│               │   └── logo_umy.webp
│               ├── mipmap/
│               ├── values/
│               │   ├── colors.xml
│               │   ├── dimens.xml
│               │   ├── strings.xml
│               │   └── themes.xml
│               └── xml/
│                   ├── backup_rules.xml
│                   └── data_extraction_rules.xml
└── README.md
```

