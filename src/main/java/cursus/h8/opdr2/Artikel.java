package cursus.h8.opdr2;

public class Artikel {
    String naam;
    float prijs;
    
    Artikel(String naam, float prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject instanceof Artikel) {
            Artikel otherArtikel = (Artikel)anObject;
            if (this.naam.equals(otherArtikel.naam) && this.prijs == otherArtikel.prijs){
                System.out.println("Artikelen zijn exact gelijk");
                return true;
            } else if (this.naam.equals(otherArtikel.naam) && this.prijs != otherArtikel.prijs){
                System.out.println("Artikelen zijn gelijk maar de prijzen niet");
                return true;
            }
        }
       
        System.out.println("Artikelen zijn niet gelijk");
        return false;
    }

}
