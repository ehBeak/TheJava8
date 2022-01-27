package ch11;

public class APICheck {
    public static void main(String[] args) {
        APICheck apiCheck = new APICheck();
        apiCheck.useDeprecated();
    }

    public void useDeprecated() {
        String str = "abcd";
        byte[] strBytes = str.getBytes();
        // String convertedStr = new String(strBytes, 0);// deprecated

        /*
        * Note: D:\spring\thejava8\godOfJava\src\main\java\ch11\APICheck.java uses or overrides a deprecated API.
        * Note: Recompile with -Xlint:deprecation for details
        */
    }
}
