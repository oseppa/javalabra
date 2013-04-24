package Main;

/**
 * Luokka, joka hoitaa tarinoiden kertomisen
 *
 * @author Olli
 */
public class Tarinankertoja extends Lukija {

    private int luku;
    private int tarina;
    private int monesko;
    private static int ekanPituus;
    private static int tokanPituus;
    private static int kolmannenPituus;

    /**
     * Konstruktori, jossa alustetaan uusi Lukija-olio
     * ja alustetaan tarina alkutilaan
     */
    public Tarinankertoja() {
        Lukija lukija = new Lukija();
        monesko = 0;
    }

    /**
     * Metodi, joka arpoo satunnaislukuja
     *
     * @param luku ensimmäinen luku, jota metodi ei saa palauttaa
     * @return palauttaa satunnaisluvun avoimelta väliltä (0,luku)
     */
    public int arvoKappale(int luku) {
        this.luku = luku;
        luku = (int) (Math.random() * luku);
        return luku;
    }

    /**
     * Metodi, joka arpoo satunnaisesti, mikä on tarinan seuraava kappale
     *
     * @return palauttaa tarinan kappaleen
     */
    public String kerroTarina() {
        if (monesko == 0) {
            ekanPituus = laskeKappale(eka);
            tarina = arvoKappale(ekanPituus);
            monesko++;
            return lueKappale(eka, tarina);
        } else if (monesko == 1) {
            tokanPituus = laskeKappale(toka);
            tarina = arvoKappale(tokanPituus);
            monesko++;
            return lueKappale(toka, tarina);
        } else {
            kolmannenPituus = laskeKappale(kolmas);
            tarina = arvoKappale(kolmannenPituus);
            monesko = 0;
            return lueKappale(kolmas, tarina);
        }
    }
}
