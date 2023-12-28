package testngPrograms;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Reporting {
@Test
public void successTest() {
	System.out.println("this is my success scenario");
	Assert.assertTrue(true);
}

@Test
public void failureTest() {
	System.out.println("this is my failure scenario");
	Assert.assertTrue(false);
}

@Test
public void skippedTest() {
	System.out.println("this is skipped scenario");
}
}
