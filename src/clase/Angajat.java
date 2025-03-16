package clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private final String ocupatie;
    private final int salariu;
    private static int sumaFinantare = 10;

    public String getOcupatie() {
        return ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    /**
     * Set the financing amount for all employees
     * @param sumaFinantare The daily financing amount in Euro
     */
    public static void setSumaFinantare(int sumaFinantare) {
        Angajat.sumaFinantare = sumaFinantare;
    }

    @Override
    public int getSumaFinantare() {
        return sumaFinantare;
    }

    /**
     * Create a new employee
     */
    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte,
                   String[] denumireProiect, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    @Override
    public String toString() {
        return "Angajat: Nume=" + nume + ", Prenume=" + prenume
                + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte
                + ", DenumireProiect=" + Arrays.toString(denumireProiect)
                + ", Ocupatie=" + ocupatie + ", Salariu=" + salariu;
    }

    @Override
    protected String getTip() {
        return "Angajatul";
    }
}