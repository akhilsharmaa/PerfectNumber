import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class PerfectNumber {

//    Working properly :)

    public static boolean isPerfectNumber(int number){

        int factorSum = 0;

        if (number < 1 ){ return false; }

        for (int i = number; i > 1; i--) {
            int factors = number / i;
            int remienders = number % i;

            if (remienders == 0){
//                System.out.println(factors);
                factorSum += factors;
            }
        }

        System.out.println(factorSum);
        if (factorSum == number){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isPerfectNumber(10);
    }

}
