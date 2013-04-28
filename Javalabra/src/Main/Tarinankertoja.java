package Main;

/**
 * Luokka, joka hoitaa tarinoiden kertomisen
 *
 * @author Olli
 */
public class Tarinankertoja extends Lukija {

    /**
     * Arvo jota käytetään arvoKappale()-metodin maksimina
     *
     * @see Main.Tarinankertoja#arvoKappale(int)
     */
    private int luku;
    /**
     * Arvo, jota käytetään kerroTarina()-metodin kappaleen valinnassa
     *
     * @see Main.Tarinankertoja#kerroTarina()
     */
    private int tarina;
    /**
     * Arvo, joka pitää kirjaa siitä, kuinka pitkällä tarinassa ollaan
     *
     * @see Main.Tarinankertoja#kerroTarina()
     */
    private int monesko;

    /**
     * Konstruktori, jossa alustetaan uusi Lukija-olio ja alustetaan tarina
     * alkutilaan
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
            tarina = arvoKappale(laskeKappale(eka));
            monesko++;
            return lueKappale(eka, tarina);
        } else if (monesko == 1) {
            tarina = arvoKappale(laskeKappale(toka));
            monesko++;
            return lueKappale(toka, tarina);
        } else if (monesko == 2) {
            tarina = arvoKappale(laskeKappale(kolmas));
            monesko++;
            return lueKappale(kolmas, tarina);
        } else {
            tarina = arvoKappale(laskeKappale(neljas));
            return lueKappale(neljas,tarina);
        }
    }
}