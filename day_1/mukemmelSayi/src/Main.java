public class Main {
    public static void main(String[] args) {

        //mukemmel sayi
        //6 -- > 1,2,3
        //28-- > 1,2,4,7,14

        int number = 6;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number%1==0){
                total=total+i;
            }
        }

        if (total==number){
            System.out.println("Mukemmel sayidir");
        }else {
            System.out.println("Mukemmel sayi degildir");
        }


    }
}