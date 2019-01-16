/**
 * 
 */
/**
 * @author Abhi
 *
 */
package com.vtiger.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="D:/MvnProject/Features"	
	,glue={"com.vtiger.stepDefinition"}
	//, dryRun=true
	  )

public class TestRunner  
{
	
}