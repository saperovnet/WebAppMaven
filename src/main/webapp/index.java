import java.util.logging.Logger;
class HelloWorld {
    private static Logger log = Logger.getLogger(HelloWorld.class.getName());
    public static void main(String[] args) {
        System.out.println("Hello World!");
        log.info("log Hello World!");
    }
}
