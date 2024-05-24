package org.example.people.controller;

import org.example.people.pojo.Customer;
import org.example.people.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.ui.Model;
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public String listCustomers(Model model) {
        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customers", customerList);
        return "customer_list";
    }

    @GetMapping("/customers/{customerName}")
    public String getCustomer(@PathVariable String customerName, Model model) {
        Customer customer = customerService.getCustomerByCustomerName(customerName);
        model.addAttribute("customer", customer);
        return "customer_form";
    }

    @GetMapping("/customers/new")
    public String createCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer_form";
    }

    @PostMapping("/customers")
    public String saveCustomer(@ModelAttribute Customer customer) {
        customerService.insertCustomer(customer);
        return "redirect:/customers";
    }

    @PostMapping("/customers/{customerName}")
    public String updateCustomer(@PathVariable String customerName, @ModelAttribute Customer customer) {
        customerService.updateCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("/customers/delete/{customerName}")
    public String deleteCustomer(@PathVariable String customerName) {
        customerService.deleteCustomer(customerName);
        return "redirect:/customers";
    }
}
