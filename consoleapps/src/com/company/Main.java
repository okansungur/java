package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.util.Vector;

public class Main {

    public static void fileOutputStream() throws IOException {
        String text = "African World";
        byte bArray[] = text.getBytes();
        FileOutputStream fileOutputStream = new FileOutputStream("sample2.txt");
        fileOutputStream.write(bArray);
        fileOutputStream.close();
    }

    public static void byteArrayInputStream() {
        String string = "My data";
        byte stringBytes[] = string.getBytes();
        ByteArrayInputStream obj = new ByteArrayInputStream(stringBytes);
        for (int i = 0; i < stringBytes.length; i++) {
            int c = obj.read();
            System.out.print((char) c);
        }
        obj.reset();

    }

    public static void byteArrayOutputStream() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String var = "hello everybody";
        byte buf[] = var.getBytes();
        byteArrayOutputStream.write(buf);
        System.out.println("Result : " + byteArrayOutputStream.toString());
    }

    public static void inputStreamReader() throws IOException {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferStream = new BufferedReader(inputReader);
        String readString;
        do {
            System.out.println("\n Enter .....:");
            readString = bufferStream.readLine();
            System.out.println("\n is.........:" + readString);
        }
        while (readString.length() != 0);
    }

    public static void fileReaderWriter() throws IOException {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.close();
    }

    public static void fileInputStream() throws IOException {
        /*
         FileInputStream finStream = new FileInputStream("sample1.txt");
        int n = finStream.available();
        for (int i = 0; i < n; i++) {
            System.out.print((char) finStream.read());
        }
        finStream.close();
         */
        String data = "";
        FileInputStream fileInputStream = new FileInputStream("oku.txt");
        while (fileInputStream.available() > 0) {
            data += String.valueOf((char) fileInputStream.read());
        }
        System.out.println(data);
    }

    public static void randomAccessFile() {
        RandomAccessFile raf1, raf2;
        File file1;
        try {
            file1 = new File("sample.txt");

            raf2 = new RandomAccessFile(file1, "rw");
            String someData = "Africa";
            byte data[] = someData.getBytes();
            raf2.write(data);
            raf2.close();

            raf1 = new RandomAccessFile(file1, "r");
            String readData = "";
            while (raf1.getFilePointer() < raf1.length()) {
                readData += raf1.readLine() + "\n";
            }
            raf1.close();
            System.out.println(readData);

            /*
            if(file.length()>0)
    		raf.seek(file.length());
			//raf.setLength(0);
			raf.write(somedata);
            */
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {

        }

    }

    public static void robot() {
        BufferedImage bufferedImage;
        try {
            Robot robot = new Robot();
            int x = 100;
            int y = 100;
            int width = 200;
            int height = 200;
            Rectangle area = new Rectangle(x, y, width, height);
            bufferedImage = robot.createScreenCapture(area);
            area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            bufferedImage = robot.createScreenCapture(area);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sql() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String dsnless = "jdbc:odbc:Driver={SQL Server};" + "Server=localhost;Database=Master;UID=sa;PWD=sa";
            connection = DriverManager.getConnection(dsnless);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * from students");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.println(resultSet.getString(i));
                }
            }

        } catch (Exception e) {
            statement.close();
            connection.close();

        }

    }

    public static void readXml() {
        try {
            DocumentBuilderFactory fabrika = DocumentBuilderFactory.newInstance();
            DocumentBuilder build = fabrika.newDocumentBuilder();
            Document dokuman = build.parse("http://www.tcmb.gov.tr/kurlar/today.xml");
            NodeList kokler = dokuman.getElementsByTagName("Currency");
            for (int i = 0; i < kokler.getLength(); i++) {
                NodeList list = kokler.item(i).getChildNodes();
                for (int i1 = 0; i1 < list.getLength(); i1++) {
                    System.out.println(list.item(i1).getFirstChild());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    public static void writeXml() {

        Document document;
        Vector vector = null;
        try {

            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            document = builder.newDocument();
            Element kok = document.createElement("kok");
            document.appendChild(kok);

            Element dizi_1[] = new Element[vector.size()];
            Element dizi_2[] = new Element[vector.size()];
            Element dizi_3[] = new Element[vector.size()];
            for (int i = 0; i <= vector.size(); i++) {
                if (i != vector.size()) {

                    dizi_1[i] = document.createElement("Bilgi");
                    dizi_2[i] = document.createElement("Ad");
                    dizi_3[i] = document.createElement("Soyad");
                    dizi_2[i].appendChild(document.createTextNode(vector.get(i).toString()));
                    dizi_3[i].appendChild(document.createTextNode(vector.get(i).toString()));
                    dizi_1[i].appendChild(dizi_2[i]);
                    dizi_1[i].appendChild(dizi_3[i]);
                    kok.appendChild(dizi_1[i]);

                } else {

                    Element bilgi = document.createElement("Bilgi");
                    Element ad = document.createElement("Ad");
                    Element soyad = document.createElement("Soyad");

                    ad.appendChild(document.createTextNode("SampleData1"));

                    soyad.appendChild(document.createTextNode("SampleData2"));
                    //**********************************************************
                    bilgi.appendChild(ad);
                    bilgi.appendChild(soyad);
                    kok.appendChild(bilgi);
                }
            }

            //**********************************************************
            Source kaynak = new DOMSource(document);
            Result sonuc = new StreamResult(new FileOutputStream("sample.xml"));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty("indent", "yes");//bosluk bırakılır
            transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-9");
            transformer.transform(kaynak, sonuc);

            vector.removeAllElements();

        } catch (Exception ex) {


            ex.printStackTrace();

        }


    }

}
