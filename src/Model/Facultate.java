package Model;

import java.util.ArrayList;
import java.util.*;

public class Facultate
{
    private String nume;
    private List<Curs> listaCursuri = new ArrayList<Curs>();
    private List<Cursant> listaCursanti = new ArrayList<Cursant>();
    private List<Instructor> listaInstructori=new ArrayList<Instructor>();

    public List<Instructor> getListaInstructori()
    {
        return listaInstructori;
    }

    public void setListaInstructori(List<Instructor> listaInstructori)
    {
        this.listaInstructori = listaInstructori;
    }

    public List<Cursant> getListaCursanti()
    {
        return listaCursanti;
    }

    public void setListaCursanti(List<Cursant> listaCursanti)
    {
        this.listaCursanti = listaCursanti;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Curs> getlistaCursuri() {
        return listaCursuri;
    }

    public void setlistaCursuri(List<Curs> listalistaCursuri) {
        this.listaCursuri = listaCursuri;
    }

    public Facultate(String nume, List<Curs> listaCursuri)
    {
        this.nume = nume;
        this.listaCursuri = listaCursuri;
    }

    public Facultate(String nume, List<Curs> listaCursuri, List<Cursant> listaCursanti)
    {
        this.nume = nume;
        this.listaCursuri = listaCursuri;
        this.listaCursanti = listaCursanti;
    }

    public Facultate(String nume, List<Curs> listaCursuri, List<Cursant> listaCursanti, List<Instructor> listaInstructori)
    {
        this.nume = nume;
        this.listaCursuri = listaCursuri;
        this.listaCursanti = listaCursanti;
        this.listaInstructori = listaInstructori;
    }
}
