package cursus.h8.opdr1;

public class Reken {
    public static void main (String Args[]) {
        
       System.out.println(rondAf((float)4.5678,(short)3));
        
    }

private static float rondAf(float invoer, short decimalen) {
    
    double resultA = Math.round(invoer * Math.pow(10, decimalen)) / Math.pow(10, decimalen);
    
    String a = "bla";
    String b = "bla";
    if (a.equals(b)) {
        System.out.println("Hoe ken dit??");
    }
    
    return (float)resultA;
    }

}
