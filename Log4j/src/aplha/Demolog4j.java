package aplha;
import org.apache.logging.log4j.*;
public class Demolog4j {
	private static Logger log = LogManager.getLogger(Demolog4j.class.getName());
	
public static void main(String[] args) {
	log.debug("I am debugging");
	log.info("object is present");
	log.error("object is not present");
	log.fatal("this is fatal");
	
	
}
}
