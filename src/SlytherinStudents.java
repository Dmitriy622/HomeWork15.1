public class SlytherinStudents extends HogwartsStudents{

    private int trickness;
    private int resoluteness;
    private int ambitiousness;
    private int ingenuity;
    private int lustForPower;

    public SlytherinStudents(String name, int magicPower, int transgressionPower, int trickness, int resoluteness, int ambitiousness, int ingenuity, int lustForPower) {
        super(name, magicPower, transgressionPower);
        this.trickness = trickness;
        this.resoluteness = resoluteness;
        this.ambitiousness = ambitiousness;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    public int getTrickness() {
        return trickness;
    }

    public void setTrickness(int trickness) {
        this.trickness = trickness;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int sumOfSkills() {
        return trickness+resoluteness+ambitiousness+ingenuity+lustForPower;
    }

    public void compareTo(SlytherinStudents slytherinStudents) {
        int sumOfSkills1 = this.sumOfSkills();
        int sumOfSkills2 = slytherinStudents.sumOfSkills();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.printf("Слизеринец %s лучше слизеринца %s (%d VS %d)%n ", getName(), slytherinStudents.getName(), sumOfSkills1, sumOfSkills2);
        } else if (sumOfSkills1 < sumOfSkills2) {
            System.out.printf("Слизеринец %s лучше слизеринца %s (%d VS %d)%n ", slytherinStudents.getName(), getName(), sumOfSkills2, sumOfSkills1);
        } else {
            System.out.printf("Слизеринец %s равен слизеринцу %s (%d VS %d)%n ", getName(), slytherinStudents.getName(), sumOfSkills1, sumOfSkills2);
        }
    }

    @Override
    public String toString() {
        return "%s %s, хитрость: %d, решительность: %d, амбициозность: %d, находчивость: %d, жажда власти: %d" .formatted("Слизеринец", super.toString(), trickness, resoluteness, ambitiousness, ingenuity, lustForPower);
    }
}
