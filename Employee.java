public class Employee {

    private String name;
    private int age;
    private double salary;
    private String type;
    private double benefits;

    public Employee(String name, int age, double salary, String type, double benefits) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.type = type;
        this.benefits = benefits;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getType() {
        return type;
    }

    public double getBenefits() {
        return benefits;
    }
}
