package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
public class Application {

        @Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String home() {
		
		return "Hello Docker / Openshift World from local env....V2";
		
		
		//return "Hello Docker / Openshift World !!! \n" + " \n db2url: " + env.getProperty("db2url")  
		//	       + " \n mysqlurl: " + env.getProperty("mysqlurl")  + " \n myconfigkey: " 
		//	   + env.getProperty("myconfigkey");
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
