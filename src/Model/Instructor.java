package Model;

public class Instructor extends Utilizator
{
    private int vechime;

    public Instructor(String nume, int varsta, float cnp, int vechime)
    {
        super(nume, varsta, cnp);
        this.vechime = vechime;
    }

    public Instructor() { }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        return super.toString()+ " / " + vechime;
    }
}
