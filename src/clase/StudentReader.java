package clase;

import java.util.Scanner;

public class StudentReader extends AplicantReader<Student> {
    @Override
    protected Student createAplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, Scanner input) {
        int anStudii = 0;
        String facultate = "";

        try {
            anStudii = input.nextInt();
            facultate = input.next().trim();
        } catch (Exception e) {
            System.err.println("Error reading student details for " + nume + " " + prenume + ": " + e.getMessage());
        }

        return new Student(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte, facultate, anStudii);
    }
}