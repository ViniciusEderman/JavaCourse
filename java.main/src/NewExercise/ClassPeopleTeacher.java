package NewExercise;

public class ClassPeopleTeacher extends ClassPeople {
    private double salary;
    private String specialty;

    public void upSalary(float UpSl) {
        this.salary += UpSl;
        
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
