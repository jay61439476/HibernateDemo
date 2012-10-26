package com.ivo.strategy;

import org.hibernate.cfg.NamingStrategy;
import org.hibernate.util.StringHelper;

public class UnderscoreNamingStrategy implements NamingStrategy {

    public static final NamingStrategy INSTANCE = new UnderscoreNamingStrategy();;

    public UnderscoreNamingStrategy() {
    }
    
    public String classToTableName(String className) {
        return addUnderscores(StringHelper.unqualify(className));
    }

    public String propertyToColumnName(String propertyName){
//        return addUnderscores(StringHelper.unqualify(propertyName));
    	return "P"+propertyName;
    }

    public String tableName(String tableName){
        return tableName;
    }

    public String columnName(String columnName){
        return columnName;
    }

    public String propertyToTableName(String className, String propertyName){
        return classToTableName(className) + '_' + propertyToColumnName(propertyName);
    }

    private String addUnderscores(String name){
        StringBuffer buf = new StringBuffer(name.replace('.', '_'));
        for (int i = 1; i < buf.length() - 1; i++){
            if ('_' != buf.charAt(i - 1) && Character.isUpperCase(buf.charAt(i)) && !Character.isUpperCase(buf.charAt(i + 1))){
                buf.insert(i++, '_');
            }
        }
        return buf.toString().toLowerCase();
    }

	@Override
	public String collectionTableName(String arg0, String arg1, String arg2,
			String arg3, String arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String foreignKeyColumnName(String arg0, String arg1, String arg2,
			String arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String joinKeyColumnName(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logicalCollectionColumnName(String arg0, String arg1,
			String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logicalCollectionTableName(String arg0, String arg1,
			String arg2, String arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logicalColumnName(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
