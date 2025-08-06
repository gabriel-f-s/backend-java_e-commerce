package com.user_forge.user_forge.repositories;

import com.user_forge.user_forge.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
