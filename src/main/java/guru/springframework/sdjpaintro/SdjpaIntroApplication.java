package guru.springframework.sdjpaintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SdjpaIntroApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "local,clean");
        SpringApplication.run(SdjpaIntroApplication.class, args);
    }

}
