package clase;

import java.util.Scanner;

public class AngajatReader extends AplicantReader<Angajat> {
    @Override
    protected Angajat createAplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, Scanner input) {
        int salariu = 0;
        String ocupatie = "";

        try {
            salariu = input.nextInt();
            ocupatie = input.next().trim();
        } catch (Exception e) {
            System.err.println("Error reading employee details for " + nume + " " + prenume + ": " + e.getMessage());
        }

        return new Angajat(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte, salariu, ocupatie);
    }
}