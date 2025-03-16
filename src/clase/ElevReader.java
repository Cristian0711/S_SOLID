package clase;

import java.util.Scanner;

public class ElevReader extends AplicantReader<Elev> {
    @Override
    protected Elev createAplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, Scanner input) {
        int clasa = 0;
        String tutore = "";

        try {
            clasa = input.nextInt();
            tutore = input.nextLine().trim();
            if (tutore.startsWith(",")) {
                tutore = tutore.substring(1).trim();
            }
        } catch (Exception e) {
            System.err.println("Error reading pupil details for " + nume + " " + prenume + ": " + e.getMessage());
        }

        return new Elev(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte, clasa, tutore);
    }
}