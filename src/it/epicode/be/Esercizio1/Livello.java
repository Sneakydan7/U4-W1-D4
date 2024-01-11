package it.epicode.be.Esercizio1;

public enum Livello {
    OPERAIO(1),
    IMPIEGATO(1.2),
    QUADRO(1.5),
    DIRIGENTE(2);

    private double moltiplicatore;

    Livello(double moltiplicatore) {
        this.moltiplicatore = moltiplicatore;
    }

    public double getMoltiplicatore() {
        return moltiplicatore;
    }
}

