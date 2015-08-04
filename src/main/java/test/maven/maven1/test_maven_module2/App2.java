package test.maven.maven1.test_maven_module2;

import test.maven.maven1.test.maven.module4.App4;

/**
 * Hello world!
 *
 */
public class App2 extends App4 {
	
	public String test(String test){
		String test4 = test4("DONE!");
		return test4 + " :: This is TEST = 2 ::" + test;
	}
}
