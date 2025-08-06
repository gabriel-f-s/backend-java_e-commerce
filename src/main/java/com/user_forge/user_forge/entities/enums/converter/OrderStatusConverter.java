package com.user_forge.user_forge.entities.enums.converter;

import com.user_forge.user_forge.entities.enums.OrderStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class OrderStatusConverter implements AttributeConverter<OrderStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(OrderStatus orderStatus) {
        if (orderStatus == null) {
            return null;
        }
        return orderStatus.getCode();
    }

    @Override
    public OrderStatus convertToEntityAttribute(Integer integer) {
        if (integer == null) {
            return null;
        }
        return OrderStatus.valueOf(integer);
    }
}
