package it.epicode.be.Esercizio1;

public class GestioneDipendenti {
    public static void main(String[] args) {

        Dipendente dipendenteCagnoni = new Dipendente("dani4316", Dipartimento.PRODUZIONE);
        Dipendente dipendenteFavaretto = new Dipendente("luca4316", Dipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente("4444", 1200, 30, Livello.IMPIEGATO, Dipartimento.PRODUZIONE);
        Dipendente dipendente4 = new Dipendente("5555", 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);
        dipendenteCagnoni.promuovi();
        dipendenteCagnoni.stampaDatiDipendenti();
        dipendenteFavaretto.stampaDatiDipendenti();
        dipendente3.stampaDatiDipendenti();
        dipendente4.stampaDatiDipendenti();
        Dipendente[] dipendenti = {dipendenteCagnoni, dipendenteFavaretto, dipendente3, dipendente4};
        sommaStipendi(dipendenti);

    }

    static void sommaStipendi(Dipendente[] dipendenti) {
        double somma = 0;
        for (Dipendente dipendente : dipendenti) {
            somma += dipendente.getStipendio();
        }
        System.out.println("la somma degli stipendi è" + somma);
    }


}
