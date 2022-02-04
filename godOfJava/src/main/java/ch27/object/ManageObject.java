package ch27.object;

import java.io.*;

import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {

        ManageObject manageObject = new ManageObject();

        String pathName = "D:" + separator + "spring" + separator + "thejava8" +
                separator + "godOfJava" + separator + "text" + separator + "serial.obj";

        SerialDTO godOfJavaBook = new SerialDTO("GodOfJavaBook", 1, true, 100);
        manageObject.saveObject(pathName, godOfJavaBook);
        manageObject.loadObject(pathName);

    }

    public void saveObject(String fullPath, SerialDTO dto) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fullPath); // FileOutputStream 생성
            oos = new ObjectOutputStream(fos); // ObjectOutputStream 생성
            oos.writeObject(dto);// 객체 저장

            System.out.println("Write Success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject(); // 객체 읽기
            SerialDTO dto = (SerialDTO) obj;

            System.out.println(dto);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
