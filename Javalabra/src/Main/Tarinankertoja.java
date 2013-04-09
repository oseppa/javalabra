package Main;

public class Tarinankertoja extends Lukija {

    private int luku;
    private int tarina;
    private int monesko;
    private static int ekanPituus;
    private static int tokanPituus;
    private static int kolmannenPituus;

    public Tarinankertoja() {
        Lukija lukija = new Lukija();
        ekanPituus = laskeKappale(eka);
        tokanPituus = laskeKappale(toka);
        kolmannenPituus = laskeKappale(kolmas);
        monesko = 0;
    }

    public int arvoKappale(int luku) {
        this.luku = luku;
        luku = (int) (Math.random() * luku);
        return luku;
    }

    public String kerroTarina() {
        if (monesko == 0) {
            tarina = arvoKappale(ekanPituus);
            monesko++;
            return lueKappale(eka, tarina);
        } else if (monesko == 1) {
            tarina = arvoKappale(tokanPituus);
            monesko++;
            return lueKappale(toka, tarina);
        } else {
            tarina = arvoKappale(kolmannenPituus);
            monesko++;
            return lueKappale(kolmas, tarina);
        }
    }
}
