package pertemuan6;

public class laundry {
    private String JenisCuci, Metode;
    private int harga;

    //constructor

    public laundry (String JenisCuci, String metode, int harga) {
        this.JenisCuci = JenisCuci;
        this.Metode = Metode;
        this.harga = harga;

    }

    //getter
    public String getJenisCuci (){
        return JenisCuci;
    }

    public String getMetode (){
        return Metode;
    }
    public int getHarga (){
        return harga;
    }

    // metode tambahan --> overriding
    public int CuciExpress(){
        //set harga express 5000
        return 5000;
    }
}

