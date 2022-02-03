package ch26;

import java.io.File;

public class FileFilterSample {
    public static void main(String[] args) {

    }

    public void checkList(String pathName) {
        File file;
        try {
            file = new File(pathName);
            File[] mainFileList = file.listFiles(new JPGFileFilter());

            for (File tmpFile : mainFileList) {
                System.out.println(tmpFile.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
