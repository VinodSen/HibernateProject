package com.vinod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class USERDAO 
{
	public static int register(User u)
	{
		int i = 0;
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		i = (Integer)session.save(u);
		t.commit();
		session.close();
		System.out.println("done");
		return i;
	}
}
