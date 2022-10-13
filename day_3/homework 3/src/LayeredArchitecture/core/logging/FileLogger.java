package LayeredArchitecture.core.logging;

public class FileLogger implements Logger {
    @Override
    public void log(String veri) {
        System.out.println("Looged to File : "+veri);

    }
}
