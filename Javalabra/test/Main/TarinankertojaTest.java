package Main;

import Main.Tarinankertoja;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.Scanner;

public class TarinankertojaTest {

    Tarinankertoja testikertoja = new Tarinankertoja();
    File testi = new File("Testi2.txt");

    public TarinankertojaTest() {
    }

    @Test
    public void arvoKappalePalauttaaJotain() {
        assertNotNull(testikertoja.arvoKappale(100));
    }

    @Test
    public void arvoKappaleToimiiNollalla() {
        int a = testikertoja.arvoKappale(0);

        int vastaus = 0;

        assertEquals(a, vastaus);
    }

    @Test
    public void arvoKappaleToimiiYkkosella() {
        int a = testikertoja.arvoKappale(1);

        int vastaus = 0;

        assertEquals(a, vastaus);
    }

    @Test
    public void lueKappalePalauttaaJotain() {
        assertNotNull(testikertoja.lueKappale(testi, 1));
    }
}