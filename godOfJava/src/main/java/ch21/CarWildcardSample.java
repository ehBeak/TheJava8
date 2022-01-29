package ch21;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample carWildcardSample = new CarWildcardSample();
        carWildcardSample.callBoundedWildcardMethod();
    }

    public void callBoundedWildcardMethod() {
        WildcardGeneric<Car> carWildcardGeneric = new WildcardGeneric<>();
        carWildcardGeneric.setWildcard(new Car("Mustang"));
        boundedWildcardMethod(carWildcardGeneric);
    }

    public void callBusBoundedWildcardMethod() {
        WildcardGeneric<Bus> carWildcardGeneric = new WildcardGeneric<>();
        carWildcardGeneric.setWildcard(new Bus("Bus"));
        boundedWildcardMethod(carWildcardGeneric);
    }

    // Car타입으로 상속받은 모든 클래스를 매개변수로 넘겨줄 수 있다.
    public void boundedWildcardMethod(WildcardGeneric<? extends Car> wildcardGeneric) {
        Car value = wildcardGeneric.getWildcard();
        System.out.println(value);
    }


}
