package LayeredArchitecture.core.logging;

public class MailLogger implements Logger {
    @Override
    public void log(String veri) {
        System.out.println("Looged to Mail : "+veri);
    }
}
