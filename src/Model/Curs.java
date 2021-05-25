package Model;

import java.util.*;

public class Curs {
    private String nume_materie;

    private Instructor instructor;
    private Facultate facultate;

    List<Cursant> cursanti = new ArrayList<Cursant>();
    List<Capitol> capitole = new ArrayList<Capitol>();

    @Override
    public String toString()
    {
        return "Nume materie: " + nume_materie + " \nNume instructor: " + instructor.getNume() +
                " \nDe la facultatea: "+ facultate.getNume() + "\n" + AfisareCursanti() + "\n" + AfisareCapitole();
    }

    public Curs(String nume_materie, Instructor instructor, Facultate facultate, List<Cursant> cursanti, List<Capitol> capitole)
    {
        this.nume_materie = nume_materie;
        this.instructor = instructor;
        this.facultate = facultate;
        this.cursanti = cursanti;
        this.capitole = capitole;
    }

    public Curs()
    { }

    public String getNume_materie() {
        return nume_materie;
    }

    public void setNume_materie(String nume_materie) {
        this.nume_materie = nume_materie;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Facultate getFacultate() {
        return facultate;
    }

    public void setFacultate(Facultate facultate) {
        this.facultate = facultate;
    }

    public List<Cursant> getCursanti() {
        return cursanti;
    }

    public String AfisareCursanti()
    {
        String lista_cursanti="Lista cursanti: ";
        for(Cursant c:cursanti)
        {
            lista_cursanti=lista_cursanti+c.getNume()+ ", ";
        }
        return lista_cursanti;
    }

    public void setCursanti(List<Cursant> cursanti) {
        this.cursanti = cursanti;
    }

    public List<Capitol> getCapitole() {
        return capitole;
    }

    public String AfisareCapitole()
    {
        String lista_capitole="Lista capitole: ";
        for(Capitol c:capitole)
        {
            lista_capitole=lista_capitole+c.getNume()+ ", ";
        }
        return lista_capitole;
    }

    public void setCapitole(List<Capitol> capitole) {
        this.capitole = capitole;
    }

}