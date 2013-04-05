package Laskija;

public class Laskija {

    private int luku;

    public Laskija() {
        this.luku = 0;
    }

    public int arvoLuku(int luku) {
        if (luku == 0) {
            this.luku = 0;
        } else {
            this.luku = (int) (Math.random() * luku);
        }
        return luku;
    }
}
