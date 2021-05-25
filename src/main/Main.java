package main;

import Model.*;
import service.FacultateServiciu;
import service.NotificareServiciu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Facultate facultate = new Facultate("FMI", new ArrayList<Curs>());

        FacultateServiciu facultateServiciu = new FacultateServiciu(new NotificareServiciu());

        String path="F:\\Cursuri_Anul2\\PAO\\Proiect_PAO - BETA\\src\\ProiectPao.csv";

        while (true) {
            System.out.println("Alegeti una dintre urmatoarele comenzi: add, view, remove sau exit");
            String line="";
            try
            {
                BufferedReader br=new BufferedReader(new FileReader(path));
                while((line=br.readLine()) != null)
                {

                    switch (line) {
                case "add":
                    System.out.println("Alegeti ce doriti sa adaugati curs/cursant/instructor: ");
                    String objectType = br.readLine();

                    switch (objectType) {
                        case "curs": {
                            System.out.println("Specificati numele materiei: ");
                            String nc = br.readLine();

                            System.out.println("Specificati numele instructorului: ");
                            String n = br.readLine();
                            System.out.println("Specificati varsta instructorului: ");
                            int v = Integer.parseInt(br.readLine());
                            System.out.println("Specificati cnp-ul instructorului: ");
                            float cnp = Float.parseFloat(br.readLine());
                            System.out.println("Specificati vechimea instructorului: ");
                            int vechime =Integer.parseInt(br.readLine());
                            Instructor instructor = new Instructor(n, v, cnp, vechime);

                            System.out.println("Specificati numarul de cursanti: ");
                            int nr_curs = Integer.parseInt(br.readLine());
                            List<Cursant> list_cursanti = new ArrayList<Cursant>();

                            while (nr_curs != 0)
                            {
                                System.out.println("Specificati numele cursantului: ");
                                String numec = br.readLine();
                                System.out.println("Specificati varsta cursantului: ");
                                int varstac = Integer.parseInt(br.readLine());
                                System.out.println("Specificati cnp cursantului: ");
                                float cnpc = Float.parseFloat(br.readLine());
                                System.out.println("Specificati anul academic al cursantului: ");
                                int an_ac = Integer.parseInt(br.readLine());

                                Cursant cursant = new Cursant(numec, varstac, cnpc, an_ac);
                                list_cursanti.add(cursant);
                                nr_curs--;
                            }

                            System.out.println("Specificati numarul de capitole: ");
                            int nr_capitole = Integer.parseInt(br.readLine());
                            br.readLine();
                            List<Capitol> list_capitole = new ArrayList<Capitol>();

                            while (nr_capitole != 0) {
                                System.out.println("Specificati numele capitolului: ");
                                String numecap = br.readLine();

                                Capitol capitol = new Capitol(numecap);
                                list_capitole.add(capitol);
                                nr_capitole--;
                            }

                            Curs curs = new Curs(nc, instructor, facultate, list_cursanti, list_capitole);

                            facultateServiciu.addCurs(facultate, curs);
                            break;
                        }

                        case "cursant":
                            {
                                System.out.println("Specificati numele cursantului: ");
                                String numec = br.readLine();
                                System.out.println("Specificati varsta cursantului: ");
                                int varstac = Integer.parseInt(br.readLine());
                                System.out.println("Specificati cnp cursantului: ");
                                float cnpc = Float.parseFloat(br.readLine());
                                System.out.println("Specificati anul academic al cursantului: ");
                                int an_ac = Integer.parseInt(br.readLine());

                                System.out.println("Specificati numarul de examene: ");
                                int nr_examene=Integer.parseInt(br.readLine());
                                List<Examen> examene=new ArrayList<Examen>();

                                while(nr_examene!=0)
                                {
                                    System.out.println("Specificati materia examenului: ");
                                    String materie_examen = br.readLine();
                                    System.out.println("Specificati nota examenului: ");
                                    int nota_examen = Integer.parseInt(br.readLine());
                                    Examen examen = new Examen(nota_examen, materie_examen);
                                    examene.add(examen);
                                    nr_examene--;
                                }

                                Cursant cursant = new Cursant(numec, varstac, cnpc, an_ac, examene);
                                facultateServiciu.addCursant(facultate, cursant);
                                break;
                            }

                        case "instructor":
                            {
                                System.out.println("Specificati numele instructorului: ");
                                String nume_instr=br.readLine();
                                System.out.println("Specificati varsta instructorului: ");
                                int varsta_instr=Integer.parseInt(br.readLine());
                                System.out.println("Specificati cnp instructorului: ");
                                float cnp_instr=Float.parseFloat(br.readLine());
                                System.out.println("Specificati vechimea instructorului: ");
                                int vechime_instr=Integer.parseInt(br.readLine());

                                Instructor instructor=new Instructor(nume_instr,varsta_instr,cnp_instr,vechime_instr);
                                facultateServiciu.addInstructor(facultate,instructor);
                                break;
                            }
                        default:
                            System.out.println("Acest tip de obiect nu exista.");
                    }
                    break;

                case "view":
                    System.out.println("Alegeti ce doriti sa vizualizati facultate/cursuri/cursanti/instructori: ");
                    String tipObiect = br.readLine();
                    switch (tipObiect)
                    {
                        case "cursuri":
                            {
                                facultateServiciu.printCursDetalii(facultate);
                                break;
                            }
                        case "cursanti":
                        {
                            facultateServiciu.printCursantDetalii(facultate);
                            break;
                        }
                        case "instructori":
                        {
                            facultateServiciu.printInstructorDetalii(facultate);
                            break;
                        }
                        case "facultate":
                        {
                            facultateServiciu.printFacultateNume(facultate);
                            break;
                        }
                    default:
                        System.out.println("Acest tip de obiect nu exista.");
                    }
                    break;

                case "remove":
                    System.out.println("Alegeti ce doriti sa stergeti curs/cursant/instructor: ");
                    String Obiect = br.readLine();
                    switch (Obiect)
                    {
                        case "curs":
                        {
                            System.out.println("Specificati numele cursului: ");
                            String nume_curs=br.readLine();
                            Curs curs_sters=new Curs();
                            int index=0;
                            for(Curs c:facultate.getlistaCursuri())
                            {
                                if (c.getNume_materie().equals(nume_curs))
                                {
                                    facultateServiciu.removeCurs(facultate, c);

                                    break;
                                }
                                index++;
                            }

                            break;
                        }
                        case "cursant":
                        {
                            System.out.println("Specificati numele cursantului: ");
                            String nume_cursant=br.readLine();
                            Cursant cursant_sters=new Cursant();
                            int index=0;
                            for(Cursant c:facultate.getListaCursanti())
                            {
                                if (c.getNume().equals(nume_cursant))
                                {
                                    facultateServiciu.removeCursant(facultate, c);
                                    break;
                                }
                                index++;
                            }

                            break;
                        }
                        case "instructor":
                        {
                            System.out.println("Specificati numele instructorului: ");
                            String nume_instructor=br.readLine();
                            int index=0;
                            for(Instructor i:facultate.getListaInstructori())
                            {
                                if (i.getNume().equals(nume_instructor))
                                {
                                    facultateServiciu.removeInstructor(facultate, i);
                                break;
                                }
                                index++;
                            }

                            break;
                        }

                        default:
                            System.out.println("Acest tip de obiect nu exista.");
                    }
                    break;

                case "exit":
                    System.out.println("Mai treceti pe la noi!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Aceasta comanda nu exista.");
            }
                }
            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}


