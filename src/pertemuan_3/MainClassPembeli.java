package pertemuan_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClassPembeli {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        1. pendaftaran member
        2. transaksi pembelian barang
            -punya member atau tidak
            -jika membe(telp), cek nomor telpon sama / tidak dengan yang sudah didaftarkan, dapat poin.
            -jika tidak member, hanya proses transaksi biasa (tanpa inputan)

         */

        Pembeli member = new Pembeli("","",0,"");

        Pembeli transaksi = new Pembeli("", 0, 0);

        // - const = perlu deklarasi ulang variabel
        String namabarang, namaPembeli, alamat,notelp;
        int usia, jumlah, harga;
        try {
            do{
                System.out.println("---- MARET APRIL ----");
                System.out.println("1. Pendaftaran ");
                System.out.println("2. Transaksi ");
                System.out.println("3. Keluar Aplikasi");
                System.out.println("4. Pilih Menu : ");
                int menu = Integer.parseInt(br.readLine());
                switch (menu){
                    case 1:
                        // pendaftaran member
                        System.out.print("---- Daftar Member ---- ");
                        System.out.print("Nama : ");
                        namaPembeli = br.readLine();
                        System.out.print("Alamat : ");
                        alamat = br.readLine();
                        System.out.print("No. telpon : ");
                        notelp = br.readLine();
                        System.out.print("Usia : ");
                        usia = Integer.parseInt(br.readLine());

                        member = new Pembeli(namaPembeli, alamat, usia, notelp);
                        break;
                    case 2:
                        // transaksi
                        System.out.print("---- Transaksi ----");
                        System.out.print("Nama barang : ");
                        namabarang = br.readLine();
                        System.out.print("Harga barang : ");
                        harga = Integer.parseInt(br.readLine());
                        System.out.print("Jumlah beli : ");
                        jumlah = Integer.parseInt(br.readLine());

                        //data disimpan ke dalam constructor
                        transaksi = new Pembeli(namabarang,jumlah, harga);
                        System.out.println("total belanja : " + transaksi.getTotal());

                        System.out.print("Member? (Y/N): ");
                        String jawab = br.readLine();
                       if(jawab.equalsIgnoreCase("Y")){
                           System.out.print("Masukkan No. telp ");
                           notelp = br.readLine();
                           //cek no telpon sama dengan yang didaftarkan atau tidak

                           if(notelp.equalsIgnoreCase(member.getNotelp())){

                               System.out.println(" no. telpon yang didaftarkan : " + member.getNotelp());
                               System.out.println("Poin Anda Adalah: "+ transaksi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .getMemberPoin());
                           }else {
                               System.out.println("Mohon maaf, no telpom tidak terdaftar");
                           }


                       }else {

                           // non member transaksi
                           System.out.print("Terimakasih");

                       }
                        break;
                    default:
                    //keluar program
                    System.exit(0);
                }
            }while (true);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
