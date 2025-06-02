package org.example;

public class Sala {

    public Sala(String nume, String tip, String etaj, int calculatoare) {
        this.nume = nume;
        this.tip = tip;
        this.etaj = etaj;
        this.calculatoare = calculatoare;
    }

    public Sala() {
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getNume() {
        return nume;
    }

    public void setNome(String nome) {
        this.nume = nome;
    }

    public String getEtaj() {
        return etaj;
    }

    public void setEtaj(String etaj) {
        this.etaj = etaj;
    }

    public int getCalculatoare() {
        return calculatoare;
    }

    public void setCalculatoare(int calculatoare) {
        this.calculatoare = calculatoare;
    }

    @Override
    public String toString() {
      return nume + " " + tip + " " + etaj + " " + calculatoare;
    }
    String nume;
    String tip;
    String etaj;
    int calculatoare;
}
