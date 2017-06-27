package cursus.h3.opdr4;


public class SubstringApp {
    public static void main (String Args[]) {
        
        String woord = Args[0]; //testjes
        
        int beginPositie = Integer.parseInt(Args[1]);   //2e
        int eindPositie = Integer.parseInt(Args[2]);    //5e

        
        StringBuilder kleinStukjeWoord = new StringBuilder(woord);
        
        kleinStukjeWoord.append(woord);
        
        System.out.println(kleinStukjeWoord.substring(beginPositie, eindPositie));
    }
}
