package org.example.people.dao;

import org.example.people.pojo.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerDao {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int id);
    void insertCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}
