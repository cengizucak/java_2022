package abstracts;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {


    @Override
    public void calculate() {
        System.out.println("Kaydedildi");
    }
}
