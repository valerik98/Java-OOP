package SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseSalary(double percentage){
        if (this.getAge()<30){
            this.setSalary(this.getSalary() + this.getSalary()*percentage/200);
        }else {
            this.setSalary(this.getSalary() + this.getSalary()*percentage/100);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva", this.getFirstName(), this.getLastName(), this.salary);
    }
}
