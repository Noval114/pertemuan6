package pertemuan5;

public class subclass extends superclass{
    int usia;

    public subclass(String nama, String keterangan, int usia) {
        super(nama, keterangan);
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getKeterangan() {
        return super.getKeterangan();
    }
}
