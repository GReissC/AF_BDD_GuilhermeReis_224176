package test.java;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/aluga_carro.feature"
)
public class RunCucumberTest {
}