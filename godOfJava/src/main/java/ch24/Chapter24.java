package ch24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Chapter24 {
    public static void main(String[] args) {
        /* HashMap
        * 1. HashMap의 키값을 참조 자료형으로 사용할 때는 equals와 hashCode를 잘 구현해야한다.
        * => 동일한 값의 키면 동일한 hashCode가 나와야 한다. */

        /* TreeMap : 정렬 가능 */

        /* Map을 구현한 Properties 클래스
        *  => Properties 클래스에서 사용하는 메소드 때문 */
        Chapter24 chapter24 = new Chapter24();
        chapter24.saveAndLoadProperties();
        chapter24.saveAndLoadPropertiesXML();
    }

    public void saveAndLoadProperties() {
        String fileName = "test.properties";

        try {
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);

            Properties prop = new Properties();
            prop.setProperty("Writer", "Sangmin, Lee");
            prop.setProperty("WriteHome", "http://~");

            prop.store(fos, "Basic Properties file");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoad = new Properties();
            propLoad.load(fis);
            fis.close();

            System.out.println(propLoad);
        } catch (Exception e) {

        }
    }

    public void saveAndLoadPropertiesXML() {
        String fileName = "text.xml";
        try {
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);

            Properties prop = new Properties();
            prop.setProperty("Writer", "Sangmin, Lee");
            prop.setProperty("WriteHome", "http://~");

            prop.storeToXML(fos,"Basic XML Properties file");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoad = new Properties();
            propLoad.loadFromXML(fis);
            System.out.println(propLoad);
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
