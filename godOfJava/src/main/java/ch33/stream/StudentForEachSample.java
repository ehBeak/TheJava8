package ch33.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StudentForEachSample {
    public static void main(String[] args) {

    }

    // 종단 연산 count, forEach, collect
    public void printStudentName(List<StudentDTO> students) {
        students.stream().forEach(studentDTO -> System.out.println(studentDTO.getName()));
        // 스트림 생성(Stream타입 리턴) -> 중개 연산(Stream타입 리턴) -> 종단 연산
        for (StudentDTO student : students) System.out.println(student.getName());
    }

    public void mapStudentName(List<StudentDTO> students) {
        students.stream().map(studentDTO -> studentDTO.getName())
                .forEach(name -> System.out.println(name));
        // map : 특정 데이터로 변환
    }

    public void methodReference(List<StudentDTO> students) {
        students.stream().forEach(System.out::println);

        /* 메소드 참조
        *  1. static 메소드 참조
        *  2. 특정 객체의 인스턴스 메소드 참조
        *  3. 특정 유형의 임의의 객체에 대한 인스턴스 메소드 참조
        *  4. 생성자 참조  */

    }

    // 중개 연산 map, filter
    public void multiplyWithFor(List<Integer> integerList) {
        integerList.stream().map(num -> num * 3).forEach(System.out::println);
    }

    // StudentDTO 리스트를 이름만 뽑아서 String 리스트로
    public void toStringList(List<StudentDTO> students) {
        List<String> collect = students.stream().map(studentDTO -> studentDTO.getName())
                .collect(Collectors.toList());
    }

    public void scoreFilter(List<StudentDTO> students) {
        students.stream().filter(studentDTO -> studentDTO.getScoreMath() > 80)
                .forEach(studentDTO -> System.out.println(studentDTO.getName()));

    }


}
