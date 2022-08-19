package mysolution.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mysolution.CustomercenterApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomercenterApplication.class })
public class CucumberSpingConfiguration {}
