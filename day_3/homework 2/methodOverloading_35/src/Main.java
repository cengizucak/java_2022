public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(7, 5, 8);
        System.out.println("SONUC = " + sonuc);

        int arraysSonuc = dortIslem.toplaArrays(1, 8, 2, 4, 5);
        System.out.println("arraysSonuc  = " + arraysSonuc);

        System.out.println("");

        System.out.println(dortIslem.carp(1, 8, 2, 4, 2));

    }
}