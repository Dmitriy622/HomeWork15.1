public class GriffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudents(String name, int magicPower, int transgressionPower, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int sumOfSkills() {
        return nobility+honor+bravery;
    }

    public void compareTo(GriffindorStudents griffindorStudents) {
        int sumOfSkills1 = this.sumOfSkills();
        int sumOfSkills2 = griffindorStudents.sumOfSkills();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.printf("Гриффиндорец %s лучше гриффиндорца %s (%d VS %d)%n ", getName(), griffindorStudents.getName(), sumOfSkills1, sumOfSkills2);
        } else if (sumOfSkills1 < sumOfSkills2) {
            System.out.printf("Гриффиндорец %s лучше гриффиндореца %s (%d VS %d)%n ", griffindorStudents.getName(), getName(), sumOfSkills2, sumOfSkills1);
        } else {
            System.out.printf("Гриффиндорец %s равен гриффиндорцу %s (%d VS %d)%n ", getName(), griffindorStudents.getName(), sumOfSkills1, sumOfSkills2);
        }
    }

    @Override
    public String toString() {
        return "%s %s, благородство: %d, честь: %d, храбрость: %d" .formatted("Гриффиндорец", super.toString(), nobility, honor, bravery);
    }
}
