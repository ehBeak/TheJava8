package ch13;

/* 참조 자료형의 final 선언 */
public class FinalReferenceType {

    final MemberDTO dto = new MemberDTO(); // 선언과 동시에 초기화

    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println(dto);
//        dto = new MemberDTO(); => 오류: final로 선언했으니까 바꾸면 안된다.
        dto.name = "Sangmin"; // 객체 내 인스턴스 값은 바꿀 수 있다.(인스턴스 변수는 final이 아니니까)
        System.out.println(dto);
    }
}
