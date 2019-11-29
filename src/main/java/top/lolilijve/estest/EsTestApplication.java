package top.lolilijve.estest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zxp.esclientrhl.annotation.EnableESTools;

@SpringBootApplication
@EnableESTools
public class EsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsTestApplication.class, args);
    }

}
