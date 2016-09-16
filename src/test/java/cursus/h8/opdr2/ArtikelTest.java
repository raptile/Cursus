package cursus.h8.opdr2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArtikelTest {

    @Test
    public void givenTwoAriclesWithIdenticalDataTheyAreEqual() {
        Artikel a = new Artikel("Banaan", 1.00f);
        Artikel b = new Artikel("Banaan", 1.00f);
        assertTrue(a.equals(b));
    }

}
