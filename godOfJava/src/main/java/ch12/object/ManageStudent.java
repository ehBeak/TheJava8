package ch12.object;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "01012345678", "email@email.com");
        Student b = new Student("Min", "Seoul", "01012345678", "email@email.com");

        if (a.equals(b)) {
            System.out.println("Equal");
        }else
            System.out.println("Not Equal");
    }
}
