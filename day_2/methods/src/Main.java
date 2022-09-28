public class Main {
    public static void main(String[] args) {


        sayiBulmaca();
        sayiBulmaca();
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

        String mesaj = "";
        if (varMi) {
            System.out.println("Sayi VARDIR   : " + aranacak);
            mesajVer(mesaj);

        } else {
            System.out.println("Sayi Yoktur   : " + aranacak);


        }

    }

    public static void mesajVer(String mesaj) {

        System.out.println(mesaj);
    }
}

