public class Employee {
    private static int idCounter = 1;
    private int id;
    private String fullName;
    private double salary;
    private int department;


    public Employee(String fullName, double salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = idCounter++;
    }
    public String getFullName() {
        return this.fullName;
    }
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
         this.salary = salary;
    }
    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department=department;
    }
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "id" + this.id + " " + this.fullName + "; зарплата: " + this.salary + "; отдел: " + this.department;

    }

}
