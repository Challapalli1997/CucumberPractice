package StepDefination;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sriva\\IdeaProjects\\Cucumberpractice" +
        "\\src\\test\\java\\FeatureFile\\Login.feature", glue ={"StepDefination"})






public class TestRunner {
}
