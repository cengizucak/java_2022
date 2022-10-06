package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    //*sedece db erisim kodlari buraya yazilir...SQL

    public void add(Product product) {
        System.out.println("JDBC ile veritabanina eklendi..");

    }

}