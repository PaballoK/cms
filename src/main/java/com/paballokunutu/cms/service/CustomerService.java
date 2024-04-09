package com.paballokunutu.cms.service;

import com.paballokunutu.cms.dao.CustomerDAO;
import com.paballokunutu.cms.exception.CustomerNotFoundException;
import com.paballokunutu.cms.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class CustomerService {

    private CustomerDAO customerDAO;


    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer){

//        customer.setCustomerId(customerIdCount);
//        customerList.add(customer);
//        customerList.add(customer);
//        customerIdCount++;
//        return customer;
        return customerDAO.save(customer);
    }

    public List <Customer> getCustomerList(){
        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId){
//        return customerList.stream()
//                .filter(customer -> customer.getCustomerId() == customerId)
//                .findFirst()
//                .get();
        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
        if (!optionalCustomer.isPresent()) throw new CustomerNotFoundException("Customer record is not available");

       return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId,Customer customer){
//        customerList.stream().forEach(c -> {
//            if (c.getCustomerId() == customerId) {
//                c.setCustomerFistName(customer.getCustomerFistName());
//                c.setCustomerLastName(customer.getCustomerLastName());
//                c.setCustomerEmail(customer.getCustomerEmail());
//            }
//        });
//        return customerList.stream().filter(c -> c.getCustomerId() == customerId).findFirst().get();

        customer.setCustomerId(customerId);
        return customerDAO.save(customer);

    }

    public void deleteCustomer(int customerId){
//        customerList.stream()
//                .forEach(customer -> {
//                    if (customer.getCustomerId() == customerId) {
//                        customerList.remove(customer);
//                    }
//                });

        customerDAO.deleteById(customerId);
    }

}
