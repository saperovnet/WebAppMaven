import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

	private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
	public static void main(String[] args) throws SecurityException, IOException {

		LOGGER.info("Logger Name: "+LOGGER.getName());
		
		LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
		
		//An array of size 3
		int []a = {1,2,3};
		for (int i=0;  i <= 4; i++){
			LOGGER.info("Index is set to "+i);
			try{
				System.out.println(a[i]);
			}
			catch(ArrayIndexOutOfBoundsException ex){
				LOGGER.log(Level.SEVERE, "Exception occur", ex);
			}
		}	
	}
}
