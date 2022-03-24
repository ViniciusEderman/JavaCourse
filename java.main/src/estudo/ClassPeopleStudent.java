package estudo;

public class ClassPeopleStudent extends ClassPeople {
    private int register;
    private String course;

    public void cancellCourse(){
        System.out.println("Matrícula será cancelada");

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }
}
