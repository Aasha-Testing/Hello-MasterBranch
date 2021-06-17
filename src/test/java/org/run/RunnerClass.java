package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JVMReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)
@CucumberOptions (features="src\\test\\resources",glue="org.step",dryRun=false,monochrome=true,
strict=true,snippets=SnippetType.CAMELCASE,
plugin= {"html:C:\\Users\\salma\\eclipse-workspace\\Cucumber4.30Batch\\REPORTS\\HTMLReport",
		"json:C:\\Users\\salma\\eclipse-workspace\\Cucumber4.30Batch\\REPORTS\\JSONReport\\reportGenerate.json",
		"junit:C:\\Users\\salma\\eclipse-workspace\\Cucumber4.30Batch\\REPORTS\\JUNITReport\\reportNew.xml",
		"rerun:C:\\Users\\salma\\eclipse-workspace\\Cucumber4.30Batch\\FailedReport\\failures.txt"} )
public class RunnerClass {
	
	@AfterClass
	public static void report() {
		
		JVMReportGeneration.jvmReport(System.getProperty("user.dir")+"\\REPORTS\\JSONReport\\reportGenerate.json");

	}
	
	

}
