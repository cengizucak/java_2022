package interfaces;

public class TeacherCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Ogretmen kredisi hesaplandi");

    }

    @Override
    public void save() throws Exception {
        throw new Exception();

    }
}
