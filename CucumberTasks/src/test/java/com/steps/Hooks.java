package com.steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.test.BaseClassAdactinHotel;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClassAdactinHotel {
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {

		browserLaunch(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("url"));
		maximize();
		implicityWait(10);
	}

//	@After
//	public void afterScenario(Scenario scenario) {
//		
//		scenario.attach(null, getTitle(), getProjectPath());
//		
//	    closeCurrentWindow();
//	}

}
