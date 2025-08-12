package com.user_forge.user_forge.repositories;

import com.user_forge.user_forge.entities.OrderItem;
import com.user_forge.user_forge.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
