package springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickStart {

	public static void main(String[] args) {
		SpringApplication.run(QuickStart.class, args);
//		sets up default configration
//		starts spring application context
//		performs class path scan(to treate each class as its annotation like @controller , @service)
//		starts tomcat server
	}
}
