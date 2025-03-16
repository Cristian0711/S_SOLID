package clase;

public abstract class Aplicant implements IPersonData, IFinantable {
    protected final String nume;
    protected final String prenume;
    protected final int varsta;
    protected final int punctaj;
    protected final int nrProiecte;
    protected final String[] denumireProiect;

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getPrenume() {
        return prenume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public void afisareStatut() {
        String status = punctaj > 80 ? "a fost acceptat" : "nu a fost acceptat";
        System.out.println("Aplicantul " + nume + " " + prenume + " " + status + ".");
    }

    @Override
    public int getPunctaj() {
        return punctaj;
    }

    protected Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect.clone();
    }

    @Override
    public int getNrProiecte() {
        return nrProiecte;
    }

    @Override
    public String[] getDenumireProiect() {
        return denumireProiect.clone();
    }

    /**
     * Get the type of applicant (for display purposes)
     * @return A string representation of the applicant type
     */
    protected abstract String getTip();

    @Override
    public void afisareFinantare() {
        System.out.println(getTip() + " " + getNume() + " " + getPrenume() +
                " primeste " + getSumaFinantare() + " Euro/zi in proiect.");
    }
}