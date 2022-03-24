package estudo;

public class ClassPeopleMain {
  public static void main (String [] args) {

    ClassPeople p1 = new ClassPeople();
    ClassPeopleStudent s2 = new ClassPeopleStudent();
    ClassPeopleTeacher t1 = new ClassPeopleTeacher();
    ClassPeopleEmployee e1 = new ClassPeopleEmployee();

    p1.setName("Vinicius Roberto Nunes");
    s2.setName("Maria Eduarda");
    t1.setName("Clarice Mariciano");
    e1.setName("Enjhuano Clarico");

    p1.setCPF(15214987125);

    System.out.println(p1.toString());
    System.out.println(s2.toString());
    System.out.println(t1.toString());
    System.out.println(e1.toString());
  }  
}
