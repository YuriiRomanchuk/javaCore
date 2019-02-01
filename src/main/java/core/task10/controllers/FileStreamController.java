package core.task10.controllers;

import java.io.*;

public class FileStreamController {

    public void writeFile(String text, String path) {

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
            out.writeUTF(text);
            out.close();
            System.out.println("File save");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readFile(String path) {

        StringBuilder stringBuilder = new StringBuilder();

        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            stringBuilder.append(in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
