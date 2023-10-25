package pertemuan_1;

//tahapan i/o:
/*
1. input i/o (Scanner --> data primitif (char, int, double)/bufferedreader)
2. eror handling
3. objek dari libary i/o
 */

import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tes {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        contoh c = new contoh();

        // error handling
        try {
            // blok kode dengan asumsi benar
            // input
            System.out.println("Nama : ");
            c.setNama(br.readLine());

            // int --> c.setPIK(Integer.parseInt(br.readLine))
            // double --> c.setIPK (Double.parseDouble(br.readLine))
            
            // output
            System.out.println(c.getNama());
            c.getipk(); // kalau didalam methodnya sudah ada println
        } catch (Exception exc) {
            // blok kode untuk menjalankan inforasi kesalahan dari blok try
            System.out.println(exc.getMessage());
        }
    }
}