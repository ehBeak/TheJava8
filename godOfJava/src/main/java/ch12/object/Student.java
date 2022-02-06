package ch12.object;

import java.util.Objects;

public class Student {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // equals overriding
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(phone, student.phone) && Objects.equals(email, student.email);
    }

    // hashCode overriding
    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone, email);
    }
}
