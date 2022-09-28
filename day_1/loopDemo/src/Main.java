public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngu malesef bitti");

        System.out.println("****");
        //burda 2 ser 2 ser arttiralim
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        //While Döngusu
        System.out.println("************");
        int a = 2;
        while (a < 10) {
            System.out.println("a : " + a);
            a += 3;
        }

        System.out.println("While Döngusu bitti...");

        //Do While Döngusu

        System.out.println("*******************");

        int j = 1;
        //int j = 100;

        do {
            System.out.println("j : " + j);
            j += 2;
        } while (j < 10);
        System.out.println("While Döngusu bitti...");

    }
}