package day7Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/DataDrivenFrontAccounting.feature",
glue="stepDefinition", monochrome=true, dryRun=false,
plugin= {"pretty","html:target/tsl949frontAccounting","json:target/JsonReport/report.json"}) //monochrome used to have a better console output that is readable
public class DataDrivenFrontAccountingRunner {

}





//usually any error is given after running so to get error and check if steps amtch we can use dry run
// if dry run is kept true., it will check if every step has matching step definition or not
//monochrome is to format console
//if dryrun is kept false instead of true it will run it instead of checking if steps are matching or not
//json report produces report for server not readable
//hooks is same as before test and aftertest
//allbefore:pre-condition(keeping browser staring process)
//allafter:post-condition(like closing browser)