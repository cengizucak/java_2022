public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Ali";
        String ogrenci2 = "Veli";
        String ogrenci3 = "Ahmet";
        String ogrenci4 = "Mehmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("////////////");

        String[] students = new String[3];

        students[0]="Monica";
        students[1]="Anika";
        students[2]="Veronica";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("&&&&&&&&&&&&&&&&&");
        String[] ogrenciler = {
                "Ali",
                "Veli",
                "Ahmet",
                "Mehmet"};

        for (String ogrenci : ogrenciler
        ) {

            System.out.println(ogrenci);

        }
        System.out.println("************");

        for (int i = 0; i < ogrenciler.length; i++) {

            System.out.println(ogrenciler[i]);

        }


    }
}