import java.util.Scanner;

public class Ingrediens {

    //Attributes
    private String navn;
    private double mængde;
    private String enhed;
    private double vægtPerEnhed;
    private double kcal;
    private int antalPersoner;

    //Konstruktør metode

    public Ingrediens(String navn, double mængde, String enhed, double kcal) {
        this.navn = navn;
        this.mængde = mængde;
        this.enhed = enhed;
        this.antalPersoner = 4;
        this.kcal = kcal;
        vægtPerEnhed = 1;
    }

    public Ingrediens(String navn, double mængde, String enhed, double kcal, double vægtPerEnhed) {
        this.navn = navn;
        this.mængde = mængde;
        this.enhed = enhed;
        this.antalPersoner = 4;
        this.vægtPerEnhed = vægtPerEnhed;
        this.kcal = kcal;
    }
    //Set metoder

    public void setAntalPersoner(int antalPersoner) {
        this.antalPersoner = antalPersoner;
    }

    // Get metoder
    public String getNavn() {
        return navn;
    }
    public String getEnhed() {
        return enhed;
    }

    public double getMængde() {
        return mængde;
    }

    public double getVægtPerEnhed() {
        return vægtPerEnhed;
    }

    public double getBeregnMængde() {
        return antalPersoner * (mængde / 4);
    }
    public double getKcal() {
        return antalPersoner * (kcal / 4);
    }
    public double getSamlet() {
        return (mængde / 4) * antalPersoner;
    }

}
