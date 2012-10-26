package com.ivo.strategy;

import org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.TableIdentifier;

public class MyStrategy extends DelegatingReverseEngineeringStrategy{
	public MyStrategy(ReverseEngineeringStrategy delegate) {
		super(delegate);
		// TODO Auto-generated constructor stub
	}
	
	public String columnToPropertyName(TableIdentifier table, String columnName) {
		String strProperty =  super.columnToPropertyName(table, columnName);
		return convertPropertyName2(strProperty);
    }
	
	public String tableToClassName(TableIdentifier table){
		String strProperty =  super.tableToClassName(table);
		return convertClassName(strProperty);
	}
	
	public String convertPropertyName(String strProperty){
        StringBuffer buf = new StringBuffer(strProperty.replace('.', '_'));
        for (int i = 1; i < buf.length() - 1; i++){
            if ('_' != buf.charAt(i - 1) && Character.isUpperCase(buf.charAt(i)) && !Character.isUpperCase(buf.charAt(i + 1))){
                buf.insert(i++, '_');
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
	
	public String convertClassName(String strClassName){
		char num[] = strClassName.toCharArray();
		StringBuffer buf = new StringBuffer();
		buf.append(num[0]);
		for (int i = 1; i < num.length; i++) {
			if ( Character.isUpperCase(num[i])||
					Character.isDigit(num[i])) {
				if('.' == num[i - 1] ){
					buf.append(Character.toUpperCase(num[i]));
				}else{
					buf.append('_');
			    	buf.append(Character.toLowerCase(num[i]));
				}
			}else{
				buf.append(num[i]);
			}
		}
		
 
		return buf.toString(); 
	}	
}
