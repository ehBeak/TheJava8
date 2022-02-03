package ch26;

import java.io.File;
import java.io.FilenameFilter;

// 디렉터리와 파일을 구분하지 못한다.
public class JPGFilenameFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        if (name.endsWith(".jpg")) {
            return true;
        }
        return false;
    }
}
