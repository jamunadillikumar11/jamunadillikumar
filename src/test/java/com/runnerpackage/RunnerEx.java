package com.runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber4\\BDDAutomation\\src\\test\\resources\\Feature", 
glue = "com.pageexecution", 
dryRun = false, 
plugin = {"html:Reports/HtmlReport.html", "json:Reports/JsonReport.json", "rerun: target/Rerun.txt"}, 
tags = "  @Regression ")
public class RunnerEx {

}
