package Model;

public abstract class Quiz extends Object
{
    private int nota;
    private String materie;

    public Quiz()
    { }

    public Quiz(int nota, String materie)
    {
        this.nota = nota;
        this.materie = materie;
    }

    public int getNota()
    {
        return nota;
    }

    public void setNota(int nota)
    {
        this.nota = nota;
    }

    public String getMaterie()
    {
        return materie;
    }

    public void setMaterie(String materie)
    {
        this.materie = materie;
    }

    @Override
    public String toString() {
        return nota + " / " + materie;
    }
}
