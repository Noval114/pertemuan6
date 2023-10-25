package pertemuan5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainclassSuper {
    public mainclassSuper() {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        subclass subclass = new subclass("","",0);

        System.out.println("--- INPUT ---");
        System.out.print("Masukkan nama : ");
        String nama = br.readLine();
        System.out.println("Masukkan keterangan : ");
        String keterangan = br.readLine();
        System.out.print("Masukkan Usia : ");
        int usia = Integer.parseInt(br.readLine());

        //masukkan data ke object constructor

        subclass = new subclass(nama,keterangan,usia);

        System.out.println("Nama : " + subclass.getNama());
        System.out.println("Keterangan : " + subclass.getKeterangan());
        System.out.println("usia : " + subclass.getUsia());

    }
}
