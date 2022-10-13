public class Main {
    public static void main(String[] args) {

      /*  BaseLogger[] baseLoggers = {new DataBaseLogger(),new FileLogger(),  new EmailLogger(),new ConsoleLogger()};

       for (BaseLogger logger : baseLoggers) {
            logger.Log("log mesaji : ");
        }
*/

       CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
       customerManager.add();
    }
}