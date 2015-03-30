class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
public class SomeClass {
        
        private static Logger log = Logger.getLogger(SomeClass.class.getName());
        
        public void someMethod()
        {
            log.info("Some message");
        }      
