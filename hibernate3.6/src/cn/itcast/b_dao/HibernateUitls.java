package cn.itcast.b_dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import cn.itcast.a_helloworld.User;
public class HibernateUitls {
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory=new Configuration()
		.configure()
		.buildSessionFactory();
		}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
		
	}
	public static Session openSession(){
		
		return sessionFactory.openSession();
	}
}
