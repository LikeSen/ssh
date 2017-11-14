package com.helloweenvsfei.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {
		try {
			// �� hibernate.cfg.xml �м�������
			sessionFactory = new Configuration().configure(
					"hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}