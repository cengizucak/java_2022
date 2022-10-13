package interfaces;

public class MilitaryCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        //hesaplamalar..
        System.out.println("Asker kredisi hesaplandi");
    }

    @Override
    public void save() {

    }
}
