public class Main {
    public static void main(String[] args) {

        char derece = 'C';

        switch (derece) {
            case 'A':
                System.out.println("Mukemmek : Gectiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldiniz ");
                break;
            default:
                System.out.println(" : Gecersiz not girdiniz");


        }

    }
}