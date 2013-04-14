package Main;

import Main.Lukija;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.Scanner;

public class LukijaTest {

    File ekaTesti = new File("Testi1.txt");
    File tokaTesti = new File("Testi2.txt");
    File kolmasTesti = new File("Testi3.txt");
    Lukija testi = new Lukija();

    public LukijaTest() {
    }

    @Test
    public void laskeKappaleLaskeeOikein1() {
        int a = testi.laskeKappale(ekaTesti);

        int vastaus = 1;

        assertEquals(a, vastaus);
    }

    @Test
    public void laskeKappaleLaskeeOikein2() {
        int a = testi.laskeKappale(tokaTesti);

        int vastaus = 2;

        assertEquals(a, vastaus);
    }

    @Test
    public void lueKappaleLukeeEkanOikein() {
        String a = testi.lueKappale(ekaTesti, 0);

        assertEquals(a, "Testi1");
    }

    @Test
    public void lueKappaleLukeeTokaOikein() {
        String a = testi.lueKappale(tokaTesti, 1);

        assertEquals(a, "Testi2-2");
    }
    @Test
    public void lueKappaleLukeeTyhjanOikein(){
        String a = testi.lueKappale(kolmasTesti, 0);
        
        assertEquals(a, "Tiedosto Testi3.txt on tyhjä.");
    }
}
