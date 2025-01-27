package com.andreidodu.andre_i_test;

import com.andreidodu.andre_i_test.constants.ConfigurationConstants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.*;

@Suite
@IncludeEngines(ConfigurationConstants.TEST_ENGINE)
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = ConfigurationConstants.GLUE_PROPERTY_VALUE)
@ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = ConfigurationConstants.FEATURES_PROPERTY_VALUE)
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = ConfigurationConstants.PLUGIN_PROPERTY_VALUE)
public class CucumberRunnerTest {
}