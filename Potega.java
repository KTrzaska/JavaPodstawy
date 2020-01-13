public class Potega {
    public static void main(String[] args){
        int podstawa = 2;
        int potega = 5;
        int wynik = 1;


        for(int i = 0; i < potega; i++)
        {
       wynik = wynik * podstawa;
        }

        System.out.println(podstawa + " do potęgi " + potega + " wynik dla for " + wynik);

        int i = 0;
        wynik = 1;
        while(i < potega)
        {
            wynik = wynik * podstawa;
            i++;
        }

        System.out.println(podstawa + " do potęgi " + potega + " wynik dla while " + wynik);
    }
}
