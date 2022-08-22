public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String fullName, int powerMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(fullName, powerMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    private int sumHufflepuff(){
        return hardworking + loyal + honest;
    }
    public void comparisonHufflepuff(Hufflepuff hufflepuff){
        int students1 = sumHufflepuff();
        int students2 = hufflepuff.sumHufflepuff();
        if (students1 > students2){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", getFullName(),hufflepuff.getFullName(),students1,students2);
        }else if (students2 > students1){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", hufflepuff.getFullName(),getFullName(),students2,students1);
        }else {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", getFullName(),hufflepuff.getFullName(),students1,students2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s, трудолюбие: %d; верны: %d; честны: %d\n",super.toString(),hardworking,loyal,honest);
    }
}
