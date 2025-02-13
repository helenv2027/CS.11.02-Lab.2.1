import static java.awt.AWTEventMulticaster.add;

/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: helen
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {
        int add2 = add(4,6);
        System.out.println(add2);
        int add4 = add(5,7,6,4);
        System.out.println(add4);
        String mGreeting = morningGreeting("Toby Fox");
        System.out.println(mGreeting);
        String aGreeting = afternoonGreeting("Mac Miller");
        System.out.println(aGreeting);
        String trip = triple("oohbaby");
        System.out.println(trip);
        double half = half(8);
        System.out.println(half);
        int roundedpositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedpositive);
        int roundedpositive2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundedpositive2);
        int roundednegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundednegative);
        int roundednegative2 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundednegative2);
    }

    // 1. add
    public static int add(int a, int b){
        return a+b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    // 3. morningGreeting
    public static String morningGreeting(String a){
        return "早上好, "+ a+"!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String a){
        return "下午好, "+ a+"!";
    }
    // 5. triple
    public static String triple(String a){
        return a+a+a;
    }
    // 6. half
    public static double half(int a){
        double half = a;
        return half/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        int roundedpositive = (int) (a+0.5);
        return roundedpositive;
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        int roundednegative = (int) (a-0.5);
        return roundednegative; //doesnt matter what u name this bc it only gets used in the method//
        // u can even name "roundednegative" to "b" and it would still work//
    }
}
