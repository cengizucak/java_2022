public class Product {
    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Constructor method calisti");
        this.id = id;
        this.name = name;
        this.despcription = despcription;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
        this.kod = kod;
    }

    public Product() {
    }

//bu sinifi ProductManager kullanacak

    //attribute veya field, özellikler
    /*private int _id;
    private String _name;
    private String _despcription;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;*/
    private int id;
    private String name;
    private String despcription;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDespcription() {
        return despcription;
    }

    public void setDespcription(String despcription) {
        this.despcription = despcription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
