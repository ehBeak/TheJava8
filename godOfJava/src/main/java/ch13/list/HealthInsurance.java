package ch13.list;

import java.util.ArrayList;
import java.util.Arrays;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0f),
    LEVEL_TWO(2000, 2.0f),
    LEVEL_THREE(3000, 3.2f),
    LEVEL_FOUR(4000, 4.5f),
    LEVEL_FIVE(5000, 5.6f),
    LEVEL_SIX(6000, 7.1f);

    private final int maxSalary;
    private final float ratio;

    HealthInsurance(int maxSalary, float ratio) {
        this.maxSalary=maxSalary;
        this.ratio = ratio;
    }

    public float getRatio() {
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary) {
        if (salary > 5000) return LEVEL_SIX;
        if (salary > 4000) return LEVEL_FIVE;
        if (salary > 3000) return LEVEL_FOUR;
        if (salary > 2000) return LEVEL_THREE;
        if (salary > 1000) return LEVEL_TWO;
        return LEVEL_ONE;
    }


    public static void main(String[] args) {
        int salaryArray[] = new int[]{1500, 5500, 8000};
        HealthInsurance[] insurances = new HealthInsurance[3];
        for (int loop = 0; loop < 3; loop++) {
            insurances[loop] = HealthInsurance.getHealthInsurance(salaryArray[loop]);
        }

        for (int loop = 0; loop < 3; loop++) {
            System.out.println(salaryArray[loop]+"="+insurances[loop]+","+insurances[loop].getRatio());
        }

        Arrays.stream(HealthInsurance.values()).forEach(System.out::println);

    }
}
