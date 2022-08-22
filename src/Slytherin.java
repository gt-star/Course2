public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int powerMagic, int transgressionDistance, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, powerMagic, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int sumSlytherin(){
        return trick + determination + ambition + resourcefulness + lustForPower;
    }
    public void comparisonSlytherin(Slytherin slytherin){
        int students1 = sumSlytherin();
        int students2 = slytherin.sumSlytherin();
        if (students1 > students2){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", getFullName(),slytherin.getFullName(),students1,students2);
        }else if (students2 > students1){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", slytherin.getFullName(),getFullName(),students2,students1);
        }else {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", getFullName(),slytherin.getFullName(),students1,students2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s, хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d\n",super.toString(),trick,determination,ambition,resourcefulness,lustForPower);
    }
}
