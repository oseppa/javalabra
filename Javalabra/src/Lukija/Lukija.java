package Lukija;

import java.io.File;
import java.util.Scanner;

public class Lukija {

    private int lukumaara1;
    private int lukumaara2;
    private int lukumaara3;
    private int kappale1;
    private int kappale2;
    private int kappale3;
    public static Scanner lukija;
    File eka = new File("Eka.txt");
    File toka = new File("Toka.txt");
    File kolmas = new File("Kolmas.txt");
    String[] ekaTaulu;
    String[] tokaTaulu;
    String[] kolmasTaulu;

    public int laskeEkaKappale() {
        try {
             lukija = new Scanner(eka);
        }
        catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        ekaTaulu = lukija.nextLine().split(":");
        lukumaara1 = ekaTaulu.length;
        lukija.close();
        return lukumaara1;
    }

    public int laskeTokaKappale(){
        try {
             lukija = new Scanner(toka);
        }
        catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        tokaTaulu = lukija.nextLine().split(":");
        lukumaara2 = tokaTaulu.length;
        lukija.close();
        return lukumaara2;
    }
    
    public int laskeKolmasKappale(){
        try {
             lukija = new Scanner(kolmas);
        }
        catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        kolmasTaulu = lukija.nextLine().split(":");
        lukumaara3 = kolmasTaulu.length;
        lukija.close();
        return lukumaara3;
    }
    
    public String lueEkaKappale(int kappale) {
        this.kappale1 = kappale;
        try {
             lukija = new Scanner(eka);
        }
        catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        ekaTaulu = lukija.nextLine().split(":");
        String EkaKappale = ekaTaulu[kappale];
        lukija.close();
        return EkaKappale;
    }
    
    public String lueTokaKappale(int kappale2){
        this.kappale2 = kappale2;
        try {
             lukija = new Scanner(toka);
        }
        catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        tokaTaulu = lukija.nextLine().split(":");
        String TokaKappale = tokaTaulu[kappale2];
        lukija.close();
        return TokaKappale;
    }
    
    public String lueKolmasKappale(int kappale3){
        this.kappale3 = kappale3;
        try {
             lukija = new Scanner(kolmas);
        }
        catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        kolmasTaulu = lukija.nextLine().split(":");
        String KolmasKappale = kolmasTaulu[kappale3];
        lukija.close();
        return KolmasKappale;
    }
}
