package tech.buildrun.btgpactual.orderms.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import tech.buildrun.btgpactual.orderms.dto.OrderCreatedEvent;

import static tech.buildrun.btgpactual.orderms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;


@Component
public class OrderCreatedListener {

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){


    }
}
