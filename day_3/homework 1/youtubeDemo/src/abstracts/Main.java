package abstracts;

public class Main {

    //* SOLID
    //* Katmanli mimariler : görevler birbirinden ayirilir..
    public static void main(String[] args) {
        //? interfaceler is yapan operasyonlardir. Is yapan siniflarin  methodlarini sadece imza seyiyesinde yazarak yazilimda
        //? bagimliligi korumak amaclanmalidir

        //* interfacelerin amaci, yazilimdaki bagimlikliklar engellemek ve if'lerden kurtulmaktir

        //* IoC Container
        //CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();

        //? Bir sinif sadece bir sinifi INHERITANCE edebilir
        //? Bir sinif birden fazla INTERFACE'yi implemente edebilir

        //? interfaceler nerelerde kullanilir. Loglama sistemlerinde(log alt yapisini degistirmek istedigimiz de), veritabanlari arasinda
        //? gecis yapmak istedigimizde(oracleden MySqle gecerken). Kisacasi sistemlerde degisilik taleplerini karsilamak icin kullanilir

    }
}