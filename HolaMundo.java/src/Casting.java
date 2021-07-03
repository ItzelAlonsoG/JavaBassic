public class Casting {
    public static void main(String[] args) {

        //En un año ubicr 30 perritos
        //¿Cuántos perritos ubique al més?

        double monhtlyDogs = 30.0/12.0;
        System.out.println(monhtlyDogs);

        //Estimación
        int estimatedMonthlyDogs = (int) monhtlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exaactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

    }
}
