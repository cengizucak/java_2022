public class ProductValidator { //! ana class static olamaz, ama inner class kullanarak static kullanabiliriz

    static {
        System.out.println("static Yapici blok calisti");
    }


    public ProductValidator() {
        System.out.println("Yapici blok calisti");
    }

    //* validator bir urunu kaydederken, guncellerken kurallara uygun olup olmadigini kontrol etmek icin kullanilir..
    public static boolean isValid(Product product) {

        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public void herhangibirsey() {

    }
}
