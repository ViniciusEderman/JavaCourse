package NewExercise;

public class ClassPeople {
// Atributos    

    private String name; 
    private String sex;     
    private int yearsOld;
    private int CPF;

//  Metódos 
    
    public void doHappy() {
        this.yearsOld ++;   
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        this.CPF = cPF;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPeople [CPF=" + CPF + ", name=" + name + ", sex=" + sex + ", yearsOld=" + yearsOld + "]";
    }
}
