package Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Sample {
	static Logger log=Logger.getLogger(Sample.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info(5+10);
		log.debug("Hi");
		log.error('c');
		log.warn(null);
		log.fatal(args);

	}

}
