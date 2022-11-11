package com.anudip.jpa.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.jpa.config.HibernateUtil;
import com.anudip.jpa.dao.JpaDAO;
import com.anudip.jpa.entity.Employee;
import com.anudip.jpa.entity.Project;

public class JpaDAOimpl implements JpaDAO {

	@Override
	public void emp() {
		try {
			Session sess = HibernateUtil.getSessionFactory().openSession();
			Transaction t = sess.beginTransaction();
			
			Employee e = new Employee();
			Employee e1 = new Employee();
			Employee e2 = new Employee();
			
			e.setEId(101);
			e.setEName("Rajesh Sharma");
			e.setEGender("Male");
			
			e1.setEId(102);
			e1.setEName("Shiv Thakre");
			e1.setEGender("Male");
			
			e2.setEId(103);
			e2.setEName("Priyanka Chaudhary");
			e2.setEGender("Female");
			
			Project p = new Project();
			Project p1 = new Project();
			
			p.setPId(20001);
			p.setPName("Phishing Website Detection");
			p.setPlanguage("Python");
			
			p1.setPId(20002);
			p1.setPName("Library Management System");
			p1.setPlanguage("Java");
			
			List <Employee> list = new ArrayList<Employee>();
			list.add(e);
			list.add(e1);
			list.add(e2);
			
			List<Project> list1 = new ArrayList<Project>();
			list1.add(p);
			list1.add(p1);
			
			e.setProj(list1);
			e1.setProj(list1);
			e2.setProj(list1);
			
			sess.save(e);
			sess.save(e1);
			sess.save(e2);
			sess.save(p);
			sess.save(p1);
			
			t.commit();
			sess.close();
			System.out.println("Done");
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
		
	}

	@Override
	public void proj() {
		try {
			Session sess = HibernateUtil.getSessionFactory().openSession();
			TypedQuery<Employee> query = sess.createQuery("from Employee");
			List<Employee> al = query.getResultList();
			Iterator<Employee> itr = al.iterator();
			while(itr.hasNext()) {
				Employee emp = itr.next();
				System.out.println(emp.getEId()+"   "+emp.getEName()+"  "+emp.getEGender());
			}
			TypedQuery<Project> query1 = sess.createQuery("from Project");
			List<Project> al1 = query1.getResultList();
			Iterator<Project> itr1 = al1.iterator();
			while(itr1.hasNext()) {
				Project proj = itr1.next();
				System.out.println(proj.getPId()+"  "+proj.getPName()+"  "+proj.getPlanguage());
			}
			sess.close();
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}

}
