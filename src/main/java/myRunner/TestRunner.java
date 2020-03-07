package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\kamalraj\\seleniumJavaworksapce\\TestXSSFLogin\\"
			+ "src\\main\\java\\Features\\login.feature",
	glue= {"stepDefinations"},
	format= {"pretty","html:test-output","junit:junit-xml/cucumber.xml","json:json-output/cucumber.json"},
	monochrome=true,
	strict=true,
	dryRun=true
//	tags= {"@RegressionTesting"}
	)
	public class TestRunner {

	}