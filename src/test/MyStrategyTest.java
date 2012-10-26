package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ivo.strategy.MyStrategy;

public class MyStrategyTest {

	@Test
	public void testColumnToPropertyNameTableIdentifierString() {
		String s1 =  convertPropertyName2("codeExt");
		System.out.println(s1+'\n');
		s1 =  convertPropertyName2("ext1");
		System.out.println(s1);
	}
	
	public String convertPropertyName(String strProperty){
        StringBuffer buf = new StringBuffer(strProperty.replace('.', '_'));
        System.out.println("Length of "+strProperty+" is "+ buf.length() );
        for (int i = 1; i < buf.length() - 1; i++){
        	System.out.println(i + " " + buf.charAt(i));
            if ( ('_' != buf.charAt(i - 1) && Character.isUpperCase(buf.charAt(i)) && !Character.isUpperCase(buf.charAt(i + 1)))||
            	Character.isDigit(buf.charAt(i))){
                buf.insert(i++, '_');
                System.out.println(i+" 2: " + buf.charAt(i));
            }
        }
        return buf.toString().toLowerCase();
	}
	
	public String convertPropertyName2(String strProperty){
		char num[] = strProperty.toCharArray();
		StringBuffer buf = new StringBuffer();
		buf.append(num[0]);
		for (int i = 1; i < num.length; i++) {
			if (Character.isUpperCase(num[i])||
					Character.isDigit(num[i])) {
				buf.append('_');
			    buf.append(num[i]);
			}else{
				buf.append(num[i]);
			}
		}
 
		return buf.toString().toLowerCase(); 
	}
	
}
