package cn.itcast.b_dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itcast.a_helloworld.User;

public class UserDao {
	public void save(User user) {
		Session session=HibernateUitls.openSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();//开启事物
			
			session.save(user);
			tx.commit();//提交事物
			
			
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}finally{
			session.close();
			
		}
		
	}
	public User getById(int id) {
		Session session=HibernateUitls.openSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();//开启事物
			
		   User user=(User) session.get(User.class, id);
			tx.commit();//提交事物
			
			return user;
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}finally{
			session.close();
			
		}
	}

	public void delete(int id) {
		Session session=HibernateUitls.openSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();//开启事物
			
			session.delete(id);
			tx.commit();//提交事物
			
			
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}finally{
			session.close();
			
		}
	}

	public void updata(User user) {
		Session session=HibernateUitls.openSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();//开启事物
			
			session.update(user);
			tx.commit();//提交事物
			
			
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}finally{
			session.close();
			
		}
	}

	public List<User> findAll() {
		Session session=HibernateUitls.openSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();//开启事物
			
		List<User> list =session.createQuery("from User").list();
			tx.commit();//提交事物
			
			return list;
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}finally{
			session.close();
			
		}
	}

	public QueryResult findAll(int firstResult, int maxResults) {
		Session session=HibernateUitls.openSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();//开启事物
			
			List<User> list = session.createQuery(//
					"FROM User")//
					.setFirstResult(firstResult)//
					.setMaxResults(maxResults)//
					.list();

			// 查询总记录数
			Long count = (Long) session.createQuery(//
					"SELECT COUNT(*) FROM User")//
					.uniqueResult();
			tx.commit();//提交事物
			
			return new QueryResult(count.intValue(),list);
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}finally{
			session.close();
			
		}
	}

	
}
