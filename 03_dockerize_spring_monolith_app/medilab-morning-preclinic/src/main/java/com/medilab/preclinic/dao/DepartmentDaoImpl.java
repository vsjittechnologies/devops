package com.medilab.preclinic.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.medilab.preclinic.model.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(isolation=Isolation.READ_COMMITTED,
			propagation=Propagation.REQUIRES_NEW)
	@Override
	public Department findDeptByName(String deptName) {
		//SessionFactory sf = entityManager.unwrap(SessionFactory.class);
		//Session session = sf.openSession();
		Session session = entityManager.unwrap(Session.class);
		String query = "from Department d where d.name=:deptName";
		Query<Department> q = session.createQuery(query);
		q.setParameter("deptName", deptName);
		Department dept = q.uniqueResult();
		return dept;
	}

}
