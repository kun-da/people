package org.example.people.service;

import org.example.people.pojo.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerByCustomerName(String customerName);

    void insertCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(String customerName);
}
