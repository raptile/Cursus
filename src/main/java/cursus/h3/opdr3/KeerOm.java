package cursus.h3.opdr3;


public class KeerOm {
    public static void main (String Args[]) {
        
        //String s = "MaakErWatMooisVan";
        String[] woorden = Args;
        
        int aantalWoorden = woorden.length;
        
        StringBuilder omgekeerd = new StringBuilder(aantalWoorden);
        
        for (String woord : woorden) {
            
            for(int omkeerOffset = woord.length()-1; omkeerOffset>=0; omkeerOffset--) {

                omgekeerd.append(woord.charAt(omkeerOffset));
            }
            omgekeerd.append(" ");
        }
        
        
        
        
        

//        System.out.println("De laatste letter is een " + s.charAt(l-1));
//        
//        StringBuilder omgekeerd = new StringBuilder(l);
//                
//        for(int omkeerOffset = l-1; omkeerOffset>=0; omkeerOffset--) {
//
//            omgekeerd.append(s.charAt(omkeerOffset));
//        }
        
        System.out.println(omgekeerd.toString());
        
    }
}
