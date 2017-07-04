package cursus.h5;

public class FizzBuzz {

    public static void main(String[] args) {
        
//        for (int i = 1; i<100; i++) {
//            
//           if (i%3 == 0 && i%5 == 0) {
//               System.out.println("FizzBuzz");
//           } else if (i%3 == 0) {
//               System.out.println("Fizz");
//               
//           } else if (i%5 == 0) {
//               System.out.println("Buzz");
//
//           } else {
//               System.out.println(i);
//           }
//            
//        }
        
        System.out.println("Faculteit 5 =" + faculteitRecursive(5));
        
        
        System.out.println("Faculteit 5 =" + faculteit(5));
    }
    
    private static int faculteitRecursive(int fac) {
        if (fac == 1) {
            return 1;
        }
        return fac * faculteitRecursive(fac - 1);
    }

    private static int faculteit(int fac) {
        int result = 1;
        if (fac > 2) { 
            for (int i=1; i<=5; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
