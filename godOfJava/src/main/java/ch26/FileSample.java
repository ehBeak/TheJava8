package ch26;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        FileSample fileSample = new FileSample();
        String pathName = "D:\\spring\\thejava8\\godOfJava\\text";
        fileSample.checkPath(pathName);
    }

    public void checkPath(String pathName) {
        File file = new File(pathName);
        // mkdir : 디렉터리 생성
        System.out.println("Make " + pathName + " result = " + file.mkdir()); // \\text\\text2는 못함 (mkdirs 사용)
        System.out.println(pathName + "is exists? = " + file.exists());
    }
}
