package com.webapps.hibernate;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOperations {

	public static void main(String[] args) {
		
		int i=0,j=0;
		while(j==0){
		Session session = null;
		OperationMethods om = new OperationMethods();
		
		try{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		
		session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Enter 1:insert 2:update 3:read 4:delete");
		Scanner sc = new Scanner(System.in);
	
		switch(i=sc.nextInt())
		{
		case 1: om.insert(session);
	
				break;
		case 2: 	
			om.Update(session);
			
				break;
		case 3: om.Read(session);

				break;
		case 4:
			om.Delete(session);
				
				break;
		default: System.out.println("Wrong option entered");
				System.exit(0);
				
		}
		tx.commit();

		} catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try{
			session.flush();
			session.close();
			}catch(Exception e2)
			{
				e2.printStackTrace();
			}
			
		}
		}

	}

}
