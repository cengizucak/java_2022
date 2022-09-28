public class Main {
    public static void main(String[] args) {

        Product product=new Product(1,"SurfPlatta","Samsung Tablet",10000,5,"siyah");




       /* product.setName("SurfPlatta");
        product.setId(1);
        product.setDespcription("Samsung Tablet");
        product.setPrice(10000);
        product.setStockAmount(5);*/



        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());


    }
}