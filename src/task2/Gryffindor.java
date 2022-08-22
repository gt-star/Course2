package task2;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int powerMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullName, powerMagic, transgressionDistance);
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
    private int sumGryffindor(){
        return nobility + honor + bravery;
    }
    public void comparisonGryffindor(Gryffindor gryffindor){
        int students1 = sumGryffindor();
        int students2 = gryffindor.sumGryffindor();
        if (students1 > students2){
            System.out.printf("Гриффиндорец %s лучше, чем  Гриффиндорец %s: %d VS %d\n", getFullName(),gryffindor.getFullName(),students1,students2);
        }else if (students2 > students1){
            System.out.printf("Гриффиндорец %s лучше, чем  Гриффиндорец %s: %d VS %d\n", gryffindor.getFullName(),getFullName(),students2,students1);
        }else {
            System.out.printf("Гриффиндорец %s лучше, чем  Гриффиндорец %s: %d VS %d\n", getFullName(),gryffindor.getFullName(),students1,students2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s, благородство: %d; честь: %d; храбрость: %d\n",super.toString(),nobility,honor,bravery);
    }
}
