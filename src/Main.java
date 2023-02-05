public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванивич", 20_000, 1);
        employees[1] = new Employee("Петров Петр Петрович", 25_000, 2);
        employees[2] = new Employee("Алексей Алексеев Алексеевич", 30_000, 3);
        employees[3] = new Employee("Иванова Елена Денисовна", 35_000, 4);
        employees[4] = new Employee("Петрова Оксана Алексеевна", 40_000, 5);
        printEmployee();
        printMinSalaryEmployee();
        printMaxSalaryEmployee();
        printSummaSalary();
        printMediumSalary();
        printFullName();

    }

    public static void printEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void printMinSalaryEmployee() {
        double minSalary = Double.MAX_VALUE;
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                    System.out.println("Минимальная зарплата составляет у: " + minSalaryEmployee);
                }
            }
        }
    }

    public static void printMaxSalaryEmployee() {
        double maxSalary = Double.MIN_VALUE;
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
            }
        }
        System.out.println("Максимальная зарплата составляет у: " + maxSalaryEmployee);
    }

    public static void printSummaSalary() {
        double summa = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                summa = summa + employee.getSalary();

            }

        }
        System.out.println("Сумма всех затрат на з.п. составляет: " + summa);

    }

    public static void printMediumSalary() {
        double sumSalary = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary = sumSalary + employee.getSalary();
                count++;
            }
        }
        System.out.println("Средняя зарплата сотрудников составляет: " + sumSalary / count);
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
