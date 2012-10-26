package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ivo.strategy.UnderscoreNamingStrategy;

public class UnderscoreNamingStrategyTest {

	@Test
	public void test() {

		UnderscoreNamingStrategy us = new UnderscoreNamingStrategy();
		String strTest = us.propertyToColumnName("max_vak");
		String strTest2 = us.propertyToColumnName("maxAk");
		
		System.out.println(strTest + "," + strTest2);
	}

}
