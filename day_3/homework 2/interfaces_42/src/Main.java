public class Main {
    public static void main(String[] args) {

     /*
IcustomerDal icustomerDal=new IcustomerDal() {
    @Override
    public void add() {

    }
}*/
        //* interface'ler de abstract classlar gibi newlenemezler
        //* interfaceler onu implente eden class'in referansini tutabilir.. Polyformizm
        //* interface NERDE kullanilir.
        //* inteface onu implemente edilmesi istenen durumlarda kullanilir



        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());

        customerManager.add();
    }
}