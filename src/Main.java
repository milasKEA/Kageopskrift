
import java.util.Scanner;
public class Main {
    private Opskrift chokoladekage = new Opskrift();

    public static void main(String[] args) {

        Main opskriftApp = new Main();
        opskriftApp.start();
    }
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_CYAN = "\u001B[36m";
    public void start(){
            printStartMessage();
            setAntalPersoner();
            printIngredients();
            printWeightAndEnergy();
            printAverageAndTotalWeightAndEnergy();
        }

public void printStartMessage(){
        System.out.println(ANSI_CYAN + "╔═══════════════════════════════╗");
        System.out.println(ANSI_CYAN + "║ Velkommen til kageopskriften  ║");
        System.out.println(ANSI_CYAN + "╚═══════════════════════════════╝");
    }
    public void setAntalPersoner(){
        System.out.print("Indtast hvor mange mennesker du skal bage til: ");
        Scanner keyboard = new Scanner(System.in);
        int antal = keyboard.nextInt();
        chokoladekage = new Opskrift();
        for (Ingrediens input : chokoladekage.getOpskrift()) {
            input.setAntalPersoner(antal);
        }
   }
    public void printIngredients() {

        //Udskriv mængde af ingredienser baseret på antal personer
        System.out.println("╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║ Opskriften består af følgende ingredienser                    ║");
        System.out.println("╠══════════════╦════════════╦═══════════════════════════════════╣");
        System.out.println("║ Mængde       ║   Enhed    ║         Navn                      ║");
        System.out.println("╠══════════════╬════════════╬═══════════════════════════════════╣");
        for (Ingrediens ingrediens : chokoladekage.getOpskrift()) {
            double mængde = ingrediens.getBeregnMængde();
            String enhed = ingrediens.getEnhed();
            String navn = ingrediens.getNavn();

            String formattedMængde = String.format("%-12.1f", mængde);
            String formattedEnhed = String.format("%-10s", enhed);
            String formattedNavn = String.format("%-28s", navn);

            System.out.println("║ " + formattedMængde + " ║ " + formattedEnhed + " ║ " + formattedNavn + "      ║");
        }
        System.out.println("╚══════════════╩════════════╩═══════════════════════════════════╝");
    }


        //Samlet vægt af kagen baseret på antal personer
public void printWeightAndEnergy() {
    System.out.print(ANSI_GREEN + "Kagen vejer ");
    double totalVægt = chokoladekage.beregnTotalVægt();
    double totalEnergi = chokoladekage.beregnTotalKcal();
    double totalKJ = chokoladekage.beregnTotalKJ();

    System.out.println(ANSI_RED + totalVægt + "g");
    System.out.println(ANSI_GREEN + "indeholder" + ANSI_RED + totalEnergi + " kcal");
    System.out.println(ANSI_GREEN + "som svarer til " + ANSI_RED + totalKJ + " kj");
}
public void printAverageAndTotalWeightAndEnergy(){
        double gennemsnitsVægt = chokoladekage.beregnTotalVægt() / 8;
        double gennemsnitsEnergi = chokoladekage.beregnTotalKcal() / 8;
        double gennemsnitsKJ = chokoladekage.beregnTotalKJ() /8;
        System.out.println(ANSI_GREEN + "Gennemsnitsvægten pr. ingrediens er " + ANSI_RED + gennemsnitsVægt + "g");
        System.out.println(ANSI_GREEN + "Gennemsnitsenergi pr. ingrediens er " + ANSI_RED + gennemsnitsEnergi + " kcal");
        System.out.println(ANSI_GREEN + "Gennemsnits KJ pr. ingrediens er " + ANSI_RED + gennemsnitsKJ + " kj");
    }
}
