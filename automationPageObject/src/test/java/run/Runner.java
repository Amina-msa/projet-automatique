package run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//les tags depuis le fichier feature
		tags = "@AjoutProduit",
		//le dossier contenant les fichiers features
		features = "src/test/features",
		//les pages contenant les annotations (given, when, then, before ..)
		glue = {"hooks","stepDefinition"},
		publish = true,
		plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-reportJson","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)


public class Runner {

}
