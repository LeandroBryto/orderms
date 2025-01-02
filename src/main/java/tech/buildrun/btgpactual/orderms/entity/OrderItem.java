package tech.buildrun.btgpactual.orderms.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class OrderItem {

    private String product;
    private Integer quantity;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;
}
