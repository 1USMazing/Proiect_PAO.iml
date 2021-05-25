package service;

import Model.*;
import jdk.jshell.execution.Util;

import java.util.*;

public class FacultateServiciu
{
    private NotificareServiciu notificareServiciu;

    public FacultateServiciu(NotificareServiciu notificareServiciu)
    {
        this.notificareServiciu = notificareServiciu;
    }

    public void addCurs(Facultate facultate, Curs curs)
    {
        List<Curs> cursuri = facultate.getlistaCursuri();
        cursuri.add(curs);
        facultate.setlistaCursuri(cursuri);

        String mesaj = "Cursul " + curs.getNume_materie() + " a fost adaugat in facultate";

        notificareServiciu.trimiteNotificare(new Notificare(mesaj));
    }

    public void addCursant(Facultate facultate, Cursant cursant)
    {
        List<Cursant> cursanti = facultate.getListaCursanti();
        cursanti.add(cursant);
        facultate.setListaCursanti(cursanti);

        String mesaj = "Cursantul " + cursant.getNume() + " a fost adaugat in facultate";

        notificareServiciu.trimiteNotificare(new Notificare(mesaj));
    }

    public void addInstructor(Facultate facultate, Instructor instructor)
    {
        List<Instructor> instructori = facultate.getListaInstructori();
        instructori.add(instructor);
        facultate.setListaInstructori(instructori);

        String mesaj = "Instructorul " + instructor.getNume() + " a fost adaugat in facultate";

        notificareServiciu.trimiteNotificare(new Notificare(mesaj));
    }

    public void printCursDetalii(Facultate facultate)
    {
        for(Curs c : facultate.getlistaCursuri())
        {
                System.out.println(c);
                System.out.println("\n");
        }
    }

    public void printCursantDetalii(Facultate facultate)
    {
        for(Cursant c : facultate.getListaCursanti())
        {
            System.out.println(c);
            System.out.println("\n");
        }
    }

    public void printInstructorDetalii(Facultate facultate)
    {
        for(Instructor i : facultate.getListaInstructori())
        {
            System.out.println(i);
            System.out.println("\n");
        }
    }

    public void printFacultateNume(Facultate facultate)
    {
        System.out.println("Numele facultatii: " + facultate.getNume());
    }

    public void removeInstructor(Facultate facultate, Instructor instructor)
    {
        List<Instructor> noii_instructori=facultate.getListaInstructori();
        noii_instructori.remove(facultate.getListaInstructori().indexOf(instructor));
        facultate.setListaInstructori(noii_instructori);

        String mesaj = "Instructorul " + instructor.getNume() + " a fost dat afara din facultate";

        notificareServiciu.trimiteNotificare(new Notificare(mesaj));
    }

    public void removeCurs(Facultate facultate, Curs curs)
    {
        List<Curs> noile_cursuri=facultate.getlistaCursuri();
        noile_cursuri.remove(facultate.getlistaCursuri().indexOf(curs));
        facultate.setlistaCursuri(noile_cursuri);

        String mesaj = "Cursul " + curs.getNume_materie() + " a fost sters";

        notificareServiciu.trimiteNotificare(new Notificare(mesaj));
    }

    public void removeCursant(Facultate facultate, Cursant cursant)
    {
        List<Cursant> noii_cursanti=facultate.getListaCursanti();
        noii_cursanti.remove(facultate.getListaCursanti().indexOf(cursant));
        facultate.setListaCursanti(noii_cursanti);

        String mesaj = "Instructorul " + cursant.getNume() + " a fost dat afara din facultate";

        notificareServiciu.trimiteNotificare(new Notificare(mesaj));
    }

}
