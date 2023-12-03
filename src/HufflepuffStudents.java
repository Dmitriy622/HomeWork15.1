public class HufflepuffStudents extends HogwartsStudents{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String name, int magicPower, int transgressionPower, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionPower);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int sumOfSkills() {
        return industriousness+loyalty+honesty;
    }

    public void compareTo(HufflepuffStudents hufflepuffStudents) {
        int sumOfSkills1 = this.sumOfSkills();
        int sumOfSkills2 = hufflepuffStudents.sumOfSkills();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.printf("Пуффендуец %s лучше пуффендуйца %s (%d VS %d)%n ", getName(), hufflepuffStudents.getName(), sumOfSkills1, sumOfSkills2);
        } else if (sumOfSkills1 < sumOfSkills2) {
            System.out.printf("Пуффендуец %s лучше пуффендуйца %s (%d VS %d)%n ", hufflepuffStudents.getName(), getName(), sumOfSkills2, sumOfSkills1);
        } else {
            System.out.printf("Пуффендуец %s равен пуффендуйцу %s (%d VS %d)%n ", getName(), hufflepuffStudents.getName(), sumOfSkills1, sumOfSkills2);
        }
    }

    @Override
    public String toString() {
        return "%s %s, трудолюбие: %d, верность: %d, честность: %d" .formatted("Пуффендуец", super.toString(), industriousness, loyalty, honesty);
    }
}
