public class Main {
    public static void main(String[] args) {

        int sayi = topla(9, 3);
        System.out.println(sayi);

        String mesaj = arabaIsmiVer();
        System.out.println(mesaj);

        System.out.println(topla2(5, 8, 2));

        takimlariSirala("R.Madrid", "Chelsea", "B.Munih", "Juventus");


    }

    public static void ekle() {

        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void guncelle() {
        System.out.println("Guncellendi");
        return; //burda return bitir anlaminda..
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        int sum = 0;
        for (int sayi : sayilar) {
            sum += sayi;

        }


        return sum;
    }

    public static String arabaIsmiVer() {
        return "Ford Puma";
    }

    public static String takimlariSirala(String... takimlar) {

        for (String team : takimlar) {
            System.out.println(team);
        }


        return "";
    }


}