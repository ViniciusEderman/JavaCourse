package estudo;

public class ClassPeopleEmployee extends ClassPeople {
    private String wordSector;
    private boolean working;

    public void changeWork() {
        this.working = !this.working;
    }

    public boolean getWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public String getWordSector() {
        return wordSector;
    }

    public void setWordSector(String wordSector) {
        this.wordSector = wordSector;
    }

    
}