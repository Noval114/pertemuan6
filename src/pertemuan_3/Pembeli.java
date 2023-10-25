package pertemuan_3;

public class Pembeli {
    //atribut
    /* member :
        nama, umur, no telp, alamat
        dapat poin setiap :
        min belanja 50rb --> poin 10
        min belanja 100rb --> poin 20
     */

    /*
    non member :
    nama barang, jumlah barang, total --> struk
     */

    private String namaPembeli, alamat, namabarang, notelp;

    private int usia, jumlah, total, harga,  poin;

    //constructor
    //cons member
    public Pembeli(String nama, String alamat, int usia, String telp) {
        namaPembeli = nama;
        this.alamat = alamat;
        this.usia = usia;
        notelp = telp;
    }

    //cons non member == transaksi
    public Pembeli(String namabarang, int jmlh, int harga) {
        this.namabarang = namabarang;
        jumlah = jmlh;
        this.harga = harga;

    }


    //method
    // getter
    public String getNamaPembeli() {
        return this.namaPembeli;

    }
    public String getNamabarang(){
        return this.namabarang;
    }
    public String getAlamat (){
        return this.alamat;
    }
    public String getNotelp(){
        return this.notelp;
    }
    public int getUsia(){
        return this.usia;
    }
   public int getJumlah(){
        return this.jumlah;
   }

   public int getHarga(){
        return this.harga;

   }

   // method tambahan
    /*  dapat poin setiap :
        min belanja 50rb --> poin 10
        min belanja 100rb --> poin 20
     */

    public int getMemberPoin(){
        poin = 0;
        if (getTotal() >= 50000) {
            poin = 10;
        } else if (getTotal() >= 100000) {
            poin = 20;
        }
        return poin;
    }

    public int getTotal() {
        return getHarga() * getJumlah();
    }
}
