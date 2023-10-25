package pertemuan_1;

public class contoh {
    //atribut = variabel
    // private/protected

    public String nama;

    public double ipk;


    //operasi / fungsi :
    //setter atau constructor = prosedur

    public void setNama(String n) {
        // Jika nama atribut pada class sama dengan nama atribut pada parameter setter/getter
        // maka, beri keyword this
        //this.nama = nama;
        nama = n;
    }

    public void setIpk(double i) {
        ipk = i;
    }

    //getter --> fungsi

    public double getNama() {
        return this.getNama();
    }
        public double getipk() {
            return this.ipk;
        }
    }

    //custom method --> fungsi fungsi lain selain getter