package Main;

import Main.Tarinankertoja;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TarinankertojaTest {

    Tarinankertoja testikertoja = new Tarinankertoja();

    public TarinankertojaTest() {
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

        int vastaus = 1;

        assertEquals(a, vastaus);
    }
}