public class Employee {
    String name;
    String id;
    double salary;
    double bonus;
    double raise;

    public static void main(String[] args) {
        Employee Employee = new Employee("Cameron", "13423", 23900.09, 50, 4);
    }
    public Employee(String name, String id, double salary, double bonus, double raise){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.raise = raise;

    }
}
