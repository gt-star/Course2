public abstract class Hogwarts {
    private String fullName;
    private int powerMagic;
    private int transgressionDistance;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public Hogwarts(String fullName, int powerMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }
    public void print(){
        System.out.println(this);
    }
    private int sumHogwarts(){
        return powerMagic + transgressionDistance;
    }
    public void comparisonStudents(Hogwarts hogwarts){
        int students1 = sumHogwarts();
        int students2 = hogwarts.sumHogwarts();
        if (students1 > students2){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", getFullName(),hogwarts.getFullName(),students1,students2);
        }else if (students2 > students1){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", hogwarts.getFullName(),getFullName(),students2,students1);
        }else {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d\n", getFullName(),hogwarts.getFullName(),students1,students2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент: %s; сила магии: %d; сила трансгрессии: %d\n", fullName,powerMagic,transgressionDistance);
    }
}
