package interfaces;

public class CustomerManager {

    private Customer customer;
    ICreditManager creditManager;

    // burda polyformizide göruyoruz

    public CustomerManager(Customer customer, ICreditManager creditManager) { // interfaceler referans tip olduklari icin parametre olarak verebildik

        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println("Musteri kaydedildi..");


    }

    public void delete() {
        System.out.println("Musteri silindi..");


    }

    public void giveCredit() {
        creditManager.calculate();
        System.out.println("Kredi verildi");
    }
}
