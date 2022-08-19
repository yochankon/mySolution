package mysolution.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mysolution.DeliveryApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryApplication.class })
public class CucumberSpingConfiguration {}
