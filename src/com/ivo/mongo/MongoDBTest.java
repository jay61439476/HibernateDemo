package com.ivo.mongo;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

import org.bson.types.ObjectId;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MongoDBTest {
    private Mongo mg = null;
    private DB db;
    private DBCollection collection;
    
    public MongoDBTest(String db, String collection){
    	init(db, collection);
    }
    @Before
    public void init(String dbName, String collectionName) {
        try {
//            mg = new Mongo();
            mg = new Mongo("10.20.53.21",27017);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        //获取temp DB；如果默认没有创建，mongodb会自动创建
        db = mg.getDB(dbName);
        //获取users DBCollection；如果默认没有创建，mongodb会自动创建
        collection = db.getCollection(collectionName);
    }
    
    @After
    public void destory() {
        if (mg != null)
            mg.close();
        mg = null;
        db = null;
        collection = null;
        System.gc();
    }
    
    private void queryAll() {
        print("查询users的所有数据：");
        //db游标
        DBCursor cur = collection.find();
        while (cur.hasNext()) {
            print(cur.next());
        }
        
        print("Total Count: " + collection.count() + '\n');
    }
    
    public void print(Object o) {
        System.out.println(o);
    }
    
    public void addJson(String  strJson){
    	DBObject dbObject = (DBObject)JSON.parse(strJson);
    	collection.insert(dbObject);
    }
	 
	public void test1() {
		queryAll();
		
		DBObject userinfo = new BasicDBObject();
		userinfo.put("name", "zwj");
		userinfo.put("language","java");
		userinfo.put("tools","MyEclipse-2");
		userinfo.put("age", 25);
//		print(users.save(userinfo).getN());
//		queryAll();
		
		List<DBObject> list = new ArrayList<DBObject>();
		list.add(userinfo);
		DBObject userinfoXL = new BasicDBObject("name","xinlin");
		userinfoXL.put("language", "C");
		userinfoXL.put("game", "DOTA");
		list.add(userinfoXL);
		print(collection.insert(list).getN());
		
		
		queryAll();
	}
	
	@Test
	public void remove() {
	    queryAll();
	    print("删除id = 508167cf66d92610a341e246：" 
	    		+ collection.remove(
	    				new BasicDBObject("_id", new ObjectId("508167cf66d92610a341e246"))
	    			).getN());
	    queryAll();
	    print("remove tools = MyEclipse: " 
	    		+ collection.remove(
	    				new BasicDBObject("tools", "MyEclipse")
	    				).getN()
				);
	    queryAll();
	    
	    // print("remove age >= 24: " 
	    //+ users.remove(new BasicDBObject("age", new BasicDBObject("$gte", 24))).getN());
	    //"$gt"： 大于	    "$gte"：大于等于	    "$lt"： 小于	    "$lte"：小于等于	    "$in"： 包含 
	}
	
	
	
	
	
	
	
	
	
	
	
	
    
}
