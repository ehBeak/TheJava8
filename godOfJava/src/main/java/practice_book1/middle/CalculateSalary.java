package practice_book1.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        double increase = employee.getSalary();
        switch (employee.getType()) {
            case 1:
                increase = employee.getSalary() * 0.05;
                break;
            case 2:
                increase = employee.getSalary() * 1.1;
                break;
            case 3:
                increase = employee.getSalary() * 1.2;
                break;
            case 4:
                increase = employee.getSalary() * 1.3;
                break;
            case 5:
                increase = employee.getSalary() * 2;
                break;
        }
        return (long) increase;
    }

    public void calculateSalaries() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi", 1, 1_000_000_000);
        employees[1] = new Employee("KimManager", 2, 100_000_000);
        employees[2] = new Employee("WhangDesign", 3, 70_000_000);
        employees[3] = new Employee("ParkArchi", 4, 80_000_000);
        employees[4] = new Employee("LeeDevelop", 5, 60_000_000);

        for (Employee e : employees) {
            System.out.println(e.getName()+"="+getSalaryIncrease(e));
        }
    }
}
