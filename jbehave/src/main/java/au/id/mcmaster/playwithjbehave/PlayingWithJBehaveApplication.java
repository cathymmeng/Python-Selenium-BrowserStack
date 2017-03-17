package au.id.mcmaster.playwithjbehave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PlayingWithJBehaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayingWithJBehaveApplication.class, args);
	}
	
	@RequestMapping("/hi")
	@RestController
	class GreetingEndpoint {

		@RequestMapping(method = RequestMethod.GET)
		String greet() {
			return "Hi there :-)";
		}
	}
}
