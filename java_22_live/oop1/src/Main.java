public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
//set value
        product1.setName("Delongi Kahve Makinesi");
        //product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsinStock(3);
        product1.setImageUrl("resim1.jpg");

        Product product2 = new Product();
        product2.setName("Sweg Kahve Makinesi");
        //product2.setDiscount(8);
        product2.setUnitPrice(6500);
        product2.setUnitsinStock(3);
        product2.setImageUrl("resim2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        //product3.setDiscount(4);
        product3.setUnitPrice(4500);
        product3.setUnitsinStock(9);
        product3.setImageUrl("resim3.jpg");


        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</>");
        }
        System.out.println("</ul>");

        IndividualCostumer individualCostumer= new IndividualCostumer();
        individualCostumer.setId(1);
        individualCostumer.setPhone("555555");
        individualCostumer.setCostumerNumber("12345");
        individualCostumer.setFirstName("Cengiz");
        individualCostumer.setLastName("Ucak");

        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("888888");
        corporateCustomer.setTaxNumber("222222");
        corporateCustomer.setCostumerNumber("54321");

        Costumer[] costumers={individualCostumer,corporateCustomer};
        for(Costumer costumer :costumers ) {
            System.out.println(costumer.getId());
            System.out.println(costumer.getPhone());

        }



    }
}