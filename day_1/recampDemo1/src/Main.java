public class Main {
    public static void main(String[] args) {
        //enBuyuk();
        enKucuk();

    }

    public static void enBuyuk() {
        int sayi1 = 5120;
        int sayi2 = 225;
        int sayi3 = 858;

        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En Buyuk = " + enBuyuk);
    }

    public static void enKucuk() {
        int a = 220;
        int b = 25;
        int c = 88;

        //En kucuk sayiyi buluyoruz

        int enKucuk = a;

        if (enKucuk > b) {
            enKucuk = b;
        }
        if (enKucuk > c) {
            enKucuk = c;
        }
        System.out.println("En Kucuk = " + enKucuk);
    }
}