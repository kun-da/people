package org.example.people.controller;

import org.example.people.pojo.Customer;
import org.example.people.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String listCustomers(Model model) {
        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customers", customerList);
        return "customer_list";
    }

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable int id, Model model) {
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer", customer);
        return "customer_form";
    }

    @GetMapping("/new")
    public String createCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer_form";
    }

    @PostMapping
    public String saveCustomer(@ModelAttribute Customer customer) {
        if (customer.getId() == 0) {
            customerService.insertCustomer(customer);
        } else {
            customerService.updateCustomer(customer);
        }
        return "redirect:/customers";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }
}
