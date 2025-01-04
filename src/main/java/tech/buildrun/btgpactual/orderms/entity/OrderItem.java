package tech.buildrun.btgpactual.orderms.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
@AllArgsConstructor
@Getter
@Setter
public class OrderItem {

    private String product;
    private Integer quantity;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;

    public OrderItem(Integer quantity, String product, BigDecimal price) {
        this.quantity = quantity;
        this.product = product;
        this.price = price;
    }

}
