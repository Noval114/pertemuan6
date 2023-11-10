package pertemuan6;

import pertemuan6.laundry;
import pertemuan6.Transaksi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassLaundry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
    }

    laundry master = new laundry("", "", 0);
    Transaksi trans = new Transaksi("", "", 0, "", "", "", "", 0);
    //deklarasi variabel
    String Jenis, nama, kode, metode, tanggalcuci, tanggalambil;
    int harga, berat;

    //looping

    do

    {
        System.out.println("laundry saja");
        System.out.println("1. Menu Master");
        System.out.println("2. Menu Transaksi");
        System.out.println("3. Menu cari data");
        System.out.println("4. Menu keluar");
        System.out.println("masukkan pilihan menu : ");
        int menu = Integer.parseInt(br.readline());
        switch (menu) {
            case 1:
                System.out.println("1. Menu Master");
                //INPUT --> class laundry
                System.out.println("entri jenis laundry ");
                Jenis = br.readline();
                System.out.println("entri harga : ");
                harga = Integer.parseInt(br.readline());
                System.out.println("Entri metode");
                metode = br.readline();
                master new laundry(Jenis, metode, harga);
                System.out.println();

            case 2:
                System.out.println("2. Menu Transaksi");
                System.out.println("Entri kode: ");
                kode = br.readLine();
                System.out.println("Entri nama: ");
                nama = br.readLine();
                System.out.println("Entri jenis cuci \n Cuci Setrika/Cuci Kering: ");
                Jenis = br.readLine();
                System.out.println("Entri metode (reguler/express): ");
                metode = br.readLine();
                System.out.println("Entri berat: ");
                berat = Integer.parseInt(br.readLine());
                System.out.println("Entri tanggal cuci: ");
                tanggalcuci = br.readLine();
                System.out.println("Entri tanggal ambil: ");
                tanggalambil = br.readLine();
                trans = new Transaksi(Jenis, metode, master.getHarga(), kode, nama, tanggalcuci, tanggalambil, berat);
                break;
            case 3:
                System.out.println("---3. Menu Cari Data---");
                System.out.println("Entri kode transaksi yang dicari : ");
                kode = br.readLine();

                // Cek apakah transaksi sudah dilakukan
                if (trans.getKode() != null && kode.equalsIgnoreCase(trans.getKode())) {
                    trans.Transaksi();
                } else {
                    System.out.println("Data tidak ada");
                }
                break;
            default:
                System.exit(0);
        }
    } while(true);

}

