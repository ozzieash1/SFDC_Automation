package runners;

import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)

@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"},
                        features = {"src/test/resources/features" },
                        glue = { "sfdc.automation.steps" },
                        tags = {"@current"},
                        monochrome = true ,
                        dryRun = false)
public class SalesForceRunner {
 //sending to git
    }


// @BeforeClass
/*public static void setup() {
    String reportsOutput = LocalConfUtils.getRootDir() + File.separator + "html-reports";
    EcrmConfUtils.setBaseResultsDir(reportsOutput);*/


//import com.fanniemae.ecrm.automation.libs.EcrmConfUtils;
//import com.fanniemae.testeng.automation.utils.LocalConfUtils;