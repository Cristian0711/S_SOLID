package clase;

import java.util.Arrays;

public class Elev extends Aplicant {
    private final int clasa;
    private final String tutore;
    private static int sumaFinantare = 30;

    public int getClasa() {
        return clasa;
    }

    public String getTutore() {
        return tutore;
    }

    public static void setSumaFinantare(int sumaFinantare) {
        Elev.sumaFinantare = sumaFinantare;
    }

    @Override
    public int getSumaFinantare() {
        return sumaFinantare;
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    @Override
    public String toString() {
        return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
                + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte
                + ", DenumireProiect=" + Arrays.toString(denumireProiect)
                + ", Clasa=" + clasa + ", Tutore=" + tutore;
    }

    @Override
    protected String getTip() {
        return "Elevul";
    }
}