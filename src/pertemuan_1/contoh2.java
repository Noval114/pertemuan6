package pertemuan_1;

public class contoh2 {
    // membuat program untuk menghitung nilai akhir dari MK PBO per mahasiswa
    // NILAI AKHIR = (uts * 20%) + (uas * 25%) + (tugas * 55%)

    //atribut
    /*
    NIM : 0111
    nama : Jodi
    Prodi : SI
    MK : PBO
    NA : 88
     */

        public String nim,nama,prodi,MK;

        public double NA, uts, uas,tugas;


    // operasi / fungsi :

    //Setter atau constructor = prosedur
    public void setNim(String nim){
        // jika nama atribut pada class sama dengan nama atribut pada parameter setter / getter
        // maka, berikan keyword this
        //this.nim = nim;
        this.nim = nim;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setProdi(String Prodi){
        this.prodi = prodi;
    }
    public void setMK (String MK){
        this.MK = MK;
    }

    public void setUts(double uts ){
        this.uts= uts;
    }

    public void setUas (double uas){
        this.uas= uas;
    }

    public void setTugas (double t){
        tugas= t;
    }
    //getter
    public String getNim(){
        return this.getNim();
    }
    public String getNama(){
        return this.getNama();
    }
    public String getProdi(){
        return this.getProdi();
    }
    public String getMK(){
        return this.getMK();
    }

    public double getUts() {
        return this.uts;
    }
    public double getUas(){
        return this.uas;
    }
    public double getTugas(){
        return this.tugas;
    }

    //custom method
    public double getNA(){
        NA = (getUts()*0.2) + (getUas()*0.25) + (getTugas()*0.55);

        // tipe data int --> NA = (getUTS()*20/100)
        return NA;
    }

    // untuk cetak nim + NA
    public void cetakData(){
        System.out.println("NIM : " + getNim() + "\n" + "NA : " + getNA());

        //"\n" untuk enter
    }
}
