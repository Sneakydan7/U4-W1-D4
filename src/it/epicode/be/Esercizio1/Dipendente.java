package it.epicode.be.Esercizio1;

public class Dipendente {

    public static double stipendioBase = 1000;

    private String matricola;

    private double stipendio;

    private double importoOraStraordinario;

    private Livello livello;

    private Dipartimento dipartimento;


    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOraStraordinario = 30;
        this.livello = Livello.OPERAIO;

    }

    public Dipendente(String matricola, double stipendio, double importoOraStraordinario,
                      Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOraStraordinario = importoOraStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;

    }


    public void stampaDatiDipendenti() {
        System.out.printf("matricola:%s %n stipendio:%s %n importo straordinario:%s %n livello: %s %n" +
                        "dipartimento: %s  "
                , this.matricola, this.stipendio, this.importoOraStraordinario, this.livello, this.dipartimento);

    }


    public Livello promuovi() {
        switch (this.livello) {
            case OPERAIO -> {
                this.livello = Livello.IMPIEGATO;
                this.stipendio = stipendioBase * Livello.IMPIEGATO.getMoltiplicatore();
                return this.livello;


            }
            case IMPIEGATO -> {
                this.livello = Livello.QUADRO;
                this.stipendio = stipendioBase * Livello.QUADRO.getMoltiplicatore();
                return this.livello;


            }
            case QUADRO -> {
                this.livello = Livello.DIRIGENTE;
                this.stipendio = stipendioBase * Livello.DIRIGENTE.getMoltiplicatore();
                return this.livello;

            }


        }
        return null;
    }


    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public static double calcolaPaga(Dipendente dipendente, int ore) {
        return dipendente.getStipendio() + (ore * dipendente.getImportoOraStraordinario());
    }


    // GETTERS
    public static double getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOraStraordinario() {
        return importoOraStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    //SETTERS


    public void setImportoOraStraordinario(double importoOraStraordinario) {
        this.importoOraStraordinario = importoOraStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}


