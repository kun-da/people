package org.example.people.service.impl;

import org.example.people.dao.CustomerDao;
import org.example.people.pojo.Customer;
import org.example.people.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerDao.insertCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }
}
