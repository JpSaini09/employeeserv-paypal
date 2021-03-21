package com.paypal.bfs.test.employeeserv.repo;

import com.paypal.bfs.test.employeeserv.api.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
}
