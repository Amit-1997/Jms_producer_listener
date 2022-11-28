package com.rabbitmq.consumer.consumer.Listener;

import com.rabbitmq.consumer.consumer.Config.MQConfig;
import com.rabbitmq.consumer.consumer.customMessage.MessageClass;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @Autowired
    private MessageClass messageClass;
     @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(MessageClass message)
    {
        System.out.println(message.getMessage());
    }
}
