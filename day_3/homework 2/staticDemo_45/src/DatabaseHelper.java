public class DatabaseHelper {
    //? böyle bir kullanim var. Fakat Engin Hoca tarafindan önerilmiyor..SOLID e uygun degil
    //? burda iki ayri Class olusturmak gerekir.Crud yapacak bir sinif, ve baglanti yapacak bir sinif
    public static class Crud { //* crud read, update, delete..
        public static void delete() {

        }

        public static void update() {

        }

        public static class Connection {
            public static void createConnection() {

            }

        }
    }
}
