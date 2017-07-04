package cursus.h4.opdr1;

public class Rechthoek extends Vorm{

    private Double breedte;
    private Double hoogte;
    
    public Rechthoek(Double breedte, Double hoogte) {
        this.breedte = breedte;
        this.hoogte = hoogte;
    }
    
//    @Override
    public double omtrek() {
        return ((breedte + hoogte) * 2);    
    }
    
}
