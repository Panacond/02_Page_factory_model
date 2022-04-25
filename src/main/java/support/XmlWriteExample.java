package support;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class XmlWriteExample {
    public static void main(String[] args) {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
                new FileOutputStream("serial.xml")))) {
            Student student = new Student("Janka", 555777, "VKL_1410");
            xmlEncoder.writeObject(student);
            xmlEncoder.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(
                new FileInputStream("serial.xml")))) {
            Student student = (Student)xmlDecoder.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
