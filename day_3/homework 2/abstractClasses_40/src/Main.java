public class Main {
    public static void main(String[] args) {
        //abstracktsiniflar asla new lenemez

       /* GameCalculator gameCalculator=new GameCalculator() {
            @Override
            public void hesapla() {

            }
        }*/

        GameCalculator gameCalculator = new WomenGameCalculator();
        gameCalculator.hesapla();
        GameCalculator oldGame=new OldGameCalculator();
        oldGame.hesapla();
    }
}