package com.cjc.web.crud.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.web.crud.dao.HomeDao;
import com.cjc.web.crud.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao
{
	@Autowired
	SessionFactory sf;

	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
	}

	@Override
	public void login(String ml, String ps) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Student> q=session.createQuery("from Student where mail='"+ml+"' and pass='"+ps+"'");
		Student s=q.getSingleResult();
		session.close();
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Student> q=session.createQuery("from Student");
		List<Student> l=q.getResultList();
		return l;
	}

	@Override
	public void delete(int r) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query<Student> q=session.createQuery("delete from Student where roll='"+r+"'");
		q.executeUpdate();
		tr.commit();
		session.close();
	}

	@Override
	public Student getSingle(int r) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Student> q=session.createQuery("from Student where roll='"+r+"'");
		Student s=q.getSingleResult();
		q.executeUpdate();
		session.close();
		return s;
	}

	@Override
	public void update(Student s) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query<Student> q=session.createQuery("update Student set name='"+s.getName()+"',mail='"+s.getMail()+"',pass='"+s.getName()+"' where roll='"+s.getRoll()+"'");
		q.executeUpdate();
		tr.commit();
		session.close();
	}

}
