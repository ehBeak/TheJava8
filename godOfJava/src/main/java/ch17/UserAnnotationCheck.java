package ch17;

import java.lang.reflect.Method;

public class UserAnnotationCheck {

    public static void main(String[] args) {

        UserAnnotationCheck userAnnotationCheck = new UserAnnotationCheck();
        userAnnotationCheck.checkAnnotation(UserAnnotationSample.class);

    }

    public void checkAnnotation(Class useClass) {
        // 리플랙션 API : Class(클래스의 정보 확인), Method(클래스의 메소드 정보 확인) 클래스 제공
        Method[] methods = useClass.getDeclaredMethods();
        for (Method tmpMethod : methods) {
            UserAnnotation annotation = tmpMethod.getAnnotation(UserAnnotation.class);

            if (annotation != null) {
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(tmpMethod.getName() + " " + number + " " + text);
            } else {
                System.out.println(tmpMethod.getName() + " is null");
            }
        }
    }
}
