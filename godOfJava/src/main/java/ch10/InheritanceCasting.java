package ch10;
/* casting을 사용하는 경우와 instanceof */
public class InheritanceCasting {
    public static void main(String[] args) {

        InheritanceCasting casting = new InheritanceCasting();
        casting.objectCastArray();
    }

    public void objectCastArray() {
        ParentCasting[] parentArr = new ParentCasting[3];

        parentArr[0] = new ParentCasting();
        parentArr[1] = new ChildCasting(); // casting
        parentArr[2] = new ParentCasting();

        objectTypeCheck(parentArr);
    }

    private void objectTypeCheck(ParentCasting[] parentCastings) {
        for (ParentCasting parent : parentCastings) {
            if (parent instanceof ChildCasting) { // instanceof
                System.out.println("childCasting");
                ChildCasting tmpChild = (ChildCasting) parent; // 형변환 후 printAge() 호출
                tmpChild.printAge();
            }
            if (parent instanceof ParentCasting) {// arr[2](ChildCasting)도 true
                System.out.println("parentCasting");
            }

            //==> instanceof를 사용하여 타입을 점검할 때는 가장 하위에있는 자식 타입부터 제대로 확인하자(else if문 사용)
        }
    }
}
