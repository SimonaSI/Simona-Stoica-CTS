package clase;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;
    protected static int pragPunctaj = 80;

    public void setDenumireProiect(int nrProiecte, String[] denumireProiect) {
        this.nrProiecte = nrProiecte;
        denumireProiect = new String[nrProiecte];
        for(int i=0; i<nrProiecte; i++) {
            this.denumireProiect[i] = denumireProiect[i];

        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afiseazaStatus() {
        System.out.println("Aplicantul " + nume + " " + prenume + ((punctaj < pragPunctaj) ? " nu " : "") + " a fost acceptat.");
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public static void setPragPunctaj(int pragPunctaj) {
        Aplicant.pragPunctaj = pragPunctaj;
    }

    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nrProiecte) {
        this.nrProiecte = nrProiecte;
    }

    public void afiseazaFinantarePeZi(int sumaPeZi) {
        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste " + sumaPeZi + " Euro/zi in proiect.");
    }

}
