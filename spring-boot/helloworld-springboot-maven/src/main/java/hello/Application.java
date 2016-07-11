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
		
		return "Hello Docker / Openshift World.";
		
		
		//return "Hello Docker / Openshift World !!! \n" + " \n database_db2_dbUrl: " + env.getProperty("database_db2_dbUrl")  
		//       + " \n database_db2_dbPassword: " + env.getProperty("database_db2_dbPassword")  + " \n database_db2_dbPassword1: " 
		//	   + env.getProperty("database_db2_dbPassword1") + " \n database_db2_dbPassword2: " + env.getProperty("database_db2_dbPassword2")
		//	   + " \n db2name: " + env.getProperty("db2name");
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
