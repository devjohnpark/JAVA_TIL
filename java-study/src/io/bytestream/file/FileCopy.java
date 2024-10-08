package io.bytestream.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(args[0]); FileOutputStream fos = new FileOutputStream(args[1])) {
            int data = 0;
            while ((data = fis.read()) != -1) {
               fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
