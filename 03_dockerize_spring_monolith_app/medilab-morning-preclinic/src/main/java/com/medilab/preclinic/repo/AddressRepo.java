/**
 * 
 */
package com.medilab.preclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.medilab.preclinic.model.Address;

/**
 * @author nsanda
 *
 */
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRES_NEW)
public interface AddressRepo extends JpaRepository<Address, Integer> {
	@Query("from Address d where d.address=:address")
	public Address findAddressByName(@Param("address") String address);
}
