public class RavenclawStudents extends HogwartsStudents{
    private int clever;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudents(String name, int magicPower, int transgressionPower, int clever, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionPower);
        this.clever = clever;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int sumOfSkills() {
        return clever+wisdom+wit+creativity;
    }

    public void compareTo(RavenclawStudents ravenclawStudents) {
        int sumOfSkills1 = this.sumOfSkills();
        int sumOfSkills2 = ravenclawStudents.sumOfSkills();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.printf("Когтевранец %s лучше когтевранца %s (%d VS %d)%n ", getName(), ravenclawStudents.getName(), sumOfSkills1, sumOfSkills2);
        } else if (sumOfSkills1 < sumOfSkills2) {
            System.out.printf("Когтевранец %s лучше когтевранца %s (%d VS %d)%n ", ravenclawStudents.getName(), getName(), sumOfSkills2, sumOfSkills1);
        } else {
            System.out.printf("Когтевранец %s равен когтевранцу %s (%d VS %d)%n ", getName(), ravenclawStudents.getName(), sumOfSkills1, sumOfSkills2);
        }
    }
    @Override
    public String toString() {
        return "%s %s, ум: %d, мудрость: %d, остроумие: %d, творчество: %d" .formatted("Когтевранец", super.toString(), clever, wisdom, wit, creativity);
    }
}
