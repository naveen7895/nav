package Logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Sample2 {
	static Logger log=Logger.getLogger(Sample2.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log.info");
		log.info(10+15);
		log.error("hiuhib");

	}

}
