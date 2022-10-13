package LayeredArchitecture.core.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String veri) {
        System.out.println("Looged to Database : "+veri);

    }
}
