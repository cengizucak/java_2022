public class DortIslem {

    public int topla(int a, int b) {
        return a + b;
    }

    public int topla(int a, int b, int c) {
        return a + b + c;
    }

    public int toplaArrays(int... sayilar) {
        int toplam = 0;

        for (int sayi : sayilar) {

            toplam += sayi;
            System.out.println(sayi);  //burdasayilari ekrana yazdiralim
        }
        return toplam;
    }
    public int carp(int... sayilar) {
        int toplam = 1;

        for (int sayi : sayilar) {

            toplam *= sayi;

        }
        return toplam;
    }


}
