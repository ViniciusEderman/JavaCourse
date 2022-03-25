package NewExercise;

public class ClassPeopleMain {
  public static void main (String [] args) {

    ClassPeople p1 = new ClassPeople();
    ClassPeopleStudent s2 = new ClassPeopleStudent();
    ClassPeopleTeacher t1 = new ClassPeopleTeacher();
    ClassPeopleEmployee e1 = new ClassPeopleEmployee();
    ClassPeopleVisitant v1 = new ClassPeopleVisitant();;

    p1.setName("Vinicius Roberto Nunes");
    s2.setName("Maria Eduarda");
    t1.setName("Clarice Mariciano");
    e1.setName("Enjhuano Clarico");
    v1.setName("Emanuel Santos");

    p1.setCPF(0);
    s2.setCPF(0);
    t1.setCPF(0);
    e1.setCPF(0);

    p1.setSex("M");
    s2.setSex("F");
    t1.setSex("F");
    e1.setSex("M");
    v1.setSex("M");

    p1.setYearsOld(25);
    s2.setYearsOld(19);
    t1.setYearsOld(29);
    e1.setYearsOld(33);
    v1.setYearsOld(27);
    
    System.out.println(p1.toString());
    System.out.println(s2.toString());
    System.out.println(t1.toString());
    System.out.println(e1.toString());
    System.out.println(v1.toString());
  }  
}
