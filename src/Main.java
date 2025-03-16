import clase.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Reading Applicants from Files ===");

        // Create readers for each type of applicant
        StudentReader studentReader = new StudentReader();
        AngajatReader angajatReader = new AngajatReader();
        ElevReader elevReader = new ElevReader();

        // Read from files
        List<Student> students = studentReader.readAplicants("studenti.txt");
        List<Angajat> employees = angajatReader.readAplicants("angajati.txt");
        List<Elev> pupils = elevReader.readAplicants("elevi.txt");

        // Display applicant information
        System.out.println("\n--- STUDENTS ---");
        displayApplicants(students);

        System.out.println("\n--- EMPLOYEES ---");
        displayApplicants(employees);

        System.out.println("\n--- PUPILS ---");
        displayApplicants(pupils);

        // Display financing information
        System.out.println("\n=== Financing Information ===");
        displayFinancing(students, employees, pupils);

        // Change financing amounts
        System.out.println("\n=== Updated Financing Information ===");
        Student.setSumaFinantare(25);
        Angajat.setSumaFinantare(15);
        Elev.setSumaFinantare(35);

        displayFinancing(students, employees, pupils);

        // Work with IPersonData interface
        System.out.println("\n=== Working with IPersonData Interface ===");
        List<IPersonData> persons = new ArrayList<>();
        if (!students.isEmpty()) persons.add(students.get(0));
        if (!employees.isEmpty()) persons.add(employees.get(0));
        if (!pupils.isEmpty()) persons.add(pupils.get(0));

        for (IPersonData person : persons) {
            System.out.println("Person: " + person.getNume() + " " + person.getPrenume() +
                    ", Age: " + person.getVarsta() +
                    ", Score: " + person.getPunctaj());
        }

        // Demonstrate applicant status
        System.out.println("\n=== Applicant Status ===");
        List<Aplicant> aplicants = new ArrayList<>();
        if (!students.isEmpty()) aplicants.add(students.getFirst());
        if (!employees.isEmpty()) aplicants.add(employees.getFirst());
        if (!pupils.isEmpty()) aplicants.add(pupils.getFirst());

        for (Aplicant aplicant : aplicants) {
            aplicant.afisareStatut();
        }
    }

    /**
     * Display a list of applicants
     */
    private static <T extends Aplicant> void displayApplicants(List<T> applicants) {
        if (applicants.isEmpty()) {
            System.out.println("No applicants found.");
            return;
        }

        System.out.println("Found " + applicants.size() + " applicants:");
        for (Aplicant applicant : applicants) {
            System.out.println(applicant);
        }
    }

    private static void displayFinancing(List<Student> students, List<Angajat> employees, List<Elev> pupils) {
        // Display student financing
        if (!students.isEmpty()) {
            System.out.println("\nSTUDENT FINANCING:");
            for (int i = 0; i < Math.min(3, students.size()); i++) {
                students.get(i).afisareFinantare();
            }
        }

        // Display employee financing
        if (!employees.isEmpty()) {
            System.out.println("\nEMPLOYEE FINANCING:");
            for (int i = 0; i < Math.min(3, employees.size()); i++) {
                employees.get(i).afisareFinantare();
            }
        }

        // Display pupil financing
        if (!pupils.isEmpty()) {
            System.out.println("\nPUPIL FINANCING:");
            for (int i = 0; i < Math.min(3, pupils.size()); i++) {
                pupils.get(i).afisareFinantare();
            }
        }
    }
}