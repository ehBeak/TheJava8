package ch12;

import java.util.Objects;

public class MemberDTO {

    private String name;
    private String email;
    private String phone;

    /* equals 메소드을 오버라이딩 할 때는 hashCode 메소드도 같이 오버라이딩 해야한다.
    *  equals로 두 객체를 비교할 때는 그 값이 같지만, hash로 비교하면 다르기 때문 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return Objects.equals(name, memberDTO.name) && Objects.equals(email, memberDTO.email) && Objects.equals(phone, memberDTO.phone);
    }

    // equals 메소드를 오버라이드 하면, hashCode도 오버라이드 해서 둘이 동일한 결과가 나와야 한다.
    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone);
    }

    /*
    * public static int hashCode(Object a[]) {
        if (a == null)
            return 0;

        int result = 1;

        for (Object element : a)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;
    }
    * */
}
