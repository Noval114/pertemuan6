package pertemuan6;

import pertemuan6.laundry;

public class Transaksi extends laundry{
    private String kode, namaPelanggan, tanggalcuci, tanggalambil;
    private static final int BIAYA_EXPRESS = 5000;
    private int berat;
    public Transaksi(String JenisCuci, String Metode, int harga, String kode, String namaPelanggan, String tanggalcuci, String tanggalambil, int berat){
        super (JenisCuci, Metode,harga);
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.berat = berat;

    }
    public String getKode(){
        return kode;
    }
    public String getNamaPelanggan (){
        return namaPelanggan;
    }
    public String getTanggalcuci(){
        return tanggalcuci;
    }
    public String getTanggalambil(){
        return tanggalambil;
    }
    public int getBerat(){
        return berat;
    }
    //method tambahan --> getTotal, overloading method
    public int gettotal(){
        //menghitung subtotal jasa cuci
        //ditambah super untuk kasih tau ambilnya di class laundry
        return getBerat() * super.getHarga();
    }
    //overloading --> metode statis
    //searching data --> mengetahui kode transaksi

    public void Transaksi (){
        System.out.println("Nama Pelanggan :" + getNamaPelanggan());
        System.out.println("jenis cuci :" + getJenisCuci());
        System.out.println("Metode (reguler/Express): " + getMetode();
        System.out.println("Harga jasa : " + getHarga());
        System.out.println("Tanggal cuci : " + getTanggalcuci());
        System.out.println("Tanggal ambil : " + getTanggalambil());
        System.out.println("berat cucian : " + getBerat());
        System.out.println("sub total : " + gettotal()); // subtotal (harga*berat)
        System.out.println("total : " + CuciExpress()); // tambah jasa express
    }
    //overloading --> metode dinamis
    @Override
    public int CuciExpress(){
        int total = gettotal();
        if (getMetode().equalsIgnoreCase("express")){
            total+= BIAYA_EXPRESS;
        }
        return total;
    }

}
