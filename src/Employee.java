public class Employee {
    private final String fio;
    private int department;
    private int salary;
    public static int counter;
    private int id;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id + ", Ф.И.О.: " + fio + ", Отдел: " + department + ", Зарплата: " + salary;
    }

}
