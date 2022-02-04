package ch30.generic;

public class TypeInference {
    public static void main(String[] args) {
        TypeInference typeInference = new TypeInference();
        typeInference.makeObjects1(); // 작동
        typeInference.makeObjects2(); // 경고 뜨지만 작동
        typeInference.makeObjects3(); // 작동
    }

    public void makeObjects1() {
        GenericClass<Integer> generic1 = new GenericClass<>("String");
        generic1.setValue(999);
    }

    public void makeObjects2() {
        GenericClass<Integer> generic2 = new GenericClass("String");
        generic2.setValue(999);
    }

    public void makeObjects3() {
        GenericClass<Integer> generic2 = new GenericClass<Integer>("String");
        generic2.setValue(999);
    }

    public void makeObjects4() {
//        GenericClass<Integer> generic2 = new <String> GenericClass<>("String");
//        generic2.setValue(999);
        //==> 명시적으로 T타입을 선언한 상태에서 타입 X에 대해서는 다이아몬드로 선언하여 컴파일러에게 맡겨 버리면 컴파일 X
    }
}
