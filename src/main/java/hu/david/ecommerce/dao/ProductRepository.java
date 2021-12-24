package hu.david.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.david.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
