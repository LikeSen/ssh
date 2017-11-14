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
			tx=session.beginTransaction();//��������
			
			session.save(user);
			tx.commit();//�ύ����
			
			
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
			tx=session.beginTransaction();//��������
			
		   User user=(User) session.get(User.class, id);
			tx.commit();//�ύ����
			
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
			tx=session.beginTransaction();//��������
			
			session.delete(id);
			tx.commit();//�ύ����
			
			
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
			tx=session.beginTransaction();//��������
			
			session.update(user);
			tx.commit();//�ύ����
			
			
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
			tx=session.beginTransaction();//��������
			
		List<User> list =session.createQuery("from User").list();
			tx.commit();//�ύ����
			
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
			tx=session.beginTransaction();//��������
			
			List<User> list = session.createQuery(//
					"FROM User")//
					.setFirstResult(firstResult)//
					.setMaxResults(maxResults)//
					.list();

			// ��ѯ�ܼ�¼��
			Long count = (Long) session.createQuery(//
					"SELECT COUNT(*) FROM User")//
					.uniqueResult();
			tx.commit();//�ύ����
			
			return new QueryResult(count.intValue(),list);
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}finally{
			session.close();
			
		}
	}

	
}
