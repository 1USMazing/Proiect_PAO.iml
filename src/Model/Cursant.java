package Model;

import java.util.ArrayList;
import java.util.List;

public class Cursant extends Utilizator
{
    private int an_academic;

    private List<Examen> examene=new ArrayList<Examen>();

    public Cursant(String nume, int varsta, float cnp, int an_academic, List<Examen> examene) {
        super(nume, varsta, cnp);
        this.an_academic = an_academic;
        this.examene = examene;
    }

    public Cursant(String nume, int varsta, float cnp, int an_academic)
    {
        super(nume, varsta, cnp);
        this.an_academic = an_academic;
    }

    public Cursant() { }

    public int getAn_academic() {
        return an_academic;
    }

    public void setAn_academic(int an_academic) {
        this.an_academic = an_academic;
    }

    public String AfisareExamene()
    {
        String lista_examene="Lista examene: ";
        for(Examen e:examene)
        {
            lista_examene=lista_examene + "Materie: " + e.getMaterie()+ ", Nota: " +e.getNota()+"; ";
        }
        return lista_examene;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAn academic: " + an_academic + "\nExamene: " + AfisareExamene();
    }
}
