public class Main {
    public static void main(String[] args) {

        int a = 550;
        int b = 120;
        int c = 240;

        int enBuyuk = a;

        if (enBuyuk < b) {
            enBuyuk = b;

        }
        if (enBuyuk < c) {
            enBuyuk = c;
        }
        System.out.println("Enbuyuk = " + enBuyuk);


        double[] mylist = {1.2, 1.3, 7.3, 5.6};

        double total = 0;

        double max = mylist[0];

        for (double number : mylist) {

            if (max < number) {
                max = number;
            }

            total = total + number;
            System.out.println(number);
            System.out.println("***");
        }
        System.out.println("Toplam : " + total);
        System.out.println("Max    : " + max);


    }
}