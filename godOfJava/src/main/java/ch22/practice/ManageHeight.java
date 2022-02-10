package ch22.practice;

import java.util.ArrayList;

public class ManageHeight {
    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 1; i < 6; i++) {
            manageHeight.printHeight(i);
        }
        int classNo = 1;

        while (true) {
            manageHeight.printAverage(classNo++);
            if (classNo==6) break;
        }


    }

    private ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

    public void setData() {
        ArrayList<Integer> class1 = new ArrayList<>();
        class1.add(170);
        class1.add(180);
        class1.add(173);
        class1.add(175);
        class1.add(177);
        gradeHeights.add(class1);
        ArrayList<Integer> class2 = new ArrayList<>();
        class2.add(160);
        class2.add(165);
        class2.add(167);
        class2.add(186);
        gradeHeights.add(class2);
        ArrayList<Integer> class3 = new ArrayList<>();
        class3.add(158);
        class3.add(177);
        class3.add(187);
        class3.add(176);
        gradeHeights.add(class3);
        ArrayList<Integer> class4 = new ArrayList<>();
        class4.add(173);
        class4.add(182);
        class4.add(181);
        gradeHeights.add(class4);
        ArrayList<Integer> class5 = new ArrayList<>();
        class5.add(170);
        class5.add(180);
        class5.add(165);
        class5.add(177);
        class5.add(172);
        gradeHeights.add(class5);
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + classNo);
        ArrayList<Integer> integers = gradeHeights.get(classNo - 1);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

    }

    public void printAverage(int classNo) {
        double sum = 0;
        ArrayList<Integer> integers = gradeHeights.get(classNo - 1);
        for (Integer integer : integers) {
            sum+=integer;
        }
        System.out.println("Class No." + classNo);
        double res = sum / (double) integers.size();
        System.out.println(res);
    }

}
