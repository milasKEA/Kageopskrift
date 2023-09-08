public class Opskrift {
//Opskrift [] ingrediensListe = new Opskrift[8];

    private Ingrediens[] opskrift;

    public Opskrift() {
        Ingrediens ingrediensListe1 = new Ingrediens("Smør", 100, "g", 743);
        Ingrediens ingrediensListe2 = new Ingrediens("Æg", 3, " ",  72, 57);
//Æg vejer 57g
        Ingrediens ingrediensListe3 = new Ingrediens("Sukker", 125, "g", 500);
        Ingrediens ingrediensListe4 = new Ingrediens("Vaniljestang", 0.50, " ", 50, 6.5);
//vaniljestand vejer 6,5g
        Ingrediens ingrediensListe5 = new Ingrediens("Hvedemel", 35, "g",  25);
        Ingrediens ingrediensListe6 = new Ingrediens("Salt", 0.50, "knivspids", 3, 3);
//knivspids salt vejer 3g
        Ingrediens ingrediensListe7 = new Ingrediens("Chokolade", 100, "g",  400);
        Ingrediens ingrediensListe8 = new Ingrediens("Stærk kaffe", 1, "spsk", 15, 8);
//kaffe spsk vejer 8g
        opskrift = new Ingrediens[]{ingrediensListe1, ingrediensListe2, ingrediensListe3, ingrediensListe4,
                ingrediensListe5, ingrediensListe6, ingrediensListe7, ingrediensListe8};

    }

    public Ingrediens[] getOpskrift() {
        return opskrift;
    }

    public double beregnTotalVægt() {
        double totalVægt = 0;
        for (Ingrediens ingrediens : opskrift) {
            totalVægt+= ingrediens.getVægtPerEnhed()* (ingrediens.getMængde()/4);
            totalVægt += ingrediens.getSamlet();
        }
        return totalVægt;
    }

    public double beregnTotalKcal() {
        double totalKcal = 0;
        for (Ingrediens ingrediens : opskrift) {
            totalKcal += ingrediens.getKcal();
        }
        return totalKcal;
    }

    public double beregnTotalKJ() {
        double totalKJ = 0;
        double totalKcal = 0;
        for (Ingrediens ingrediens : opskrift) {
            totalKcal += ingrediens.getKcal();
            totalKJ = totalKcal * 4.2;
        }
        return totalKJ;
    }

}
