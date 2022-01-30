package ch26;

import java.io.File;
import java.io.IOException;

public class FileManagerClass {
    public static void main(String[] args) {
        FileManagerClass sample = new FileManagerClass();

        //spring\\thejava8\\godOfJava\\text";
        String pathName = "D:" + File.separator + "spring" + File.separator + "thejava8"
                + File.separator + "godOfJava" + File.separator + "text";
        String fileName = "text.txt";

        sample.checkFile(pathName, fileName);
    }

    public void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            // createNewFile() : 비어있는 새로운 파일을 만든다.
            System.out.println("Create result = " + file.createNewFile());
            getFileInfo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getFileInfo(File file) throws IOException {
        System.out.println("Absolution Path " + file.getAbsolutePath()); // /a/../b/text.txt
        System.out.println("Absolution File " + file.getAbsoluteFile()); //
        System.out.println("Canonical Path " + file.getCanonicalPath()); // /b/text.txt
        System.out.println("Canonical File " + file.getCanonicalFile());

        System.out.println("Name = " + file.getName());
        System.out.println("Path = " + file.getPath());

        System.out.println("Parent = " + file.getParent()); // 경로만 출력
    }
}
