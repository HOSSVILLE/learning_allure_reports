package hellocucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import io.cucumber.junit.platform.engine.Constants;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("hellocucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "hellocucumber")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,
                        value = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" )
@ConfigurationParameter(key = Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME,
                        value = "false")
public class RunCucumberTest {
}
