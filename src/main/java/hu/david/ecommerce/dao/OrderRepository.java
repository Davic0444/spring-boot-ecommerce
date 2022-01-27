package hu.david.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository {
	
	Page<Order> findByCustomerEmail(@Param("email") String email, Pageable pageable);
	
}
