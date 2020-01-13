public class Silnia {
    public static void main(String[] args) {
        // silnia: n! = 1 * 2 * 3 * ... * n

        int n = 10;
        int x = 2;
        int silniaWhile = 1;


        while (x <= n) {

            silniaWhile = silniaWhile * x;
            x++;

        }
        System.out.println("Dla silni" + n + "! w while " + silniaWhile );

        int silniaFor = 1;

        for (int i = 2; i <= n; i++) {

            silniaFor = silniaFor * i;
        }

        System.out.println("Silni" + n+"! w for " + silniaFor);


    }
}
