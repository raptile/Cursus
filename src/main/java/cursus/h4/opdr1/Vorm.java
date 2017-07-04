package cursus.h4.opdr1;

import java.util.Arrays;
import java.util.List;

public abstract class Vorm {

    public abstract double omtrek();
    
    public static void main(String[] args) {
       List<Vorm> vormen = Arrays.asList(
               new Vierkant(1.0),
               new Rechthoek(80.0, 5.0),
               new Cirkel()
            );
        
       Double totalOppervlak = 0.0;
       for (Vorm vorm: vormen) {
           System.out.println("Omtrek " + vorm.getType() + " bedraagt " + vorm.omtrek());
           totalOppervlak += vorm.omtrek();
           
           System.out.println("totalOppervlak = " + totalOppervlak);
       }
    }
    
    public final String getType() {
        return getClass().getSimpleName();
    }

}
