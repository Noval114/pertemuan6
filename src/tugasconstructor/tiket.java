package tugasconstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tiket {
        private String username;
        private int password;
        private boolean loggedIn;
        private String transaksiPesawat;
        private String transaksiHotel;

        public tiket(String username, int password) {
            this.username = username;
            this.password = password;
            this.loggedIn = false;
            this.transaksiPesawat = "";
            this.transaksiHotel = "";
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public void setPassword(int password) {
            this.password = password;
        }

        public int getPassword() {
            return password;
        }

        public boolean isLoggedIn() {
            return loggedIn;
        }

        public void login() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("--- SELAMAT DATANG DI TIKETKITA.COM ---");

            System.out.print("Masukkan username: ");
            String inputUsername = br.readLine();
            System.out.print("Masukkan password: ");
            int inputPassword = Integer.parseInt(br.readLine());

            if (inputUsername.equals(this.username) && inputPassword == this.password) {
                loggedIn = true;
                System.out.println("Login berhasil!");

                while (loggedIn) {
                    System.out.println("\nMenu:");
                    System.out.println("1. Input data transaksi");
                    System.out.println("2. Lihat data tiket");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih menu (1-3): ");
                    int pilihmenu = Integer.parseInt(br.readLine());

                    switch (pilihmenu) {
                        case 1:
                            System.out.println("Anda memilih menu: Input data transaksi");
                            inputTransaksi(br);
                            break;
                        case 2:
                            System.out.println("Anda memilih menu: Lihat data tiket");
                            lihatDataTiket();
                            break;
                        case 3:
                            System.out.println("Anda memilih menu: Keluar");
                            loggedIn = false;
                            break;
                        default:
                            System.out.println("Menu yang Anda pilih tidak valid!");
                            break;
                    }
                }
            } else {
                System.out.println("Username atau password yang Anda masukkan salah.");
            }
        }

        public void inputTransaksi(BufferedReader br) throws IOException {
            System.out.println("Pilih jenis transaksi:");
            System.out.println("1. Tiket Pesawat");
            System.out.println("2. Tiket Hotel");
            System.out.print("Pilih jenis transaksi (1-2): ");
            int jenisTransaksi = Integer.parseInt(br.readLine());

            switch (jenisTransaksi) {
                case 1:
                    inputTransaksiPesawat(br);
                    break;
                case 2:
                    inputTransaksiHotel(br);
                    break;
                default:
                    System.out.println("Jenis transaksi yang Anda pilih tidak valid!");
                    break;
            }
        }

        public void inputTransaksiPesawat(BufferedReader br) throws IOException {
            System.out.print("Masukkan nama pesawat: ");
            String namaPesawat = br.readLine();
            System.out.print("Masukkan jumlah penumpang: ");
            int jumlahPenumpang = Integer.parseInt(br.readLine());
            System.out.print("Masukkan harga tiket: ");
            double hargaTiket = Double.parseDouble(br.readLine());
            System.out.print("Masukkan tujuan: ");
            String tujuan = br.readLine();

            // Simpan data transaksi tiket pesawat
            transaksiPesawat = "Nama Pesawat: " + namaPesawat + ", Jumlah Penumpang: " + jumlahPenumpang
                    + ", Harga Tiket: " + hargaTiket + ", Tujuan: " + tujuan;

            System.out.println("Data transaksi tiket pesawat berhasil diinput.");
        }

        public void inputTransaksiHotel(BufferedReader br) throws IOException {
            System.out.print("Masukkan nama hotel: ");
            String namaHotel = br.readLine();
            System.out.print("Masukkan jumlah kamar: ");
            int jumlahKamar = Integer.parseInt(br.readLine());
            System.out.print("Masukkan harga per kamar: ");
            double hargaPerKamar = Double.parseDouble(br.readLine());

            // Simpan data transaksi tiket hotel
            transaksiHotel = "Nama Hotel: " + namaHotel + ", Jumlah Kamar: " + jumlahKamar
                    + ", Harga Per Kamar: " + hargaPerKamar;

            System.out.println("Data transaksi tiket hotel berhasil diinput.");
        }

        public void lihatDataTiket() {
            System.out.println("--- DATA TIKET ---");
            if (!transaksiPesawat.isEmpty()) {
                System.out.println("Transaksi Tiket Pesawat:");
                System.out.println(transaksiPesawat);
            } else {
                System.out.println("Belum ada data transaksi tiket pesawat.");
            }

            if (!transaksiHotel.isEmpty()) {
                System.out.println("Transaksi Tiket Hotel:");
                System.out.println(transaksiHotel);
            } else {
                System.out.println("Belum ada data transaksi tiket hotel.");
            }
        }

        public static void main(String[] args) throws IOException {
            tiket ticket = new tiket("Admin", 123);
            ticket.login();
        }
    }
