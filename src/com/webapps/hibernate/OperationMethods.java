	package com.webapps.hibernate;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OperationMethods extends HibernateOperations {

	HibernateAnnotations ha = new HibernateAnnotations();

	public void insert(Session session)
	{
		ha.setSID(6666);
		ha.setFNAME("sai");
		ha.setLNAME("Tallapaneni");
		ha.setEMAIL("sai@gmail.com");
		ha.setADDRESS("NJ");
		session.save(ha);		
	}
	
	public void Update(Session session)
	{
		
		HibernateAnnotations ha1 = (HibernateAnnotations)session.get(HibernateAnnotations.class, 3);
		ha1.setADDRESS("peoria");
		session.update(ha1);
		
//		Query query =session.createSQLQuery("update userdata set ADDRESS=:address " + " where SID=:sid");
//		query.setParameter("address", "plainsboro");
//		query.setParameter("sid", 1);
//		query.executeUpdate();
		
	}
	
	public void Read(Session session)
	{
		
	
		List li = session.createQuery("FROM HibernateAnnotations").list(); 
        for (Iterator iterator = 
                          li.iterator(); iterator.hasNext();){
        	HibernateAnnotations hba = (HibernateAnnotations) iterator.next(); 
		
      
			System.out.println("SID:"+hba.getSID());
			System.out.println("FNAME:"+hba.getFNAME());
			System.out.println("LNAME:"+hba.getLNAME());
			System.out.println("EMAIL:"+hba.getEMAIL());
			System.out.println("ADDRESS:"+hba.getADDRESS());
			
		}
	}
	
	public void Delete(Session session)
	{
		HibernateAnnotations ha1 = (HibernateAnnotations)session.get(HibernateAnnotations.class, 5555);
		
		session.delete(ha1);

	}

}
