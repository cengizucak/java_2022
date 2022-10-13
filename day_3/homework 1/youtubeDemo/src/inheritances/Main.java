package inheritances;

public class Main {

    //* SOLID
    //* Katmanli mimariler : görevler birbirinden ayirilir..
    public static void main(String[] args) {

       CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save(new Customer());

        Customer customer = new Customer();//! örnegini olusturma , instance creation, burda HEAP de bir referans numarasi olusturuyoruz
        customer.setId(1);
        customer.setCity("Enköping");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.save();
        customerManager.save();
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.setId(100);
        company.setTaxNumber("100000");
        company.setCompanyName("LG");

        CustomerManager customerManager1 = new CustomerManager(new Person());


        Person person = new Person();
        person.setFirstName("Cengiz");
        person.setNationalIdentity("1234567");

        Customer customer1 = new Customer();
        Customer customer2 = new Person();
        Customer customer3 = new Company();

        //? interfaceler is yapan operasyonlardir. Is yapan siniflarin  methodlarini sadece imza seyiyesinde yazarak yazilimda
        //? bagimliligi korumak amaclanmalidir
    }
}