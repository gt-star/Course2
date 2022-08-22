package task2;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String fullName, int powerMagic, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(fullName, powerMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int sumRavenclaw(){
        return smart + wise + witty + creativity;
    }
    public void comparisonRavenclaw(Ravenclaw ravenclaw){
        int students1 = sumRavenclaw();
        int students2 = ravenclaw.sumRavenclaw();
        if (students1 > students2){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", getFullName(),ravenclaw.getFullName(),students1,students2);
        }else if (students2 > students1){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", ravenclaw.getFullName(),getFullName(),students2,students1);
        }else {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", getFullName(),ravenclaw.getFullName(),students1,students2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s, ум: %d; мудрость: %d; остроумие: %d; творчество: %d\n",super.toString(),smart,wise,witty,creativity);
    }
}
