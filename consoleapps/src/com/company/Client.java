package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {


    public static void main(String args[]) {
        try {
            Socket socket = new Socket("127.0.0.1", 6670);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(inputStreamReader);
            String oku = br.readLine();
            System.out.println(oku);
            br.close();
            inputStreamReader.close();
            inputStreamReader.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

