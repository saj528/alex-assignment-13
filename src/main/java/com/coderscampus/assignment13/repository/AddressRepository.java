package com.coderscampus.assignment13.repository;

import com.coderscampus.assignment13.domain.Address;
import com.coderscampus.assignment13.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findAddressByUserId(Long userId);

}
