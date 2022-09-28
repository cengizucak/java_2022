import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugun hava cok guzel.";
        String mesaj2 = "      Bugun hava cok guzel.     ";
        System.out.println(mesaj);

       /* System.out.println("Eleman sayisi : "+mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.startsWith("c"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler=new  char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("u"));*/

        String yeniMesaj = mesaj.replace(' ', '_');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for(String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());
        System.out.println("---------------------");
        System.out.println(mesaj2);
        System.out.println("---------------------");
        System.out.println(mesaj2.trim());


    }
}