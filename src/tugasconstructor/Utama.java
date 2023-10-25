package tugasconstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utama {
    public static void main(String[] args) {
        tiket ticket = new tiket("Admin", 123);
        try {
            ticket.login();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

