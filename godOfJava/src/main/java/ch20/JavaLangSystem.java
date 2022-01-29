package ch20;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem sample = new JavaLangSystem();
        sample.systemPropertiesCheck();
        sample.numberMinMaxElapsedCheck();
    }

    public void systemPropertiesCheck() {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getenv("JAVA_HOME"));
    }

    public void numberMinMaxElapsedCheck() {

        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();

        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(System.nanoTime() - startNanoTime);

    }
}
