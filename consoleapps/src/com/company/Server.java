package com.company;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) {
        try {
            ServerSocket serverSocket = new ServerSocket(6670);
            Socket socket = serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter(outputStream);
            osr.write("okan-sungur");
            osr.flush();
            outputStream.close();
            outputStream.close();
            socket.close();
        } catch (Exception ex) {
        }
    }
}
