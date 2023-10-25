package pertemuan5;

public class person {
    // atribut

    private String nama, alamat;

    //constructor

    public person (String n, String a){
    nama = n;
    alamat = a;
    }

    //getter
    //cara cepat = alt + insert


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
