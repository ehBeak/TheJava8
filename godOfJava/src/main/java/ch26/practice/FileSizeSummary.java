package ch26.practice;

import java.io.File;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path="/Users" + File.separator +
                "baek-eunhee" + File.separator +
                "eunhee" + File.separator +
                "study" + File.separator +
                "java" + File.separator +
                "TheJava8" + File.separator +
                "godOfJava" + File.separator +
                "src" + File.separator +
                "main" + File.separator +
                "java";

        long sum = sample.printFileSize(path);
        System.out.println(path + " 's total size=" + sum);
    }

    public long printFileSize(String dirName) {
        File file = new File(dirName);
        long sum = 0;

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getPath() + "=" + convertFileLength(f.length()));
            sum+=f.length();
        }

        return sum;
    }

    private String convertFileLength(long fileLength) {
        if (fileLength <= 1024) {
            return fileLength + " b";
        } else if (fileLength <= 1024 * 1024) {
            return (fileLength / 1024) + " kb";
        } else if (fileLength <= (1024 * 1024 * 1024)) {
            return (fileLength / (1024 * 1024)) + " mb";
        } else {
            return (fileLength / (1024 * 1024 * 1024)) + " gb";
        }
    }
}
