public class KalkulatorFor {
    public static void main(String[] args){

        int x = 3, y =2;
        int result = 0;

        for(int i = 0; i < x; i++){ // II for(int i = x; i > 0; i--)
            result += y;
        }

        System.out.println(x + " * " + y + " = " + result);

    }
}
