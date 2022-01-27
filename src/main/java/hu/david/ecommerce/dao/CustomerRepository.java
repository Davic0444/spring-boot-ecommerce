package hu.david.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.david.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}
