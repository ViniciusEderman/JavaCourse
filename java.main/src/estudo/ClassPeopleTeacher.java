package estudo;

public class ClassPeopleTeacher {
    private double salary;
    private String specialty;

    public void upSalary() {
        this.salary += 1850.20;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
