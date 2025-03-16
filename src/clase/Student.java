package clase;

import java.util.Arrays;

public class Student extends Aplicant {
    private final String facultate;
    private final int anStudii;
    private static int sumaFinantare = 20;

    public String getFacultate() {
        return facultate;
    }

    public int getAnStudii() {
        return anStudii;
    }

    /**
     * Set the financing amount for all students
     * @param sumaFinantare The daily financing amount in Euro
     */
    public static void setSumaFinantare(int sumaFinantare) {
        Student.sumaFinantare = sumaFinantare;
    }

    @Override
    public int getSumaFinantare() {
        return sumaFinantare;
    }

    /**
     * Create a new student
     */
    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte,
                   String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta
                + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte
                + ", DenumireProiect=" + Arrays.toString(denumireProiect)
                + ", Facultate=" + facultate + ", An_studii=" + anStudii;
    }

    @Override
    protected String getTip() {
        return "Studentul";
    }
}