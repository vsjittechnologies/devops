package com.medilab.preclinic.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.medilab.preclinic.model.Department;

public interface DepartmentDao {

	List<Department> findAll();
	List<Department> findAllById(Iterable<Integer> ids);

	/**
	 * Returns a reference to the entity with the given identifier. Depending on how the JPA persistence provider is
	 * implemented this is very likely to always return an instance and throw an
	 * {@link javax.persistence.EntityNotFoundException} on first access. Some of them will reject invalid identifiers
	 * immediately.
	 *
	 * @param id must not be {@literal null}.
	 * @return a reference to the entity with the given identifier.
	 * @see EntityManager#getReference(Class, Object) for details on when an exception is thrown.
	 */
	Department getOne(Integer id);
	
	Department findDeptByName(String deptName);
	

	
}
