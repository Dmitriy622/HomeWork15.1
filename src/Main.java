import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GriffindorStudents harry = generateGriffindorStudents("Гарри Поттер");
        GriffindorStudents germione = generateGriffindorStudents("Гермиона Грейнджер");
        GriffindorStudents ron = generateGriffindorStudents("Рон Уизли");

        SlytherinStudents draco = generateSlytherinStudents("Драко Малфой");
        SlytherinStudents grahem = generateSlytherinStudents("Грэхэм Монтегю");
        SlytherinStudents gregory = generateSlytherinStudents("Грегори Гойл");

        HufflepuffStudents zahariya = generateHufflepuffStudents("Захария Смит");
        HufflepuffStudents sedric = generateHufflepuffStudents("Седрик Диггори");
        HufflepuffStudents justin = generateHufflepuffStudents("Джастин Финч-Флетчли");

        RavenclawStudents chjou = generateRavenclawStudents("Чжоу Чанг");
        RavenclawStudents padme = generateRavenclawStudents("Падма Патил");
        RavenclawStudents marcus = generateRavenclawStudents("Маркус Белби");

        harry.print();
        harry.compareTo(marcus);
        germione.print();
        justin.print();
        germione.compareTo(justin);
        draco.print();
        sedric.print();
        draco.compareTo(sedric);
    }

    private static GriffindorStudents generateGriffindorStudents (String name) {
        return new GriffindorStudents(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudents generateHufflepuffStudents (String name) {
        return new HufflepuffStudents(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }

    private static RavenclawStudents generateRavenclawStudents (String name) {
        return new RavenclawStudents(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudents generateSlytherinStudents (String name) {
        return new SlytherinStudents(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}