package com.szogibalu.bdd.page_loading;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		features ={"classpath:features/page_loading"},
		glue = {"com.szogibalu.bdd.page_loading.steps"},
		plugin={"pretty",
				"html:target/test-report",
				"json:target/test-report.json",
				"junit:target/test-report.xml"}
)
public class PageLoadingTest {
	
}
