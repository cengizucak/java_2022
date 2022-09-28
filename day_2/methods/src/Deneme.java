public class Deneme {

    public static void main(String[] args) {

        sayiBulmaca();


    }

    public static void sayiBulmaca() {


        int[] sayilar = {1, 2, 5, 7, 9, 0};

        int aranacak = 15;

        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }


        if (varMi) {
            String mesaj=("Sayi VARDIR   : " + aranacak);
            mesajVer(mesaj);


        } else {
            mesajVer("Sayi Yoktur   : " + aranacak);


        }

    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);


    }
}
