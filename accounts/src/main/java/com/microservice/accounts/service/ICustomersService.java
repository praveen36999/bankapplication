package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDetailsDto;
import org.springframework.stereotype.Service;


public interface ICustomersService {

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber,String correlationId);
}
