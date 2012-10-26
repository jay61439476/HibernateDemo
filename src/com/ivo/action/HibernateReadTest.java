package com.ivo.action;

import java.util.Iterator;

import net.sf.json.JSONObject;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ivo.hibernate.acode.Acode;
import com.ivo.hibernate.acode.AcodeDAO;
import com.ivo.hibernate.acode.AcodeId;
import com.ivo.hibernate.asheet.Asheet;
import com.ivo.hibernate.asheet.AsheetDAO;
import com.ivo.mongo.MongoDBTest;
 
public class HibernateReadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AsheetDAO asheetDAO = new AsheetDAO();
		try{
			// 打开事务
			Session session =  asheetDAO.getSession();
			Transaction tran = session.beginTransaction();
			MongoDBTest mongoDBTest = new MongoDBTest("KTAHIS", "asheet");
			JSONObject jsonObject = new JSONObject();
			
			
			  int total = 0;
			  Iterator<Asheet> categories = 
					  (Iterator<Asheet>)session.createQuery("from Asheet").iterate();
			  while(categories.hasNext()) {
				  Asheet asheet = categories.next();
				  jsonObject = JSONObject.fromObject(asheet);
				  System.out.println("total: " + total + " " +jsonObject.toString());
//				  mongoDBTest.addJson(JSONObject.fromObject(asheet).toString());
				  total++;
			  }
			  mongoDBTest.destory();
			  tran.commit(); 
		}catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			try{
				asheetDAO.getSession().close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
	
	public void acodUnit(){
		AcodeDAO acodeDAO = new AcodeDAO();
		try{
			// 打开事务
			Transaction tran = acodeDAO.getSession().beginTransaction();
			
			AcodeId acodeId = new AcodeId("NWEB","0001","CAT1");
			Acode acode = acodeDAO.findById(acodeId);
			acode.setExt_1("new ext1");
			acodeDAO.attachDirty(acode);
			System.out.println("ext1: " + acode.getExt_1());	
			tran.commit(); 
		}catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			try{
				acodeDAO.getSession().close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void asheetUnit(){
		AsheetDAO asheetDAO = new AsheetDAO();
		try{
			// 打开事务
			Session session =  asheetDAO.getSession();
			Transaction tran = session.beginTransaction();
			MongoDBTest mongoDBTest = new MongoDBTest("KTAHIS", "asheet");
			
			int total = 0;
			  Iterator<Asheet> categories = 
					  (Iterator<Asheet>)session.createQuery("from Category").iterate();
			  while(categories.hasNext()) {
				  Asheet asheet = categories.next();
				  System.out.println("total: " + total);
				  mongoDBTest.addJson(JSONObject.fromObject(asheet).toString());
				  total++;
			  }
			tran.commit(); 
		}catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			try{
				asheetDAO.getSession().close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
 
}
