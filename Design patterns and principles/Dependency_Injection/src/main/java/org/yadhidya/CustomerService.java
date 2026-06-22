package org.yadhidya;

public class CustomerService {

    CustomerRepository repo;

    CustomerService(CustomerRepository repo)
    {
        this.repo=repo;
    }

    void findbyId(int id)
    {
        repo.findCustomerById(id);
    }
}
