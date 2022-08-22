import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        var randomInt = random.nextInt(100);

        Gryffindor garry = new Gryffindor("Гарри Поттер", randomInt,randomInt,randomInt,randomInt,randomInt);
        Gryffindor ron = new Gryffindor("Рон Уизли ", 50,30,50,45,36);
        Slytherin draco = new Slytherin("Драко Малфой",30,40,23,23,54,40,22);
        Slytherin gregor = new Slytherin("Грегори Гойл", 20,20,30,40,10,20,30);

        garry.comparisonGryffindor(ron);
        draco.comparisonSlytherin(gregor);
        garry.comparisonStudents(draco);

        garry.print();
    }

}