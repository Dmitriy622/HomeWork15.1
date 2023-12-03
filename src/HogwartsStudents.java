public abstract class HogwartsStudents {

    private String name;
    private int magicPower;
    private int transgressionPower;

    public HogwartsStudents(String name, int magicPower, int transgressionPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionPower = transgressionPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionPower() {
        return transgressionPower;
    }

    public void setTransgressionPower(int transgressionPower) {
        this.transgressionPower = transgressionPower;
    }

    private int sumOfSkills() {
        return magicPower + transgressionPower;
    }

    public void print() {
        System.out.println(this);
    }

    public void compareTo(HogwartsStudents hogwartsStudents) {
        int sumOfSkills1 = this.sumOfSkills();
        int sumOfSkills2 = hogwartsStudents.sumOfSkills();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.printf("Студент %s лучше студента %s (%d VS %d)%n %n", name, hogwartsStudents.name, sumOfSkills1, sumOfSkills2);
        } else if (sumOfSkills1 < sumOfSkills2) {
            System.out.printf("Студент %s лучше студента %s (%d VS %d)%n ", hogwartsStudents.name, name, sumOfSkills2, sumOfSkills1);
        } else {
            System.out.printf("Студент %s равен студенту %s (%d VS %d)%n ", name, hogwartsStudents.name, sumOfSkills1, sumOfSkills2);
        }
    }

    @Override
    public String toString() {
        return "%s, сила магии: %d, сила трансгрессии: %d".formatted(name, magicPower, transgressionPower);
    }
}