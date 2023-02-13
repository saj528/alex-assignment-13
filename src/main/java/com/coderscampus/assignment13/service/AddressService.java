package com.coderscampus.assignment13.service;

import com.coderscampus.assignment13.domain.Address;
import com.coderscampus.assignment13.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address findById(Long userId) {
       Address address = addressRepository.findAddressByUserId(userId);
       if(address == null){
           address = new Address();
       }
        return  address;
    }

    public void save(Address address) {
        addressRepository.save(address);
    }
}
