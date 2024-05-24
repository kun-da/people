package org.example.people.dao;

import org.apache.ibatis.annotations.*;
import org.example.people.pojo.Customer;
import java.util.List;

@Mapper
public interface CustomerDao {

    @Select("SELECT * FROM customers")
    List<Customer> getAllCustomers();

    @Select("SELECT * FROM customers WHERE customerName = #{customerName}")
    Customer getCustomerByCustomerName(String customerName);

    @Insert("INSERT INTO customers (customerName, responsiblePerson, project, startDate) " +
            "VALUES (#{customerName}, #{responsiblePerson}, #{project}, #{startDate})")
    void insertCustomer(Customer customer);

    @Update("UPDATE customers SET responsiblePerson = #{responsiblePerson}, " +
            "project = #{project}, startDate = #{startDate} WHERE customerName = #{customerName}")
    void updateCustomer(Customer customer);

    @Delete("DELETE FROM customers WHERE customerName = #{customerName}")
    void deleteCustomer(String customerName);
}

