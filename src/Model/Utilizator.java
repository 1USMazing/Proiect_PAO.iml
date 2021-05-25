package Model;

public abstract class Utilizator extends Object
{
    protected String nume;
    protected int varsta;
    protected float cnp;

    public Utilizator()
    { }

    public Utilizator(String nume, int varsta, float cnp)
    {
        this.nume = nume;
        this.varsta = varsta;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public float getCnp() {
        return cnp;
    }

    public void setCnp(float cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + "\nVarsta: " + varsta + "\nCNP: " + cnp;
    }
}
